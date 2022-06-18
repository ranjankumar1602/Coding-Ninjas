import java.util.*;
public class Solution {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i=1;
        while(i<=N){
            int spaces=1;
            while(spaces<=N-i){
                System.out.print(" ");
                spaces++;
            }
            int star=1;
            while(star<=i){
                System.out.print("*");
                star++;
            }
            int desc=i-1;
            while(desc>=1){
                System.out.print("*");
                desc--;
            }
            
            System.out.println();
            i++;
        }

		
	}

}
