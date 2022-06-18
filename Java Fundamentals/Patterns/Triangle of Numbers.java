import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i,j,space,num=1;
        space=N-1;    
        for ( j = 1 ; j <= N ; j++ )
        {
        num = j;
         
        for ( i = 1 ; i <= space ; i++ )
            System.out.print(" ");
         
         space--;
         
        for ( i = 1 ; i <= j ; i++ )
        {
            System.out.print(num);
            num++;
        }
        num--;
        num--;
        for ( i = 1 ; i < j ; i++)
        {
            System.out.print(num);
            num--;
        }
        System.out.println();
        }
            
	}
}
