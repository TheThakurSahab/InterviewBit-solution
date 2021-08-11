Problem Description

Given two binary strings, return their sum (also a binary string).
Example:

a = "100"

b = "11"
Return a + b = "111".
  
  
  
public class Solution {
    public String addBinary(String a, String b) {
        StringBuffer sb = new StringBuffer();
        int i = a.length()-1;
        int j = b.length()-1;
        int sum = 0;
        while(i>=0 || j>=0){
        	if(j>=0) sum += b.charAt(j--) -'0';
        	if(i>=0) sum += a.charAt(i--) -'0';
        	sb.append(sum%2);
        	sum/=2;
        }
        if(sum!=0)sb.append(sum);
        return sb.reverse().toString();
    }
}
