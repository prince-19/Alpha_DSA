import java.util.*;

public class Graph_Traversal {
        static class Edge{
            int src;
            int dest;
            int wt;
    
            public Edge(int s, int d, int w){
                this.src = s;
                this.dest = d;
                this.wt = w;
            }
        }

        static void createGraph(ArrayList<Edge> graph[]) {
            for(int i=0; i<graph.length; i++){
                graph[i] = new ArrayList<>();
            }

            graph[0].add(new Edge(0, 1, 1));
            graph[0].add(new Edge(0, 2, 1));
          
            graph[0].add(new Edge(1, 0, 1));
            graph[0].add(new Edge(1, 3, 1));

            graph[0].add(new Edge(2, 0, 1));
            graph[0].add(new Edge(2, 4, 1));
            
            graph[0].add(new Edge(3, 1, 1));
            graph[0].add(new Edge(3, 4, 1));
            graph[0].add(new Edge(3, 5, 1));
            
            graph[0].add(new Edge(4, 2, 1));
            graph[0].add(new Edge(4, 3, 1));
            graph[0].add(new Edge(4, 5, 1));
           
            graph[0].add(new Edge(5, 3, 1));
            graph[0].add(new Edge(5, 4, 1));
            graph[0].add(new Edge(5, 6, 1));
            
            graph[0].add(new Edge(6, 5, 1));
        }

        //lec-6 BFS(Breadth First Search)
        public static void bfs(ArrayList<Edge>[] graph) {//O(V+E)
             Queue<Integer> q = new LinkedList<>();
             boolean vis[] = new boolean[graph.length];
             q.add(0); //source = 0

             while(!q.isEmpty()){
                int curr = q.remove();

                if(!vis[curr]) {
                    System.out.print(curr+" ");
                    vis[curr] = true;
                    for(int i=0; i<graph[curr].size(); i++){
                        Edge e = graph[curr].get(i);
                        q.add(e.dest);
                    }
                }
             }
        }
    
        //lec-7 DFS(Deapth First Search)
        public static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
            //visit 
            System.out.print(curr + " ");
            vis[curr] = true;

            for(int i=0; i<graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if(!vis[e.dest]) {
                    dfs(graph, e.dest, vis);
                }
            }
        }
    
        public static void main(String[] args) {
            /*
                            
                        1 ---- 3
                       /       | \
                      0        |   5 -- 6
                       \       | / 
                        2 ---- 4
            */
            int V = 7;
            ArrayList<Edge> graph[] = new ArrayList [V]; // 
            createGraph(graph); 
           
            //lec-6
           // bfs(graph);
            
            System.out.println();

            //lec-7
            dfs(graph, 0, new boolean[V]);


            //Getting output:
            //0 1 2 3 4 5 6 
            //Correct output for dfs: 
            //0 1 3 4 2 5 6
        }
    }
