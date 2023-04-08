//it is implement in BFS using priority queue
//there is one condition weight>0 if this fails then this algo not applicable for that question
import java.security.Permissions;
import java.util.*;
public class Main {
    static class Edge {
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));
        
        graph[2].add(new Edge(2, 4, 3));
        
        graph[3].add(new Edge(3, 5, 1));
        
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    public static class Pair implements Comparable<Pair> {
        int node;
        int dist;
        public Pair(int n,int d){
            this.dist=d;
            this.node=n;
        }

        @Override
        public int compareTo(Pair p2){
            return this.dist-p2.dist;
        }
    }
  //O(E+E logV)
    public static void dijkstras(ArrayList<Edge> graph[],int src,int v) {
        PriorityQueue<Pair> pq= new PriorityQueue<>();
        int dist[] = new int[v];
        for(int i=0;i<v;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        boolean visited[] = new boolean[v];
        pq.add(new Pair(0,0));

        while(!pq.isEmpty()){
            Pair curr = pq.remove(); //shortest dist
            if(!visited[curr.node]){
                visited[curr.node]=true;
                for(int i=0;i<graph[curr.node].size();i++){
                    Edge e= graph[curr.node].get(i);
                    int u = e.src;
                    int v1 = e.dest;
                    if(dist[u]+e.wt<dist[v1]){
                        dist[v1] = dist[u]+e.wt;
                        pq.add(new Pair(v1,dist[v1]));
                    }
                }
            }
        }

        for(int i=0;i<v;i++){
            System.out.print(dist[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        dijkstras(graph, 0,v);

    }

}