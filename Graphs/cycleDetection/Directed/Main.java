import java.util.*;

class Main{
    static class Edge{
        int src;
        int dst;    
        public Edge(int s,int d) {
            this.src = s;
            this.dst = d;
        }
  }
    
    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 3));
    }

    public static boolean CycleDetecDFS(ArrayList<Edge>graph[],boolean[] visited,int curr,boolean[] check) {
        visited[curr]=true;
        check[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(visited[e.dst]){
                return true;
            }
            if(!visited[e.dst]){
               if(CycleDetecDFS(graph, visited,e.dst,check)) return true;
            }
        }
        check[curr]=false;
        return false;
    }

    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        boolean visited[] = new boolean[v];
        boolean check[] = new boolean[v];
        System.out.println(CycleDetecDFS(graph,visited,0,check));
    }
}