public class solution {
    
    //helper 
    private static int binarySearch(int input[],int start,int end,int element) {
        if(start>end) {
            return -1;
        }
        
        int mid=(start + end)/2;
        if(element == input[mid]) {
            return mid;
        }else if(element < input[mid]) {
            return binarySearch(input, start, mid-1, element);
        }else {
            return binarySearch(input, mid+1, end, element);
        }
    }

	
	public static int binarySearch(int input[], int element) {
		int len=input.length;
        int start=0;
        int end=len-1;
        return binarySearch(input,start,end,element);

	}
}
