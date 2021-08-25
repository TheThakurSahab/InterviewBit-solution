Problem Description

A items are to be delivered in a circle of size B.

Find the position where the Ath item will be delivered if we start from a given position C.

NOTE: Items are distributed at adjacent positions starting from C.

Problem Constraints
1 <= A, B, C <= 108



public class Solution {
    public int solve(int A, int B, int C) {
        if((A+C-1)%B == 0)
        return B;
        else
        return ((A+C-1)%B);
    }
}
