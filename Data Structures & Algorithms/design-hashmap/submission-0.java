class Node {
    int key;
    int value;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class MyHashMap {
    private static final int SIZE = 10_000;
    private LinkedList<Node>[] buckets;

    public MyHashMap() {
        buckets = new LinkedList[SIZE];
        for(int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<Node>();
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }
    
    public void put(int key, int value) {
        int idx = hash(key);
        for(Node node: buckets[idx]) {
            if(node.key == key) {
                node.value = value;
                return;
            }
        }
        buckets[idx].add(new Node(key, value));
    }
    
    public int get(int key) {
        int idx = hash(key);
        for(Node node: buckets[idx]) {
            if(node.key == key) {
                return node.value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int idx = hash(key);
        for(Node node: buckets[idx]) {
            if(node.key == key) {
                buckets[idx].remove(node);
                return;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */