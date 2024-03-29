public class Solution {

    public static int lis(int arr[]) {
        if(arr.length == 0) {
            return 1;
        }
        int storage[] = new int[arr.length];
        storage[0] = 1;
        for(int i = 1; i < arr.length; i++) {
            for(int j = i-1; j >= 0; j--) {
                if(arr[j] < arr[i] && storage[i] < storage[j] + 1) {
                    storage[i] = storage[j] + 1;
                }else {
                    storage[i] = Math.max(1, storage[i]);
                }
            }
        }
        int max = storage[0];
        for(int i = 0; i < storage.length; i++) {
            if(storage[i] > max) {
                max = storage[i];
            }
        }
        return max;
    }
}
