class MyHashSet {
    private final int SIZE = 10000;
    private LinkedList<Integer>[] storage;

    public MyHashSet() {
        storage = new LinkedList[SIZE];
        for(int i = 0; i < SIZE; i++) {
            storage[i] = new LinkedList<>();
        }
    }

    public int hash(int key) {
        return key % SIZE;
    }
    
    public void add(int key) {
        int idx = hash(key);
        if(!storage[idx].contains(key)) {
            storage[idx].add(key);
        }
    }
    
    public void remove(int key) {
        int idx = hash(key);
        storage[idx].remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        int idx = hash(key);
        return storage[idx].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */