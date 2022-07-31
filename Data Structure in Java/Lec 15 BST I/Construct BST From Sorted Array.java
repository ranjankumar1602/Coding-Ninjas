public class Solution {

	/*	Binary Tree Node class 
	 * 
	 * 	class BinaryTreeNode<T> {
			T data;
			BinaryTreeNode<T> left;
			BinaryTreeNode<T> right;
			
			public BinaryTreeNode(T data) {
				this.data = data;
			}
		}
		*/
		
    
    	private static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int start, int end) {
            if(start > end) {
                return null;
            }
            int mid = (start + end) / 2;
            BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[mid]);
            root.left = SortedArrayToBST(arr, start, mid-1);
            root.right = SortedArrayToBST(arr, mid + 1, end);
            return root;
        
    	}
    
    
		public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
			return SortedArrayToBST(arr,0,n-1);
		}
	}
