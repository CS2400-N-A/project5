public class DriverGT{
	public static void main(String[] args) {
		
		char[] vertices = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
		/**Defines these edges
		 * (A,B), (A, D), (A, E), (B, E), (D, G), (E, F), (E, H), 
		 * (G, H) (F, C), (F,H), (H, I), (C, B), (I, F)
		 * A=0, B=1, C=2, ... I=8
		 */
		int[] edges = {0, 1, 0, 3, 0, 4, 1, 4, 3, 6, 4, 5, 4, 7, 6, 7, 5, 7, 7, 8, 2, 1, 8, 5};
		Graph<Character> graph = new Graph<Character>(vertices.length); // declears a new graph
		for(int i=0; i<edges.length-2; i+=2){	//Creates the edges
			graph.addEdge(i, i+1);
		}
	}
}