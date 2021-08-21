Problem Description

A hotel manager has to process N advance bookings of rooms for the next season. His hotel has K rooms.

Bookings contain an arrival date and a departure date.

He wants to find out whether there are enough rooms in the hotel to satisfy the demand.

Write a program that solves this problem in time O(N log N) .
  
  

public class Solution {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        Collections.sort(arrive);
        Collections.sort(depart);
        for(int i = 0 ; i < arrive.size() ; i++ )
        {
            if(arrive.get(i) >depart.get(0))
                depart.remove(0);
        }
        return depart.size()<=K ? true : false ;
    }
}
