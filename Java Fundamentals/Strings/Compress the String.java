public class Solution {
	public static String getCompressedString(String str) {
		String str1="";
        int len = str.length();
        for(int i = 0; i<len; i++){
            
            int count = 1;
        
        	while(i<len-1 && str.charAt(i) == str.charAt(i+1)){
            	count++;
            	i++;
        	}
            
            str1 += str.charAt(i);
        
        	if (count>1){
            	str1 += count;
        	}
    	}
        
        return str1;
	}

}
