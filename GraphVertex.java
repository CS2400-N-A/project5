class GraphVertex<T> {
	private T data;
	private GraphVertex<T> predecessor;
	private boolean visited;
	private boolean hasNeighbor = false;
	private int numberofNeighbors;
	
	public GraphVertex() {
		this(null);
	}
	
	public GraphVertex(T dat) {
		data = dat;
	}
	
	
	public T getData() {
		return data;
	}
	
	public void setData(T input) {
		data = input;
	}
	
	public boolean isVisited() {
		return visited;
	}
	
	public void setVisted(boolean visit) {
		visited = visit;
	}
	
	public boolean hasNeighbor() {
		return hasNeighbor;
	}
	
	public boolean connect(GraphVertex<T> nextvertex) {
		boolean b = false;
		if (nextvertex != null) {
			numberofNeighbors++;
			hasNeighbor = b = true;
			nextvertex.setPredecessor(this);
		}
		return b;
	}
	
	public void setPredecessor(GraphVertex<T> pre) {
		predecessor = pre;
	}
	
	
}