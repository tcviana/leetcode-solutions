// https://leetcode.com/problems/valid-sudoku

class Solution {
    private Set<Character> row = new HashSet<>();
    private Set<Character> col = new HashSet<>();
    private Set<Character> block = new HashSet<>();

    public boolean isValidSudoku(char[][] board) {

        for (int row=0; row<9; row++) {

            this.row.clear();
            this.col.clear();

            for (int col=0; col<9; col++) {

                if (validRow(board[row][col]) && validCol(board[col][row]))
                    continue;
                else
                    return false;

            }
        }

        return true;
    }

    private boolean hasNumber(char value) {
        return value != '.';
    }

    private boolean validRow(char value) {
        if (hasNumber(value)) 
          return row.add(value);
        return true;        
    }

    private boolean validCol(char value) {
        if (hasNumber(value)) 
          return col.add(value);
        return true;        
    }
}
