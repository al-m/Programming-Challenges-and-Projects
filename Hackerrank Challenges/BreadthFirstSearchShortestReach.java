import java.io.*;
import java.util.*;

public class BreadthFirstSearchShortestReach {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int cas = 0; cas<q; cas++){
            int n = in.nextInt();
            int[][] graph = new int[n][n];
            int m = in.nextInt();
            for (int i = 0; i<m; i++){
                int u = in.nextInt();
                int v = in.nextInt();
                graph[u-1][v-1] = 6;
                graph[v-1][u-1] = 6;
            }
            int[] paths = new int[n];
            Arrays.fill(paths, -1);
            int s = in.nextInt()-1;
            paths[s]=0;
            LinkedList<Integer> queue = new LinkedList<Integer>();
            int[] visited = new int[n];
            queue.push(s);
            visited[s]=1;
            while (queue.peek()!=null){
                int node = queue.remove();
                //System.out.println("\nVisiting node " + node);
                for (int i = 0; i<n; i++){
                  //  System.out.println("Considering connection between node " + node + " and node " + i);
                    if (graph[node][i]==6){
                        if (visited[i]==0){
                            queue.add(i);
                            visited[i]=1;
                    //        System.out.println("Pushing node " + i);
                            if (paths[i]==-1)
                                paths[i]= paths[node]+6;
                            else
                                paths[i] = Math.min(paths[i],paths[node]+6);
                      //      System.out.println(Arrays.toString(paths));
                        }
                        else paths[i] = Math.min(paths[i],paths[node]+6);
                    }
                }
            }
            for (int i = 0; i<n; i++){
                if (i==s)
                    continue;
                System.out.print(paths[i] + " ");
            }
            System.out.println("");
        }
    }
}
