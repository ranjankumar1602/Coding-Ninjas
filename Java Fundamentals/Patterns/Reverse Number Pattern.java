import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i=1;
        while(i<=N){
            int j=i;
            while(j>=1){
                System.out.print(j);
                j--;
            }
            System.out.println();
            i++;
        }
		
	}

}
