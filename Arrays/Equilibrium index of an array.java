Problem Description

You are given an array A of integers of size N.

Your task is to find the equilibrium index of the given array

Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

NOTE:

Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.

public class Solution {
    public int solve(int[] A) {
        int sum=0, leftSum=0;
        for(int i=0;i<A.length;i++){
            sum = sum + A[i];
        }
        for (int i = 0; i < A.length; ++i){
            sum -= A[i]; // sum is now right sum for index i
            if (leftSum == sum)
            return i;
            leftSum += A[i];    
        }
        return -1;
    }
}
