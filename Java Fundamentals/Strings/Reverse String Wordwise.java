public class Solution {
	public static String reverseWordWise(String input) {
		String str="";
        int space=input.length();
        for(int i=input.length()-1;i>=0;i--) {
            if(i==0) {
                str=str+ input.substring(0,space);
            }else if(input.charAt(i)==' ') {
                 str = str +input.substring(i+1,space)+" ";
                space=i;
            }
        }
        return str;

	}
}
