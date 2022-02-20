package myHashMap;
import java.util.Arrays;
import java.util.Objects;

public class MyHashMap<K, V> implements Map<K, V> {

    private static final int initialCapacity = 1 << 4; // its always a power of 2
    private Node<K, V>[] nodes;
    private int size = 0;
    private double loadFactor = 0.75;
    private int capacity = initialCapacity;

    public MyHashMap() {
        this(initialCapacity);
    }

    public MyHashMap(int size) {
        this.capacity = size;
        nodes = new Node[size];
    }

    public boolean isEmpty() {
        return (size == 0);
    }
@Override
    public int size() {
        return size;
    }

    public Node[] nodes() {
        return nodes.clone();
    }

    public boolean containsKey(Object k) {
        return get(k) != null;
    }
@Override
    public V get(Object k) {
        if (k == null) {
            return nodes[0].value;
        }
        int pos = hash(k);
        Node<K, V> node = nodes[pos];
        if (node == null) {
            return null;
        }

        while (node.next != null && !Objects.equals(node.key, k)) {
            node = node.next;
        }

        if (Objects.equals(node.key, k)) {
            return node.value;
        }

        return null;
    }

    private int hash(Object k) {
        return Objects.hash(k) % nodes.length;
    }

    public void print() {
        System.out.println(Arrays.toString(nodes));
    }
@Override
    public V put(K k, V v) {
        if (shouldResize()) {
            resize();
        }
        Node node = new Node(k, v, null);
        // handle null case.
        if (k == null) {
            Node nullNode = nodes[0];
            if (nullNode != null) {
                node.next = nullNode;
                nodes[0] = node;
            } else {
                nodes[0] = node;
                size++;
            }
            return v;
        }

        // find the bucket
        int pos = hash(k);
        if (putInternal(node, nodes, pos) != null) {
            size++;
            return v;
        }

        return v;
    }

    private V putInternal(Node<K, V> node, Node[] entries, int pos) {
        Node<K, V> existing = entries[pos];
        if (existing != null) {
            // if key is same, then update the value
            if (Objects.equals(existing.key, node.key)) {
                existing.value = node.value;
            } else {
                System.out.println("Found collision for put for key:: " + node.key + " Value ::" + node.value);
                // insert at the head of next (o(1) operation)
                Node tmp = existing.next;
                node.next = tmp;
                existing.next = node;
            }
        } else {
            entries[pos] = node;
        }

        return node.value;
    }

    private boolean shouldResize() {
        return this.size > Math.ceil((double) this.capacity * this.loadFactor);
    }

    private void resize() {
        capacity = capacity * 2;
        int i = 0;
        Node<K, V>[] oldTable = nodes;
        // reset current state
        nodes = new Node[capacity];
        Arrays.fill(nodes, null);
        size = 0;
        for (Node<K, V> node : oldTable) {
            // we need to read the nodes again
            // and insert it back, as bucket size increased
            // there should be a chance to reduce collision with new size
            // as long as no poor equals and hashcode
            Node<K, V> tmp = node;
            if (tmp != null) {
                while (tmp != null) {
                    put(tmp.key, tmp.value);
                    tmp = tmp.next;
                }

            }
        }
        System.out.println("Done Resize, New Capacity ::"+ capacity);
    }
@Override
    public V remove(Object k) {
        int pos = hash(k);
        Node<K, V> node = nodes[pos];
        if(node == null) return null;

        if (Objects.equals(node.key, k)) {

            // if deleted node as nodes on it, lets give them a chance to re insert it back
            if(node.next != null) {
                Node<K,V> tmp = node.next;
                while(tmp != null) {
                    put(tmp.key, tmp.value);
                    tmp = tmp.next;
                }
            }
            // mark current bukcet pos null as head is deleted now
            nodes[pos] = null;
            size--;
            return node.value;
        }
        // collision state, so we need find and delete and reattach nodes
        Node<K, V> head = node.next;
        Node<K, V> parent = node;
        // 1 [2,3,4]
        while (head != null) {
            if (Objects.equals(head.key, k)) {
                // re attach nodes
                parent.next = head.next;
                size--;
                return head.value;
            }
            parent = head;
            head = head.next;
        }

        return null;
    }
    void clear(){
        for(int i = 0; i< nodes.length-1; i++ ){
            nodes[i]=null;
            size=0;

        }
    }


}

class Node<K, V> {
    K key;
    V value;
    Node<K, V> next;

    public Node(K key, V value, Node<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;

        }

        if (!(o instanceof Node)) {
            return false;
        }

        Node e = (Node) o;
        return Objects.equals(e.key, this.key)
                && Objects.equals(e.value, this.value);
    }

    @Override
    public String toString() {
        return "Entry{" +
                "key=" + key +
                ", value=" + value +
                ", next=" + next +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.key, this.value);
    }
}