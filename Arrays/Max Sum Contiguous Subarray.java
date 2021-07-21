Find the contiguous subarray within an array, A of length N which has the largest sum.

Input Format:

The first and the only argument contains an integer array, A.
Output Format:

Return an integer representing the maximum possible sum of the contiguous subarray.
Constraints:

1 <= N <= 1e6
-1000 <= A[i] <= 1000
For example:

Input 1:
    A = [1, 2, 3, 4, -10]

Output 1:
    10

Explanation 1:
    The subarray [1, 2, 3, 4] has the maximum possible sum of 10.

      
 public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        int maxTillEnd=0;
        int maxSoFar=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            maxTillEnd=maxTillEnd+A[i];
            if(maxTillEnd<A[i]){
                maxTillEnd=A[i];
            }
            if(maxSoFar<maxTillEnd){
                maxSoFar=maxTillEnd;
            }
        }
    return maxSoFar;
    }
}
