
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
	
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
        if(root==null) {
            return null;
        }
        TreeNode<Integer> max=null;
        if(root.data>n) {
            max=root;
        }
        for(int i=0;i<root.children.size();i++) {
            TreeNode<Integer> childmax= findNextLargerNode(root.children.get(i), n);
        
        	if(childmax==null) {
                continue;
            }else {
            	if(max==null)
                	max=childmax;
            	else if(childmax.data > n  && childmax.data < max.data)
                	max= childmax;
        	}
        }
        
        return max;

	}
	
}
