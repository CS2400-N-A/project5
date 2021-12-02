public class DirectedGraph<T> {
	
	private T root;
	private int numberofNodes = 0;
	
	public DirectedGraph() {
		this(null);
	}
	
	@SuppressWarnings("unchecked")
	public DirectedGraph(T initVector) {
		root = new GraphNode<T>initVector;
		numberofNodes++;
		
	}
	
	public boolean addVertex(T vertexLabel) {
		GraphNode<T> vertex = new GraphNode<T>(vertexLabel);
	}
	
	public boolean addEdge(T begin, T end, double edgeWeight) {
		
	}
	
	public boolean addEdge(T begin, T end) {
	
	}
	
	public boolean hasEdge(T begin, T end) {
	
	}
	
	public boolean isEmpty() {
		return (numberofNodes == 0);
	}
	
	public int getNumberOfVertices() {
	
	}
	
	public int getNumberOfEdges() {
	
	}
	
	public void clear() {
	
	}
}
