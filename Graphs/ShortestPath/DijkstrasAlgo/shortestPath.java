//there is one condition weight>0 if this fails then this algo not applicable for that question.
import java.io.*;
import java.util.*;

public class shortestPath {
  public static class Pair{
    int node;
    int wt;
    Pair(int n,int w){
      this.node=n;
      this.wt=w;
    }
  }
	
  public static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> graph, int S){
    // Write your code here
    boolean[] visited = new boolean[V];
    int cost[] = new int[V];
    Arrays.fill(cost,-1);
    PriorityQueue<Pair> q = new PriorityQueue<>((a,b)->{
      return a.wt-b.wt;
    });
    q.add(new Pair(S,0));
    while(!q.isEmpty()){
      Pair curr = q.remove();
      int node = curr.node;
      int wt = curr.wt;
      if(visited[node])continue;
      visited[node]=true;
      cost[node]= wt;
      for(int i=0;i<graph.get(node).size();i++){
        int nbr = graph.get(node).get(i).get(0);
        int nwt = graph.get(node).get(i).get(1);
        if(!visited[nbr]) q.add(new Pair(nbr, wt+nwt));
      }
    }
    return cost;
  }

  public static void main(String args[]) throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);
    
            ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
            for(int i=0;i<V;i++){
                adj.add(new ArrayList<ArrayList<Integer>>());
            }
            
            int i=0;
            while (i++<E) {
                String S[] = read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);
                ArrayList<Integer> t1 = new ArrayList<Integer>();
                ArrayList<Integer> t2 = new ArrayList<Integer>();
                t1.add(v);
                t1.add(w);
                t2.add(u);
                t2.add(w);
                adj.get(u).add(t1);
                adj.get(v).add(t2);
            }
            
            int S = Integer.parseInt(read.readLine());
            
            int[] ptr = dijkstra(V, adj, S);
            
            for(i=0; i<V; i++)
                System.out.print(ptr[i] + " ");

            System.out.println();
        }
    

}