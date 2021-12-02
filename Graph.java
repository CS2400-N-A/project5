import java.util.Iterator;

// Taken from professor's slides, 

public class Graph<E>
{
	private boolean[][] edges;
	private E[] labels;
	
    @SuppressWarnings("unchecked")
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

    protected void resetVertices() {
        Iterator<VertexInterface<E>> vertexIterator = vertices.getValueIterator();
        while (vertexIterator.hasNext()){
            VertexInterface<E> nextVertex = vertexIterator.next();
            nextVertex.unvisit();
            nextVertex.setCost(0);
            nextVertex.setPredecessor(null);
        } // end while
    } // end resetVertices

    /** Performs a breadth-first traversal of this graph.
       @param origin  An object that labels the origin vertex of the traversal.
       @return  A queue of labels of the vertices in the traversal, with
                the label of the origin vertex at the queue's front. */
    public QueueInterface<E> getBreadthFirstTraversal(E origin) {
        resetVertices();
        QueueInterface<E> traversalOrder = new LinkedQueue<E>();
        QueueInterface<VertexInterface<E>> vertexQueue = new LinkedQueue<>();
        VertexInterface<E> originVertex = vertices.getValue(origin);
        originVertex.visit();
        traversalOrder.enqueue(origin);
        vertexQueue.enqueue(originVertex);
                        
        while(!vertexQueue.isEmpty()) {
            VertexInterface<E> frontVertex = vertexQueue.dequeue();
            Iterator<VertexInterface<E>> neighbors = frontVertex.getNeighborIterator();
            while (neighbors.hasNext()) {
                VertexInterface<E> nextNeighbor = neighbors.next();
                if(!nextNeighbor.isVisited()) {
                    nextNeighbor.visit();
                    traversalOrder.enqueue(nextNeighbor.getLabel());
                    vertexQueue.enqueue(nextNeighbor);
                }
            }
        }
        return traversalOrder;
    }
            
    /** Performs a depth-first traversal of this graph.
        @param origin  An object that labels the origin vertex of the traversal.
        @return A queue of labels of the vertices in the traversal, with
                the label of the origin vertex at the queue's front. */
    public QueueInterface<E> getDepthFirstTraversal(E origin) {
        resetVertices();
        QueueInterface<E> traversalOrder = new LinkedQueue<E>();
        StackInterface<VertexInterface<E>> vertexStack = new LinkedStack<>();
            
        VertexInterface<E> originVertex = vertices.getValue(origin);
        originVertex.visit();
        traversalOrder.enqueue(origin);
        vertexStack.push(originVertex);
            
        while (!vertexStack.isEmpty()) {
            VertexInterface<E> topVertex = vertexStack.peek();
            VertexInterface<E> nextNeighbor = topVertex.getUnvisitedNeighbor();
            
            if (nextNeighbor != null) {
                nextNeighbor.visit();
                traversalOrder.enqueue(nextNeighbor.getLabel());
                vertexStack.push(nextNeighbor);
            } else {
                vertexStack.pop();
            }
        }
        return traversalOrder;
    }
    
}