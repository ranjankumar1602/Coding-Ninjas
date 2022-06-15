
public class solution {

	public static boolean isStringPalindrome(String input) {
		// Base case
        if(input.length()<=1) {
            return true;
        }else if(input.charAt(0)!=input.charAt(input.length()-1)) {
            return false;
        }
        return isStringPalindrome(input.substring(1,input.length()-1));

	}
}
