class Node {
    int key;
    int value;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class MyHashMap {
    private final int SIZE = 10_000;
    private LinkedList<Node>[] storage;

    public MyHashMap() {
        storage = new LinkedList[SIZE];
        for(int i = 0; i < SIZE; i++) {
            storage[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }
    
    public void put(int key, int value) {
        int idx = hash(key);
        for(Node node: storage[idx]) {
            if(node.key == key) {
                node.value = value;
                return;
            }
        }
        storage[idx].add(new Node(key, value));
    }
    
    public int get(int key) {
        int idx = hash(key);
        for(Node node: storage[idx]) {
            if(node.key == key) {
                return node.value;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        int idx = hash(key);
        for(Node node: storage[idx]) {
            if(node.key == key) {
                storage[idx].remove(node);
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