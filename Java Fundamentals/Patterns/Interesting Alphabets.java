import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i=1;
        while(i<=N){
            int j=1;
            int p=N-i+1;
            while(j<=i){
                char jth=(char)('A'+p-1);
                System.out.print(jth);
                p++;
                j++;
            }
            System.out.println();
            i++;
        }
	}
}
