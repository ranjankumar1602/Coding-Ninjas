import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char alpha=sc.next().charAt(0);
        if(alpha>='A' && alpha<='Z'){
            System.out.println("1");
        }else if(alpha>='a' && alpha<='z'){
            System.out.println("0");
        }else{
            System.out.println("-1");
        }

    }
}
