public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
		String str="";
        int length=s.length();
        if(length==1) {
            return s;
        }
        if(s.charAt(0)!=s.charAt(1)) {
            str=s.charAt(0) + removeConsecutiveDuplicates(s.substring(1,length));
            return str;
        }
        str=removeConsecutiveDuplicates(s.substring(1,length));
        return str;

	}

}
