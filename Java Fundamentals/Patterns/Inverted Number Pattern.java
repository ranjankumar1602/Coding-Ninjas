import java.util.*;
public class Solution {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=n;
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(count);
            }
            System.out.println();
            count--;
        }
        
	}

}
