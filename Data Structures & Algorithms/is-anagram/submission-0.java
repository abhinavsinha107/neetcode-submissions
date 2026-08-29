class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        
        Map<Character, Integer> map = new HashMap<>();

        for(char c: str1) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c: str2) {
            if(!map.containsKey(c)) return false;
            map.put(c, map.getOrDefault(c, 0) - 1);
            if(map.get(c) == -1) return false;
        }

        return true;
    }
}
