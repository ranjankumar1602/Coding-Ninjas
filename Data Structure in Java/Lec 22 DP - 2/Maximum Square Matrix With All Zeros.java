
public class Solution {
	

	public static int findMaxSquareWithAllZeros(int[][] input){
        if(input.length == 0 || input[0].length == 0) {
            return 0;
        }
        
		int arr[][] = new int[input.length][input[0].length];
        
        for(int i = 0; i < arr[0].length; i++){
            if(input[0][i] == 0){
                arr[0][i] = 1;
            }else{
                arr[0][i] = 0;
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            if(input[i][0] == 0){
                arr[i][0] = 1;
            }else{
                arr[i][0] = 0;
            }
        }
        
        
        for(int i = 1; i < arr.length; i++){
            for(int j = 1; j < arr[0].length; j++){
                if(input[i][j] != 0){
                    arr[i][j] = 0;
                }else{
                    arr[i][j] = 1 + Math.min(arr[i-1][j-1], Math.min(arr[i][j-1], arr[i-1][j]));
                }
                
            }
        }
        
        int maximum = 0;
         for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] > maximum){
                    maximum = arr[i][j];
                }
            }
        }
        
        return maximum;
	}
}
