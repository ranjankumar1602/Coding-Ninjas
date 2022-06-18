import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       int N=sc.nextInt();
	   int ct=0,i=1,j=1;  
        while(N!=0) {  
            j=1;  
            ct=0;  
            while(j<=i) {  
                if(i%j==0)  
                    ct++;  
                j++;   
            }  
            if(ct==2) {  
                System.out.println(i);
            }  
            i++; 
            N--;
        }    
	
	}
}
