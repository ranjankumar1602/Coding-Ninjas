public class Solution{
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {

            int storagePrev[] = new int[maxWeight+1];
        	int storageCurrent[] = new int [maxWeight+1];
        	for(int i = 1; i < value.length + 1; i++) {
            	for(int j = 1; j < maxWeight + 1; j++) {
                	if(weight[i-1] > j) {
                    	storageCurrent[j] = storagePrev[j];
                	}
                	else { 
                		storageCurrent[j]= Math.max(storagePrev[j - weight[i-1]]+ value[i-1],storagePrev[j]);
                	}
            	}
                storagePrev = storageCurrent ;
                storageCurrent = new int[maxWeight + 1];
            
        	}
        	return storagePrev[maxWeight];
    }
}
