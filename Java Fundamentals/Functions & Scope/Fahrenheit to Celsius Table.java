import java.util.*;
public class Solution {

	public static void printFahrenheitTable(int start, int end, int step) {
		
		for(int f=start;f<=end;f+=step) {
            int c=((f-32)*5)/9;
            System.out.println(f+"\t"+c);
        }
	}
}
