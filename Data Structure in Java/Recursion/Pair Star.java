
public class solution {

	// Return the updated string
	public static String addStars(String s) {
		String str="";
        int len=s.length();
        if(len<=1) {
            return s;
            
        }
        if(s.charAt(0)==s.charAt(1)) {
            str=s.charAt(0) + "*" + addStars(s.substring(1,len));
            return str;
        }
        
        str=s.charAt(0) + addStars(s.substring(1,len));
        return str;

	}
}
