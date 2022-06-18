import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int newNum=0;
        while(N!=0){
            newNum*=10;
            newNum+=N%10;
            
            N/=10;
        }
        System.out.print(newNum);

	}
}
