public class solution {

	private static int[][] subsets(int input[],int start) {
        int len=input.length;
        if (start>len-1){
            int output[][] = new int[1][0];
            
            return output;
        }
        
        int[][] smallAns = subsets(input, start+1);
        int output[][] = new int [2*smallAns.length][];
        
        for(int i = 0; i<smallAns.length; i++){
            output[i] = new int[smallAns[i].length];
            for(int j = 0; j<smallAns[i].length; j++){
                output[i][j] = smallAns[i][j];
            }
        }
        
        for(int i = smallAns.length; i<output.length; i++){
            output[i] = new int[smallAns[i-smallAns.length].length+1];
            output[i][0] = input[start];
            for(int j = 1; j<output[i].length; j++){
                output[i][j] = smallAns[i-smallAns.length][j-1];
            }
        }
        
        return output;
        
    }
    
    
    
    
	public static int[][] subsets(int input[]) {
		int start=0;
        int output[][]=subsets(input,start);
        return output;

	}
}
