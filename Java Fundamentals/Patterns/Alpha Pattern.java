import java.util.*;
public class Solution {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i=1;
        while(i<=N){
            int j=1;
            while(j<=i){
                char jthItem=(char)('A'+i-1);
                System.out.print(jthItem);
                j++;
            }
            System.out.println();
            i++;
        }

		
	}

}
