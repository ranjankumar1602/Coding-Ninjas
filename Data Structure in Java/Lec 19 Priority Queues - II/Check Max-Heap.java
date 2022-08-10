public class Solution {
    
    private static boolean checkMaxHeap(int arr[], int startIndex) {
        if(startIndex == arr.length) {
            return true;
        }
        int parentIndex = startIndex;
        int leftChildIndex = 2 * parentIndex + 1;
        int rightChildIndex = 2 * parentIndex + 2;
        boolean leftAns = true, rightAns = true;
        if(leftChildIndex < arr.length) {
            if(arr[parentIndex] < arr[leftChildIndex]) {
                return false;
            }else {
                leftAns=checkMaxHeap(arr, leftChildIndex);
            }
        }
        
        
        if(rightChildIndex < arr.length) {
            if(arr[parentIndex] < arr[rightChildIndex]) {
                return false;
            }else {
                rightAns=checkMaxHeap(arr,rightChildIndex);
            }
        }
        
        return leftAns && rightAns;
    }

	public static boolean checkMaxHeap(int arr[]) {
		return checkMaxHeap(arr,0);
	}
}
