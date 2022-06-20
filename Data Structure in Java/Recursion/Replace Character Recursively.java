
public class Solution {

	public static String replaceCharacter(String input, char c1, char c2) {
		int len=input.length();
        String str="";
        if(len==0) {
            return input;
        }
        if(input.charAt(0)==c1) {
            str = c2 + replaceCharacter(input.substring(1,len),c1,c2);
            return str;
        }
        str= input.charAt(0) + replaceCharacter(input.substring(1,len),c1,c2);
        return str;

	}
}
