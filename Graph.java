import java.util.Iterator;

// Taken from professor's slides, 

public class Graph<E>
{
	private boolean[][] edges;
	private E[] labels;
	
	public Graph(int n) {
		edges = new boolean[n][n];
		labels = (E[]) new Object[n];
	}
    
    // Accessor method to get the label of the vertex in this Graph
    public E getLabel(int vertex) {
        return labels[vertex];
    }

    // Test to see if edge exist
    public boolean isEdge(int source, int target) {
        return edges[source][target];
    }
	
    // Add an edge
    public void addEdge(int source, int target) {
        edges[source][target] = true;
    }

    // Obtain a list of neighbors of this vertex for the Graph
    public int[] neighbors(int vertex) {
        int count = 0;
        int[] answer;

        for (int i = 0; i < labels.length; i++) {
            if (edges[vertex][i])
                count++;
        }
        answer = new int[count];
        count = 0;
        for (int i = 0; i < labels.length; i++) {
            if (edges[vertex][i])
                answer[count++] = i;
        }
        return answer;
    }
	// Remove an edge
    public void removeEdge(int source, int target) {
        edges[source][target] = false;
    }
    // Change the label of a vertex of this Graph
    public void setLabel(int vertex, E newLabel) {
        labels[vertex] = newLabel;
    }
    // Accessor method to determine the number of vertices in this Graph
    public int size() {
        return labels.length;
    }
    
}