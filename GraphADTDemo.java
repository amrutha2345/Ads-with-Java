import java.util.LinkedList;
import java.util.Iterator;
class Graph {
     int V; 
     LinkedList<Integer>[] adj; 

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    
    void insert(int v,int w) {
        adj[v].add(w);
    }

    
    void BFS(int s) {
        
        boolean[] visited = new boolean[V];

        
        LinkedList<Integer> queue = new LinkedList<Integer>();

        
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            
            s = queue.poll();
            System.out.print(s+" ");

            
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}


public class GraphADTDemo {
    public static void main(String args[]) {
        // Create a graph with 4 vertices
        Graph graph = new Graph(4);

        
        graph.insert(0, 1);
        graph.insert(0, 2);
        graph.insert(1, 2);
        graph.insert(2, 0);
        graph.insert(2, 3);
        graph.insert(3, 3);

        System.out.println("BFS traversal starting from vertex 2:");
        graph.BFS(2);
    }
}

