
public class solution {

	public static int convertStringToInt(String input){
		// Write your code here
        int len= input.length();
        int ans=0;
        if(len==1) {
            int c= input.charAt(0);
            return c-48;
        }
        int d=input.charAt(0);
        int f=d-48;
        ans=convertStringToInt(input.substring(1,len));
        return f * (int)Math.pow(10,len-1) +ans;

	}
}
