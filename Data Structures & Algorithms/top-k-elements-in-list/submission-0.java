class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer>[] arr = new ArrayList[nums.length+1];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            arr[entry.getValue()].add(entry.getKey());
        }
        int[] res = new int[k];
        int a = 0;
        for(int i = arr.length-1; i >= 0; i--) {
            for(int j = 0; j < arr[i].size(); j++) {
                if(k == 0) break;
                res[a++] = arr[i].get(j);
                k--;
            }
        }
        return res;
    }
}
