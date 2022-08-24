import java.util.*;
public class Solution {

	public static int maxMoneyLooted(int[] houses) {
		//Your code goes here
        if(houses.length == 0) {
            return 0;
        }
        // if(houses.length<=2) {
        //     return Math.max(houses[0], houses[1]);
        // }
        int jawab[] = new int[houses.length];
        jawab[0] = houses[0];
        jawab[1] = Math.max(houses[0], houses[1]);
        for(int i = 2; i < jawab.length; i++) {
            jawab[i] = Math.max(houses[i] + jawab[i-2], jawab[i-1]);
        }
        return jawab[jawab.length - 1];
	}

}
