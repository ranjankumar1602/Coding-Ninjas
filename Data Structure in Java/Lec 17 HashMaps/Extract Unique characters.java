import java.util.HashMap;

public class Solution {

	public static String uniqueChar(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        String ans="";
		for(int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if(map.containsKey(temp)) {
                continue;
            }else {
                map.put(temp,0);
                ans += temp;
            }
        }
        return ans;
	}
}

/*

Solution Using HashSet
import java.util.HashSet;

public class Solution {

	public static String uniqueChar(String str){
		HashSet<Character> set = new HashSet<Character>();
        String ans = "";
        for(int i = 0; i < str.length(); i++) {
            if(set.contains(str.charAt(i))) {
                continue;
            }else {
                set.add(str.charAt(i));
                ans += str.charAt(i);
            }
        }
        return ans;
	}
}

*/
