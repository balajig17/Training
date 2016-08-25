package ds.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Djikstra {
	
	private List<Vertex> vertices;
	private List<Edge> edges;
	private List<Vertex> visitedNodes;
	private List<Vertex> unvisitedNodes;
	private List<Vertex> adjacentNodes;
	private Map<Vertex, Integer> distance;
	
	public Djikstra(Graph graph) {
		this.vertices = graph.getVertices();
		this.edges = graph.getEdges();
		
		this.distance = new HashMap<Vertex, Integer>();
	}
	
	public void runAlgorithm(Vertex source) {
		this.visitedNodes = new ArrayList<Vertex>();
		this.unvisitedNodes = new ArrayList<Vertex>();
		
		distance.put(source, 0);
		unvisitedNodes.add(source);
		
		while(unvisitedNodes.size() >0) {
			Vertex node = getMinimumNode(unvisitedNodes);
			this.visitedNodes.add(node);
			this.unvisitedNodes.remove(node);
			findMinimumDistances(node);
		}
	}
	
	private void findMinimumDistances(Vertex node) {
		this.adjacentNodes = getAdjacentNodes(node);
		for(Vertex vertex : adjacentNodes){
			if(getShortestDistance(vertex) > getDistance(node, vertex) + getShortestDistance(node)) {
				distance.put(vertex, getDistance(node, vertex) + getShortestDistance(node));
			}
			this.unvisitedNodes.add(vertex);	
		}
	}
	
	private int getDistance(Vertex src, Vertex dest) {
		for(Edge edge : edges) {
			if(edge.getDest() == dest &&
					edge.getSrc() == src)
				return edge.getWeight();
		}
		throw new RuntimeException("Not possible");
	}
	
	
	private List<Vertex> getAdjacentNodes(Vertex node) {
		this.adjacentNodes = new ArrayList<Vertex>();
		for(Edge edge: edges) {
			if(edge.getSrc()==node && !isVisited(edge.getDest()))
				this.adjacentNodes.add(edge.getDest());
		}
		
		return adjacentNodes;
	}
	
	
	private boolean isVisited(Vertex node) {
		
		return this.visitedNodes.contains(node);
		
	}
	
	
	public Vertex getMinimumNode(List<Vertex> unvisitedNodes) {
		Vertex minimum = null;
		for(Vertex node : unvisitedNodes) {
			if(minimum == null)
				minimum = node;
			else if(getShortestDistance(node) < getShortestDistance(minimum))
				minimum = node;
		}
		return minimum;
		
	}
	
	
	public int getShortestDistance(Vertex node) {
		Integer d = distance.get(node);
		if(d == null)
			return Integer.MAX_VALUE;
		else
			return d;
	}
	
	

}
