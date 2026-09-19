class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] blocks = new HashSet[9];
        for(int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            blocks[i] = new HashSet<>();
        }
        for(int row = 0; row < 9; row++) {
            for(int col = 0; col < 9; col++) {
                char value = board[row][col];
                if(value == '.') {
                    continue;
                }
                int boxIdx = row/3 * 3 + col/3;
                if(!rows[row].add(value) || !cols[col].add(value) || !blocks[boxIdx].add(value)) {
                    return false;
                }
            }
        }
        return true;
    }
}
