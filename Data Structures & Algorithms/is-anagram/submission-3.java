class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] charFreqs = new int[26];
        for(int i = 0; i < s.length(); i++) {
            charFreqs[s.charAt(i) - 'a']++;
            charFreqs[t.charAt(i) - 'a']--;
        }
        for(int charFreq: charFreqs) {
            if(charFreq != 0) return false;
        }
        return true;
    }
}
