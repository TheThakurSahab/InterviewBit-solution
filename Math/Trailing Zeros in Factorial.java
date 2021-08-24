Problem Description

Given an integer A, return the number of trailing zeroes in A!.

Note: Your solution should be in logarithmic time complexity.


**Problem Constraints**
1 <= A <= 10000


**Input Format**
First and only argumment is integer A.


**Output Format**
Return an integer, the answer to the problem.

  
  
  
public class Solution {
    public int trailingZeroes(int A) {
        int ans=0;
        while(A>=5){
            ans =ans+A/5;
            A=A/5;
        }
        return ans;
    }
}
