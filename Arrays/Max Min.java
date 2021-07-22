Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.

NOTE: You should make minimum number of comparisons.
  
  
  
public class Solution {
    public int solve(int[] A) {
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            if(A[i]<min){
                min = A[i];
            } if(A[i]>max){
                max = A[i];
            }
        }
        int sum =min+max;
        return sum;
    }
}
