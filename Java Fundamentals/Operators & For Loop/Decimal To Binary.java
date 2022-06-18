import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long num=0;
        long pv=1;
        while(N!=0){
            num+=pv*(N%2);
            N/=2;
            pv*=10;
            
        }
        System.out.println(num);

	}
}
