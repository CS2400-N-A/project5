public class DriverGT{
	public static void main(String[] args) {
<<<<<<< HEAD
		//DirectedGraph<Character> graph = new GraphInterFace<Character>(); // creates new graph
		Graph<Character> graph = new GraphInterFace<Character>();
		char[] vertices = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
		String[] edges = {"(A,B)", "(A, D)", "(A, E)", "(B, E)", "(D, G)", "(E, F)", "(E, H)", "(G, H)", "(F, C)", "(F,H)", "(H, I)", "(C, B)", "(I, F)"};
		
		for (int i = 0; i < vertices.length; i++) {
			if (i == 0) {
				//graph = new DirectedGraph<Character>('A'); //sets A as root
				graph = new Graph<Character>(vertices.length);
				}
			else {
				graph.add(vertices[i]); // adds rest of vertices to the graph
			}
=======
		
		char[] vertices = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
		/**Defines these edges
		 * (A,B), (A, D), (A, E), (B, E), (D, G), (E, F), (E, H), 
		 * (G, H) (F, C), (F,H), (H, I), (C, B), (I, F)
		 * A=0, B=1, C=2, ... I=8
		 */
		int[] edges = {0, 1, 0, 3, 0, 4, 1, 4, 3, 6, 4, 5, 4, 7, 6, 7, 5, 7, 7, 8, 2, 1, 8, 5};
		Graph<Character> graph = new Graph<Character>(vertices.length); // declears a new graph
		for(int i=0;i <edges.length; i++){
			graph.setLabel(i, vertices[i]);
		}
		for(int i=0; i<edges.length-2; i+=2){	//Creates the edges
			graph.addEdge(i, i+1);
>>>>>>> 5e8668d07ef769d52f6f9d752dfee13efd018023
		}
	}
}