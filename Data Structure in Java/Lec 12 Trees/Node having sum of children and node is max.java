
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
	
	
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		// Write your code here
        
      TreeNode<Integer> ans =root;
    
    	int sum=root.data; 
    	for(int i=0;i<root.children.size();i++) {
        	sum+=root.children.get(i).data;
    	}
    
    
  		for(int i=0;i<root.children.size();i++) {
        	TreeNode<Integer> childmax=maxSumNode(root.children.get(i));
          	int smallsum=childmax.data; 
          
         	for(int j=0;j<childmax.children.size();j++) {
            	smallsum+=childmax.children.get(j).data;
          	}
      
         	if(sum<=smallsum) {
             	ans=childmax;	
             	sum=smallsum;                           
         	}
    	}
    	return ans;       
	}
			
}
