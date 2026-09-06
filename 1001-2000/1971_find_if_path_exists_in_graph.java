class Solution {

    //for edge creation
    public class Edge{
        int src;
        int dest;
        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] vis = new boolean[n];
        ArrayList<Edge>[] graph = new ArrayList[n];

        createGraph(edges,graph);
        return dfs(graph, source, destination, vis);

    }
    //graph creation 
    public void createGraph(int [][]edges, ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<edges.length; i++){
           int u = edges[i][0];
           int v = edges[i][1];

           //graph undirected so add both directions
           graph[u].add(new Edge(u,v));
           graph[v].add(new Edge(v,u));
        }
    }
    // dfs iteration
    public boolean dfs(ArrayList<Edge>[]graph, int source, int destination, boolean[] vis ){
        
        if(source == destination){
            return true;
        }
        if(vis[source]){
            return false;
        }
        vis[source] = true;
        for(int i=0; i<graph[source].size(); i++){
            Edge e = graph[source].get(i);
            if(!vis[e.dest]){
                if(dfs(graph, e.dest, destination, vis)){
                    return true;
                }
            }
        }
        return false;
    }
}