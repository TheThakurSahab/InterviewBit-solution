Problem Description

You are given a function isalpha() consisting of a character array A.

Return 1 if all the characters of the character array are alphabetical (a-z and A-Z), else return 0.


public class Solution {
    public int solve(char[] A) {
        for(int i=0;i<A.length;i++){
            if((A[i]>='a' && A[i]<='z') || (A[i]>='A' && A[i]<='Z'))
                continue;
            else 
                return 0;
        }
        return 1;
    }
}
