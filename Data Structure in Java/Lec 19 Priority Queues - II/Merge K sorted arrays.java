import java.util.*;
public class Solution {

	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) {

		ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>();
      	for(int i = 0; i < input.size(); i++) {
      		ArrayList<Integer> temp = input.get(i);
      		for(int j = 0; j < temp.size(); j++) {
          		queue.add(temp.get(j));
            }
  		}
    
       	while(!queue.isEmpty()) {
            list.add(queue.remove());
        }
        return list;
    }
}
