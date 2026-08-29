class Solution {

    public String encode(List<String> strs) {
        String res = "";
        for(String str: strs) {
            res += str.length() + "#" + str;
        }
        return res;
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            int j = i;
            while(str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            res.add(str.substring(j+1, j+length+1));
            i = j+length+1;
        }
        return res;
    }
}
