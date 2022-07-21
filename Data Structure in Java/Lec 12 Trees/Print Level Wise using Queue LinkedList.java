import java.util.*;
public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	
	
	public static void printLevelWise(TreeNode<Integer> root){
        
        if(root==null) {
            return;
        }
        Queue<TreeNode<Integer>> queue= new LinkedList<TreeNode<Integer>>();
        TreeNode<Integer> newNode=new TreeNode<Integer>(Integer.MIN_VALUE);
        queue.add(root);
        queue.add(newNode);
        System.out.println(root.data);
        while(queue.size()!=1) {
            TreeNode<Integer> temp=null;
            // try{
                temp=queue.poll();
            // }catch(QueueEmptyException e) {
                
            // }
            if(temp==newNode) {
                queue.add(newNode);
                System.out.println();
                continue;
            }
            for(int i=0;i<temp.children.size();++i) {
                System.out.print(temp.children.get(i).data+" ");
                queue.add(temp.children.get(i));
            }
        }
  }
		
}  
