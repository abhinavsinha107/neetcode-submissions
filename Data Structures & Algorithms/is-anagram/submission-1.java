class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] charCounts = new int[26];

        for(int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 97]++;
            charCounts[t.charAt(i) - 97]--;
        }

        for(int num: charCounts) {
            if(num != 0) return false;
        }

        return true;
    }
}
