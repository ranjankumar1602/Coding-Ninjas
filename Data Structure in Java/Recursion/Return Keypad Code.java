public class solution {

	// Return a string array that contains all the possible strings
	public static String[] keypad(int n){
		if(n==0) {
            String str[]={""};
            return str;
        }
        String smallAns[]=keypad(n/10);
        String options[]=helper(n%10);
        String str[]=new String[smallAns.length * options.length];
        int k=0;
        for(int i=0;i<smallAns.length;i++) {
            for(int j=0;j<options.length;j++) {
                str[k]=smallAns[i] + options[j];
                k++;
            }
        }
        return str;

	}
    
    private static String[] helper(int n) {
        if(n==0 || n==1) {
            String str[]={""};
            return str;
        }else if(n==2) {
            String str[]={"a","b","c"};
            return str;
        }else if(n==3) {
            String str[]={"d","e","f"};
            return str;
        }else if(n==4) {
            String str[]={"g","h","i"};
            return str;
        }else if(n==5) {
            String str[]={"j","k","l"};
            return str;
        }else if(n==6) {
            String str[]={"m","n","o"};
            return str;
        }else if(n==7) {
            String str[]={"p","q","r","s"};
            return str;
        }else if(n==8) {
            String str[]={"t","u","v"};
            return str;
        }else if(n==9) {
            String str[]={"w","x","y","z"};
            return str;
        }
        return null;
    }
	
}
