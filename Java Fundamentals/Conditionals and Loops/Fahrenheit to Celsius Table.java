import java.util.*;
public class Solution {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int S=sc.nextInt();
        int E=sc.nextInt();
        int W=sc.nextInt();
        int celsius=0;
        
             while(S<=E){
            	celsius=((S-32)*5)/9;
            	System.out.println(S+" "+celsius);
            	S+=W;
        	}
        
		
	}

}
