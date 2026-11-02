class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs) {
            int[] freqCount = new int[26];
            for(int i = 0; i < str.length(); i++) {
                freqCount[str.charAt(i) - 'a']++;
            }
            String key = Arrays.toString(freqCount);
            if(map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(List<String> list: map.values()) {
            res.add(list);
        }
        return res;
    }
}
