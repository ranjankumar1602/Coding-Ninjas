public class solution {
    
    
    public static void merge(int arr[],int start,int mid,int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int L[] = new int[n1];
    	int R[] = new int[n2];
        
        for(int i = 0; i<n1; i++){
        	L[i] = arr[start + i];
    	}
    
    	for(int j = 0; j<n2; j++){
        	R[j] = arr[mid+1+j];
    	}
        
        int i = 0;
    	int j = 0;
    	int k = 0;
    
		k = start;
    
    	while (i<n1 && j<n2) {
        	if (L[i]<=R[j]) {
            
            	arr[k] = L[i];
            	i++;
        }else {
            arr[k] = R[j];
            j++;
        }
        k++;
    }
        
        while (i<n1){
            arr[k]= L[i];
            i++;
            k++;
        }
        
        while (j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
     public static void sort(int [] arr, int start, int end){
      
        	if (start<end){
        
        		int mid = (start + end)/2;
        		sort(arr, start, mid);
        		sort(arr, mid+1, end);
        		merge(arr, start, mid, end);
    		}
    
    }

	public static void mergeSort(int[] input){
		// Write your code here
        
    	sort(input,0,input.length-1);
    
		
	}
}
