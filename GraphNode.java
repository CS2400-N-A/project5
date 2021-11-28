class GraphNode<T> {
	private T data;
	private boolean visited;
	public GraphNode() {
		this(null);
	}
	
	public GraphNode(T dat) {
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
}