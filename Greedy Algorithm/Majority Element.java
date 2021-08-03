Problem Description

Given an array of size n, find the majority element. The majority element is the element that appears more than floor(n/2) times.
You may assume that the array is non-empty and the majority element always exist in the array.

Example :

Input : [2, 1, 2]
Return  : 2 which occurs 2 times which is greater than 3/2.
  

Solution Approach: As number of elemnts would be more than n/2 if the element is mejority element, 
so think of an approach where each me elent cancel out the non-me element you at the end you'll be 
  left with atleast one element and that element would be mejority element
  
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int majorityElement(final int[] A) {
        int count=0, me=0;
        for(int num:A){
            if(count==0)
                me = num;
            if(num!=me)
                count--;
            else
                count++;
        }
        return me;
    }
}
