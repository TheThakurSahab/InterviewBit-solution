Given an unsorted integer array, find the first missing positive integer.

Example:

Given [1,2,0] return 3,

[3,4,-1,1] return 2,

[-8, -7, -6] returns 1

Your algorithm should run in O(n) time and use constant space.


public class Solution {
    public int firstMissingPositive(int[] A) {
        int n = A.length;
        int temp=0;
        for(int i=0;i<n;i++){
            if(A[i]>0 && A[i]<n+1){
                if(A[A[i]-1] == A[i]) continue;
                if(A[A[i]-1] >0 && A[A[i]-1] < n+1){
                    temp=A[A[i]-1];
                    A[A[i]-1]=A[i];
                    A[i]=temp;
                    i--;
                }else{
        A[A[i]-1]=A[i];
        }
        }
    }
    for(int i=0;i<n;i++){
        if(A[i]!=i+1) return i+1;
    }
    return n+1;
}
}
