import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int p=1;
        for(int i=1;i<=n;i++){
            p=p*x;
        }
        System.out.println(p);
        
    }
}
