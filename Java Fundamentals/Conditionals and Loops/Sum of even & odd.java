import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int odd=0;
        int even=0;
        int rem=0;
        while(N!=0){
            rem=N%10;
            if(rem%2==0){
                even=even+rem;
            }else{
                odd=odd+rem;
            }
            N=N/10;
        }
        System.out.println(even+" "+odd);

	}
}
