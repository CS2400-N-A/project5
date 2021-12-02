// Taken from professor's slides, 

public class Graph<T>
{
	private boolean[][] edges;
	private E[] labels;
	
	public Graph() {
		this(null);
	}
	
	public Graph(int n) {
		edges = new boolean[n][n];
		labels = (E[]) new Object[n];
	}
	
	// Remove an edge
    public void removeEdge(int source, int target) {
        edges[source][target] = false;
    }
    // Change the label of a vertex of this Graph
    public void setLabel(int vertex, T newLabel) {
        labels[vertex] = newLabel;
    }
    // Accessor method to determine the number of vertices in this Graph
    public int size() {
        return labels.length;
    }
    
    public QueueInterface<T> getBreadthFirstTraversal(T originLabel) {
        recentVertices();
        QueueInterface<T> traversalOrder = new LinkedQueue<T>();
        QueueInterface<GraphVertex<T>> vertexQueue = new LinkedQueue<GraphVertex<T>>();
    }
    
    
}