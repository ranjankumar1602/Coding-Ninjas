import java.util.*;
public class Solution {


	public static void main(String[] args) {
		
		char name;
        int m1,m2,m3,avg;
        Scanner sc=new Scanner(System.in);
        name=sc.next().charAt(0);
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        avg=(m1+m2+m3)/3;
        System.out.println(name);
        System.out.print(avg);
		
	}

}
