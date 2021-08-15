Problem Description

Given a string A. Find the rank of the string amongst its permutations sorted lexicographically.
Assume that no characters are repeated.

Note: The answer might not fit in an integer, so return your answer % 1000003



Problem Constraints
1 <= |A| <= 1000



Input Format
First argument is a string A.



Output Format
Return an integer denoting the rank of the given string.
  
  
  
  
public class Solution {
    private int mod = 1000003;
    public int fact(int n) {
        if(n == 0 || n == 1)
            return 1;
        else
            return (n * fact(n - 1)) % mod;
    }
    public int findRank(String A) {
        int ans = 0;
        int n = A.length();
        for(int i = 0; i < n - 1; i++) {
            int count = 0;
            for(int j = i+1; j < n; j++)
                if(A.charAt(j) < A.charAt(i))
                    count++;
               
            ans += (count * fact(n - i - 1)) % mod;
        }
        return (ans + 1) % mod;        
    }
}
