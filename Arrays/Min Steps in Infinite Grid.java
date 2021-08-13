Problem Description

You are in an infinite 2D grid where you can move in any of the 8 directions

 (x,y) to 
    (x-1, y-1), 
    (x-1, y)  , 
    (x-1, y+1), 
    (x  , y-1),
    (x  , y+1), 
    (x+1, y-1), 
    (x+1, y)  , 
    (x+1, y+1) 
You are given a sequence of points and the order in which you need to cover the points.. Give the minimum number of steps in which you can achieve it. You start from the first point.

NOTE: This question is intentionally left slightly vague. Clarify the question by trying out a few cases in the “See Expected Output” section.


public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
     int points = 0;
        for (int i = 0; i < A.size() - 1; i ++) {
            int a = A.get(i);
            int b = B.get(i);
            int c = A.get(i + 1);
            int d = B.get(i + 1);
            points += steps(a, b, c, d);
        }
        return points;
    }

    private int steps(int a, int b, int c, int d) {
        int hStep = c - a;
        int vStep = d - b;
        int hStepAbs = Math.abs(hStep);
        int vStepAbs = Math.abs(vStep);
        return Math.max(hStepAbs, vStepAbs);
    }
}
