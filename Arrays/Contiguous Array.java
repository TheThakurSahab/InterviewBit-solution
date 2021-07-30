Given an array of integers A consisting of only 0 and 1.

Find the maximum length of a contiguous subarray with equal number of 0 and 1.



Input Format

The only argument given is the integer array A.
  
Output Format

Return the maximum length of a contiguous subarray with equal number of 0 and 1.
  
 
 public class Solution {
    public int solve(int[] A) {
        int sum=0, dif=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            if(A[i]==0) A[i] = -1;
        }
        int[] prefix = new int[A.length];
        for(int j=0;j<prefix.length;j++){
            sum = sum + A[j];
            prefix[j] = sum;
        }
        HashMap<Integer, Integer> hash = new HashMap<>();
        hash.put(0,-1);
        for(int k=0;k<prefix.length;k++){
            if(hash.containsKey(prefix[k])){
                int prev_value=hash.get(prefix[k]);
                int new_value=k;
                int tmp=new_value-prev_value;
                dif=Math.max(dif,tmp);
                }
                else hash.put(prefix[k],k);
        }
        return dif>0?dif:0;
    }
}
