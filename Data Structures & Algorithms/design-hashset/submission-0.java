class MyHashSet {
    private static final int SIZE = 10_000;
    private ArrayList<Integer>[] buckets;

    public MyHashSet() {
        buckets = new ArrayList[SIZE];
        for(int i = 0; i < SIZE; i++) {
            buckets[i] = new ArrayList<>();
        }
    }

    public int hash(int key) {
        return key % SIZE;
    }
    
    public void add(int key) {
        int idx = hash(key);
        if(!buckets[idx].contains(key)) {
            buckets[idx].add(key);
        }
    }
    
    public void remove(int key) {
        int idx = hash(key);
        buckets[idx].remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        int idx = hash(key);
        return buckets[idx].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */