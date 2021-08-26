Problem Description

Given 2 non negative integers A and B, find gcd(A, B)

GCD of 2 integers A and B is defined as the greatest integer g such that g is a divisor of both A and B. Both A and B fit in a 32 bit signed integer.

Note: DO NOT USE LIBRARY FUNCTIONS.
  
  
  

public class Solution {
    public int gcd(int A, int B) {
        return (B==0)?A:gcd(B, A%B);
    }
}
