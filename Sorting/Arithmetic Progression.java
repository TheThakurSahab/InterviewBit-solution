Problem Description

Given an integer array A of size N. Return 1 if the array can be rearranged to form an arithmetic progression, otherwise, return 0.

A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
  
  
public class Solution {
    public int solve(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        int size = A.length, firstMin = Integer.MAX_VALUE, secMin = Integer.MAX_VALUE, diff = 0;
        for(int x:A){
            set.add(x);
        }
        for(int i : A){
            if (i<firstMin){
                secMin = firstMin;
                firstMin = i;
            }else if (i != firstMin && i < secMin)
            secMin = i;
        }
        diff = secMin-firstMin;
        for(int j=0; j<size; j++){
            if(set.contains(firstMin+diff*j))
            continue;
            else 
            return 0;
        }
        return 1;
    }
}


Time Complexity: O(n)
