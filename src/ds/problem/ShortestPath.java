package ds.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ds.graph.Djikstra;
import ds.graph.Edge;
import ds.graph.Graph;
import ds.graph.Vertex;

public class ShortestPath {
	
	private Random random;

	public static void main(String[] args) {

		ShortestPath  s = new ShortestPath();
		int edges = 5;
		int vertices = 4;
		Graph inputGraph = s.createGraph(edges, vertices);
		System.out.println("***Input***");
		System.out.println(inputGraph);
		
		Djikstra dj = new Djikstra(inputGraph);
		dj.runAlgorithm(inputGraph.getVertices().get(0));
		System.out.println("Shortest Distances");
		System.out.println(dj.getDistances());
		System.out.println("shortest Path");
		dj.printShortestPath(inputGraph.getVertices().get(2));

	}
	
	public Graph createGraph(int edgeCount, int verticesCount) {
		List<Vertex> vertices = new ArrayList<Vertex>();
		List<Edge> edges = new ArrayList<Edge>();
		Edge edge;
		
		for(int i=1; i<=verticesCount; i++)
			vertices.add(new Vertex(String.valueOf(i), "Vertex"+String.valueOf(i)));
		edges.add(new Edge(vertices.get(0), vertices.get(1), this.randomWeight()));
		edges.add(new Edge(vertices.get(0), vertices.get(2), this.randomWeight()));
		edges.add(new Edge(vertices.get(0), vertices.get(3), this.randomWeight()));
		edges.add(new Edge(vertices.get(1), vertices.get(2), 2));
		edges.add(new Edge(vertices.get(2), vertices.get(3), 4));
		
		return new Graph(vertices, edges);
	}
	
	public int randomWeight() {
		if(this.random == null)
			random = new Random();
		return random.nextInt(20) + 1;
		
	}
	
}
