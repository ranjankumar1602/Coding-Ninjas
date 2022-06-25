
public class solution {
    
    
    private static boolean splitArray(int[] input,int len,int start,int leftSum,int rightSum) {
        if(start==len) {
            return leftSum==rightSum;
        }
        if(input[start]%5==0) {
            leftSum += input[start];
        }else if(input[start]%3==0) {
            rightSum += input[start];
        }else {
            return splitArray(input, len, start+1, leftSum+input[start], rightSum) || splitArray(input, len, start+1, leftSum, rightSum+input[start]);
        }
        return splitArray(input, len, start+1, leftSum, rightSum);
        
    }

	public static boolean splitArray(int input[]) {
		int leftSum=0;
        int rightSum=0;
        int len=input.length;
        int start=0;
        
        return splitArray(input, len, start, leftSum, rightSum);
		
	}
	

}
