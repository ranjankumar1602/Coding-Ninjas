import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int start=1;
            int j=1;
            while(j<=n-i){
                System.out.print(" ");
                j++;
            }
            while(j<=n){
                System.out.print(start);
                start++;
                j++;
            }
            System.out.println();
            i++;
        }

		
	}

}
