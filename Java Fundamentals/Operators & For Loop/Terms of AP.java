import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int sum=0,count=0;
        for(int i=1;count<x;i++){
            sum=(3*i)+2;
            if(sum%4!=0){
                System.out.print(sum+" ");
                count++;
            }
        }

	}
}
