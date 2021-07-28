Problem Description

Give a N*N square matrix, return an array of its anti-diagonals. Look at the example for more details.
Example:

Input:

1 2 3
4 5 6
7 8 9
Return the following:
[ 
  [1],
  [2, 4],
  [3, 5, 7],
  [6, 8],
  [9]
]


Input: 
1 2
3 4
Return the following: 
[
  [1],
  [2, 3],
  [4]
]



public class Solution {
    public int[][] diagonal(int[][] A) {
        int len = A.length;
        int[][] antidiag=new int[2*len-1][];
        for(int i=0;i<(len);i++){
            if(i==len-1){
            antidiag[i]=new int[len];
            continue;
            }
            antidiag[i]=new int[(i+1)%len];
            antidiag[2*len-2-i]=new int[(i+1)%len];
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if((i+j)<len){
                    antidiag[i+j][i]=A[i][j];
                }
                if ((i+j)>=len){
                    antidiag[i+j][Math.abs(j+1-len)]=A[i][j];
                    }
            }
        }
        return antidiag;
    }
}
