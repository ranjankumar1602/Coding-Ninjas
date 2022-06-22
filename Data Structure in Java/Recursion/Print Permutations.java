public class Solution {
    
    private static void FindPermutations(String str,String output) {
        if (str.length() == 0) {
            System.out.println(output + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            String ans = str.substring(0, i) + str.substring(i + 1);
            
            FindPermutations(ans, output + ch);
        }
        
    }

	public static void FindPermutations(String str) {
		// Write your code here
        FindPermutations(str,"");

	}
}
