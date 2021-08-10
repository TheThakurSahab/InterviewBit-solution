Problem Description

Given a column title A as appears in an Excel sheet, return its corresponding column number.



Problem Constraints
1 <= |A| <= 100



Input Format
First and only argument is string A.



Output Format
Return an integer


public class Solution {
    public int titleToNumber(String A) {
        int ans =0;
        for(int i=0;i<A.length();i++){
            ans*=26;
            ans += A.charAt(i)-'A'+1;
        }
        return ans;
    }
}
