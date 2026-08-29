class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs) {
            int[] freqCount = new int[26];
            for(int i = 0; i < str.length(); i++) {
                freqCount[str.charAt(i) - 'a']++;
            }
            String identifier = Arrays.toString(freqCount);
            if(map.containsKey(identifier)) {
                map.get(identifier).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(identifier, list);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(List<String> list: map.values()) {
            res.add(list);
        }
        return res;
    }
}
