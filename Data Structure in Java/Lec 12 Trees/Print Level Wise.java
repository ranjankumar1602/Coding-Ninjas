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
		if(root==null){
    		return;
		}
        QueueUsingLL<TreeNode<Integer>> queue = new QueueUsingLL<TreeNode<Integer>>();
        TreeNode<Integer> newNode = new TreeNode<Integer>(Integer.MIN_VALUE);
        queue.enqueue(root);
        queue.enqueue(newNode);
        System.out.println(root.data);
        while(queue.size()!=1){
            TreeNode<Integer> temp = null;
            try{
                temp = queue.dequeue();
                
            } catch (QueueEmptyException e){
                
            }
            if(temp==newNode){
                queue.enqueue(newNode);
                System.out.println();
                continue;
            }
            for(int i = 0; i<temp.children.size();++i){
                System.out.print(temp.children.get(i).data+" ");
                queue.enqueue(temp.children.get(i));
            }
        }
	}
		
}  
