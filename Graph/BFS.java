import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    
    // Function to add an edge to the adjacency list
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    // Function to perform BFS traversal
    static void BFS(ArrayList<ArrayList<Integer>> adj, int V, int s) {
        // Array to keep track of visited vertices
        boolean[] visited = new boolean[V];
        
        // Queue for BFS
        Queue<Integer> q = new LinkedList<>();
        
        // Mark the starting node as visited and enqueue it
        visited[s] = true;
        q.add(s);

        // Loop to traverse the graph
        while (!q.isEmpty()) {
            // Dequeue a vertex from the queue and print it
            int u = q.poll();
            System.out.print(u + " ");

            // Get all adjacent vertices of the dequeued vertex u
            // If an adjacent has not been visited, mark it visited and enqueue it
            for (int v : adj.get(u)) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
    }

    public static void main(String[] args) {
        int V = 5; // Number of vertices
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(V);

        // Initialize adjacency list for each vertex
        for (int i = 0; i < V; i++) 
            adj.add(new ArrayList<>());

        // Add edges to the graph
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 1, 3);
        addEdge(adj, 3, 4);
        addEdge(adj, 2, 4);
        
        // Print BFS traversal starting from vertex 0
        System.out.println("Following is Breadth First Traversal starting from vertex 0:");
        BFS(adj, V, 0);
    }
}
