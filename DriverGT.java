public class DriverGT{
	public static void main(String[] args) {
		DirectedGraph<Character> graph = new GraphInterFace<Character>(); // creates new graph
		
		char[] vertices = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
		String[] edges = {"(A,B)", "(A, D)", "(A, E)", "(B, E)", "(D, G)", "(E, F)", "(E, H)", "(G, H)", "(F, C)", "(F,H)", "(H, I)", "(C, B)", "(I, F)"};
		
		for (int i = 0; i < vertices.length; i++) {
			if (i == 0) {
				graph = new DirectedGraph<Character>('A'); //sets A as root
			}
			else {
				graph.add(vertices[i]); // adds rest of vertices to the graph
			}
		}
		
		/* for (String e: edges) {
			graph.connect(e.charAt(1), e.charAt(3));
		} */
		
		
	}
}