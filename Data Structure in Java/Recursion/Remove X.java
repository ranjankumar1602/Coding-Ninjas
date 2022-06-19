
public class solution {

	// Return the changed string
	public static String removeX(String input){
		
        if(input.length()==0) {
            return input;
        }
        if(input.charAt(0)!='x') {
            return input.charAt(0) + removeX(input.substring(1,input.length()));
        }
        
        
        return removeX(input.substring(1,input.length()));

	}
}
