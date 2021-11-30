/** 
   An interface of methods that process an existing graph. 
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 5.0
*/
public interface GraphAlgorithmsInterface<T>
{
   /** Performs a breadth-first traversal of this graph.
       @param origin  An object that labels the origin vertex of the traversal.
       @return  A queue of labels of the vertices in the traversal, with
                the label of the origin vertex at the queue's front. */
                public QueueInterface<T> getBreadthFirstTraversal(T origin) {
                    resetVertices();
                    QueueInterface<T> traversalOrder = new LinkedQueue<T>();
                    QueueInterface<GraphVertex<T>> vertexQueue = new LinkedQueue<GraphVertex<T>>();
                    VertexInterface<T> originVertex = vertices.getValue(origin);
                    originVertex.visit();
                    traversalOrder.enqueue(origin);
                    vertexQueue.enqueue(originVertex);
            
                    while(!vertexQueue.isEmpty()) {
                        VertexInterface<T> frontVertex = vertexQueue.dequeue();
                        Iterator<VertexInterface<T>> neighbors = frontVertex.getNeighborIterator();
                        while (neighbors.hasNext()) {
                            VertexInterface<T> nextNeighbor = neighbors.next();
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
       @return  A queue of labels of the vertices in the traversal, with
                the label of the origin vertex at the queue's front. */
   public QueueInterface<T> getDepthFirstTraversal(T origin);


} // end GraphAlgorithmsInterface
