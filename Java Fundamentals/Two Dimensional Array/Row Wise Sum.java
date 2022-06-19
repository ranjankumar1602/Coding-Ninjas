
public class Solution {

	public static void rowWiseSum(int[][] mat) {
		int n=mat.length;
        int m=0;
        int sum=0;
        if(n!=0) {
            m=mat[0].length;
        }
        for(int i=0;i<n;i++) {
            sum=0;
            for(int j=0;j<m;j++) {
                sum+=mat[i][j];
            }
            System.out.print(sum+" ");
        }
	}

}
