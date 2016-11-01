import java.io.*;
import java.util.*;

public class DijkstraShortestReach2 {

    private static int comp(int a, int b){
        if (a==0) return b;
        if (b==0) return a;
        return Math.min(a,b);
    }
    
    public static void main(String[] args) {
        InputReader in = new InputReader(System.in);
        //Scanner in = new Scanner(System.in);
        int q = in.readInt();
        for (int cas = 0; cas<q; cas++){
            int n = in.readInt();
            int[][] graph = new int[n][n];
            int m = in.readInt();
            for (int i = 0; i<m; i++){
                int u = in.readInt();
                int v = in.readInt();
                int w = in.readInt();
                int com = graph[u-1][v-1];
                if (w<com || com==0){
                    graph[u-1][v-1] = Solution.comp(graph[u-1][v-1],w);
                    graph[v-1][u-1] = graph[u-1][v-1];
                }
            }
            int[] paths = new int[n];
            Arrays.fill(paths, -1);
            int s = in.readInt()-1;
            paths[s]=0;
            int[] visited = new int[n];
            visited[s]=1;
            int node = s;
            while (node!=-1){
                for (int i = 0; i<n; i++){
                    int w = graph[node][i];
                    if (w!=0){
                        if (paths[i]==-1)
                            paths[i] = paths[node] + w;
                        else
                            paths[i] = Math.min(paths[i],paths[node]+w);
                    }
                }
                int ind = 0;
                while (ind<n && visited[ind]==1) ind++;
                if (ind==n) node=-1;
                else{
                    int val = paths[ind];
                    int next_node=ind;
                    for (int sel=ind+1; sel<n; sel++){
                        if (visited[sel]==0){
                            if (val==-1){
                                next_node = sel;
                                val = paths[sel];
                            }
                            else{
                                if (paths[sel]<val && paths[sel]>0){
                                    next_node = sel;
                                    val = paths[sel];
                                }
                            }
                        }
                   }
                    if (val==-1){
                    node = -1;
                    }
                    else{
                        visited[next_node]=1;
                        node = next_node;
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

class InputReader {
 
		private InputStream stream;
		private byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;
		private SpaceCharFilter filter;
 
		public InputReader(InputStream stream) {
			this.stream = stream;
		}
 
		public int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = stream.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}
 
		public int readInt() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}
 
		public String readString() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}
 
		public boolean isSpaceChar(int c) {
			if (filter != null)
				return filter.isSpaceChar(c);
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}
 
		public String next() {
			return readString();
		}
 
		public interface SpaceCharFilter {
			public boolean isSpaceChar(int ch);
		}
	}


