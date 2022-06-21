public class Solution {

	public static boolean checkAB(String input) {
		// Write your code here
        int length=input.length();
        if(length==0) {
            return true;
        }
        
        boolean smallAns = false;
        
        if(length==1) {
            if(input.charAt(0)=='a') {
                smallAns=true;
                input=input.substring(1);
            }
        }else if(length==2) {
            if(input.charAt(0)=='a' && input.charAt(1)=='a') {
                smallAns=true;
                input=input.substring(2);
            }
        }else if(length>=3) {
            if(input.charAt(0)=='a' && input.substring(1,3).equals("bb")){
                smallAns = true;
                input = input.substring(3);
            }
            
            else if(input.charAt(0)=='a' && input.charAt(1)=='a'){
                smallAns = true;
                input = input.substring(1);
            }
        }
        
        return smallAns && checkAB(input);

	}
}
