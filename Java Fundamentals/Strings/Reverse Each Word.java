
public class Solution {

	public static String reverseEachWord(String str) {
        String rev = "";
        int start = 0;
        String finalAns = "";
        int length = str.length();
        for(int i = 0; i<length; i++){
            if (str.charAt(i) == ' '){
                for(int j =start; j<i; j++){
                    rev = str.charAt(j) + rev;
                }
            	start = i;
        	}else if (i==length-1){
                for(int j = start; j<length; j++){
                    rev = str.charAt(j) +rev;
                }
            }
        }
         int space = rev.length();
        for(int i = rev.length()-1; i>=0;i--){
            if (i==0){
                finalAns = finalAns+rev.substring(0,space);
            }
            
            else if(rev.charAt(i)== ' '){
                finalAns = finalAns+rev.substring(i+1,space)+" ";
                space = i;
            }
        }
        
        return finalAns;
	}

}
