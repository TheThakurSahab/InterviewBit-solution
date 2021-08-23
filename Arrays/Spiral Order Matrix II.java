Problem Description

Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order.



Problem Constraints
1 <= A <= 1000



Input Format
First and only argument is integer A


Output Format
Return a 2-D matrix which consists of the elements in spiral order.


public class Solution {
    public int[][] generateMatrix(int A) {
    int[][] ret = new int[A][A];
	int left = 0,top = 0;
	int right = A -1,down = A - 1;
	int count = 1;
	while (left <= right) {
		for (int j = left; j <= right; j ++) {
			ret[top][j] = count++;
		}
		top ++;
		for (int i = top; i <= down; i ++) {
			ret[i][right] = count ++;
		}
		right --;
		for (int j = right; j >= left; j --) {
			ret[down][j] = count ++;
		}
		down --;
		for (int i = down; i >= top; i --) {
			ret[i][left] = count ++;
		}
		left ++;
	}
	return ret;
    }
}
