import java.util.Scanner;

public class Solution {
    
    public static void arrange(int[] arr, int n) {
    
        
        int s=0, e=n-1, i=0;
        
        for(i=1; i<=n; i++)
        {
            if(i % 2 == 1){
                arr[s] = i;
                s++;
            }
            else {
                arr[e] = i;
                e--;
            }
        }
    }
}
