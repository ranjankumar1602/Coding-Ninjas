import java.util.*;
import java.lang.Math;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int basic=sc.nextInt();
        char grade=sc.next().charAt(0);
        
        
        double hra=0.2*basic; //hra = 20% of basic
        double da=0.5*basic;  //da = 50% of basic
        double pf=0.11*basic;  //pf = 11% of basic
        double allow=0;
        if(grade=='A'){
            allow=1700;
        }else if(grade=='B'){
            allow=1500;
        }else{
            allow=1300;
        }
        int totalSalary=(int)(Math.round((basic+hra+da+allow)-pf));
        System.out.println(totalSalary);
        
	}
}
