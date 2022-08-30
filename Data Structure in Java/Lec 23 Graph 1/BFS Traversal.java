import java.util.*;

public class Solution {
    
    private static void printBFS(int[][] edges) {
        boolean visited[] = new boolean[edges.length];
        for(int i = 0; i < edges.length; i++) {
            if(!visited[i]) {
                printBFS(edges, i, visited);
            }
        }
    }
    
    private static void printBFS(int[][] edges, int sv, boolean[] visited) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(sv);
        int n = edges.length;
        visited[sv] = true;
        while(!q.isEmpty()) {
            int front;
            try {
                front = q.poll();
            } catch (Exception e) {
                //TODO: handle exception
                return;
            }
            System.out.print(front+" ");
            for(int i = 0; i < n; i++) {
                if(edges[front][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }

	public static void main(String[] args) {
        
        int n;
        int e;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        e = sc.nextInt();
        int edges[][] = new int[n][n];
        for(int i = 0; i < e; i++) {
            int fv = sc.nextInt();
            int sv = sc.nextInt();
            edges[fv][sv] = 1;
            edges[sv][fv] = 1;
        }
        printBFS(edges);
	}

}
