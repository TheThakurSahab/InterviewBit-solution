Problem Description

Given an integer array A of size N.
You have to find all possible non-empty subsequence of the array of numbers and then, for each subsequence, find the difference between the largest and smallest numbers in that subsequence Then add up all the differences to get the number.

As the number may be large, output the number modulo 1e9 + 7 (1000000007).

NOTE: Subsequence can be non-contiguous.
  
  
public class Solution {
    public int solve(int[] A) {
        Arrays.sort(A);
         int mod = 1000000007;
		        long sumLeft =0;
		        long sumRight = 0;
		        for(int i=0; i<A.length; i++) {
		        	sumLeft =  (sumLeft%mod + (A[i]%mod*(1<<i)%mod)%mod)%mod;
		        }
		        for(int i =0; i<A.length; i++) {
		        	sumRight =  (sumRight%mod + (A[i]%mod*(1<<A.length-i-1)%mod)%mod)%mod;
		        }
		        long ans = (sumLeft - sumRight)%mod;
		        return (((int)ans));
    }
}
