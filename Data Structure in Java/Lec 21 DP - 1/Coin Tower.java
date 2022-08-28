public class Solution {

	public static String findWinner(int n, int x, int y) {
		//Your code goes here
        boolean storage[] = new boolean[n + 1];
        storage[0] = false;
        storage[1] = true;
        // if(n == 1) {
        //     return storage[n] ? "Beerus" : "Whis";
        // }else {
            for(int i = 2; i <= n; i++) {
                if(i - 1 >= 0 && !storage[i-1]) {
                    storage[i] = true;
                }else if(i - x >= 0 && !storage[i-x]) {
                    storage[i] = true;
                }else if(i - y >= 0 && !storage[i-y]) {
                    storage[i] = true;
                }else {
                    storage[i] = false;
                }
            }
        // }
        return storage[n] ? "Beerus" : "Whis";
	}

}
