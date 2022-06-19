
public class Solution {

	public static String removeConsecutiveDuplicates(String str) {
		String str1="";
        int temp=Integer.MIN_VALUE;
        int length=str.length();
        for(int i = 0; i<length; i++){
            if (temp!=(int)str.charAt(i)){
                str1 = str1 +str.charAt(i);
                temp = (int)str.charAt(i);
            }
        }
        
        return str1;
	}

}
