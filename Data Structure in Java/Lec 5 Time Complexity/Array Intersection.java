public class Solution {
    private static void merge(int[] arr,int start,int mid,int end) {
        int n1=mid-start+1;
        int n2=end-mid;
        
        int L[]=new int[n1];
        int R[]=new int[n2];
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
        while (i<n1 && j<n2){
        if (L[i]<=R[j]){
            
            arr[k] = L[i];
            i++;
            
        }else{
        
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
    
    private static void sort(int[] arr,int start,int end) {
        if(start<end) {
            int mid=(start+end)/2;
            sort(arr,start,mid);
            sort(arr,mid+1,end);
            
            merge(arr,start,mid,end);
        }
        
        
    }

	public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
        sort(arr1,0,arr1.length-1);
        sort(arr2,0,arr2.length-1);
        for(int i = 0; i<arr1.length; i++){
            for(int j = 0; j<arr2.length; j++){
                if (arr1[i]==arr2[j]){
                    System.out.print(arr1[i] + " ");
                    arr2[j] = 0;
                    break;
                }
            }
        }
        
	}

}
