import java.util.*;
public class Main {
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
        int pv=1; 
        int num=0;
        while(N!=0) {
            num+=pv*(N%10);
            pv+=pv;
            N/=10;
        }
        System.out.println(num);

	}
}
