import java.util.*;

//its a list of list
//this is one of the optimize way to create a graph
class Main{
    static class Edge{
        int src;
        int dst;    
        int wt;

        public Edge(int s,int d,int w) {
            this.src = s;
            this.dst = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2,10));   //format is source,destination,weight    
 
        graph[1].add(new Edge(1, 2,5));
        graph[1].add(new Edge(1, 3,0));

        graph[2].add(new Edge(2, 0,3));
        graph[2].add(new Edge(2, 1,7));
        graph[2].add(new Edge(2, 3,0));

        graph[3].add(new Edge(3, 1,-1));
        graph[3].add(new Edge(3, 2,9));
    }

    public static void main(String[] args) {
        int v=4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        //print 2s neighbours
        for(int i=0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.println("source: "+e.src+" --> "+e.dst+" destination "+"weight of vertex is: "+e.wt);
        }
    }
}