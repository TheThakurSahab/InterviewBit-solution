Determine if a Sudoku is valid, according to: http://sudoku.com.au/TheRules.aspx

The Sudoku board could be partially filled, where empty cells are filled with the character '.'.



The input corresponding to the above configuration :

["53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"]
A partially filled sudoku which is valid.

 Note:
A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
Return 0 / 1 ( 0 for false, 1 for true ) for this problem


public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int isValidSudoku(final String[] A) {
        HashSet<String> h=new HashSet<>();
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length();j++){
                char c=A[i].charAt(j);
                if(c!='.'){
                    if(!h.add(c+"found row"+i ) || !h.add(c+"found col"+j )
                    || !h.add(c+"found box"+i/3+" "+j/3 ) ){
                        return 0;
                    }
                }
            }
        }
        return 1;
    }
}
