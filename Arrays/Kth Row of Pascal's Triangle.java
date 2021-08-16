Problem Description

Given an index k, return the kth row of the Pascal's triangle.
Pascal's triangle: To generate A[C] in row R, sum up A'[C] and A'[C-1] from previous row R - 1.

Example:

Input : k = 3


Return : [1,3,3,1]



public class Solution {
    public ArrayList<Integer> getRow(int A) {
        ArrayList<Integer> res = new ArrayList<Integer>();
       res.add(1);
       for (int i = 1; i <= A; i++) {
           res.add(i, (res.get(i - 1) * (A - i + 1)) / (i));
       }
       return res;
    }
}
