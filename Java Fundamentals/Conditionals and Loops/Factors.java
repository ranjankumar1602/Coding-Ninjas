import java.util.*;
public class Solution {
    
    public static void main(String[] args) {
        Scanner ranjan=new Scanner(System.in);
        int n=ranjan.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        
    }
}
