Problem Description

A city is of rectangular shape with the size A * B meters. On the occasion of the city's anniversary, a decision was taken to pave the city with square 
  granite flagstones. Each flagstone is of the size C * C. What is the least number of flagstones needed to pave the city?

NOTE: It's allowed to cover the surface larger than the city, but the city has to be covered. It's not allowed to break the flagstones. 
  The sides of flagstones should be parallel to the sides of the city.
  
  
public class Solution {
    public int solve(int n, int m, int a) {
        int d1,d2 = 0;
        d1 = n/a + ((n%a == 0)? 0:1);
        d2 = m/a + ((m%a == 0)? 0:1);
        return d1*d2;
    }
}

