Problem Description

You are given a n x n 2D matrix A representing an image.

Rotate the image by 90 degrees (clockwise).

You need to do this in place.

Note: If you end up using an additional array, you will only receive partial score.



Problem Constraints
1 <= n <= 1000



Input Format
First argument is a 2D matrix A of integers



Output Format
Return the 2D rotated matrix.
  
  

public class Solution {
    public void solve(ArrayList<ArrayList<Integer>> a) {
    int n = a.size();
    Collections.reverse(a);
        for(int i = 1;i<n;i++){
            for(int j = 0;j<i;j++){
                int temp = a.get(i).get(j);
                a.get(i).set(j,a.get(j).get(i)) ;
                a.get(j).set(i,temp);
            }
        }
    }
}
