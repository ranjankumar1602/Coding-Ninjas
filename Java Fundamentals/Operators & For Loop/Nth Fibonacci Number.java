import java.util.*;
public class Solution {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int a=0;
		int b=1;
		int f=0;
		if(N==0 && N==1) {
		    System.out.println(b);
		    return;
		}
		for(int i=1;i<N;i++) {
		    
		    
		    f=a+b;
		    a=b;
		    b=f;
		}
		System.out.print(b);
				
	}

}
