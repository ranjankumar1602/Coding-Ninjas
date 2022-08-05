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

	public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root) {
		if(root==null || root.children.size()==0) {
            return null;
        }
        
        for (int i = 0; i < root.children.size(); i++) {
  
        	TreeNode<Integer> child = root.children.get(i);
 
        	if(child.children.size() == 0) {
  
            	for (int j = i; j < root.children.size() - 1; j++)
                	root.children.set(j, root.children.get(j + 1));
  
            
            	root.children.remove(root.children.size()-1);
  
            	i--;
        	}
    	}
        for(int i = 0; i < root.children.size(); i++) {
        	root.children.set(i,removeLeafNodes(root.children.get(i)));
    	}
 		return root;
		
	}
}
