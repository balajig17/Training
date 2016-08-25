package ds.graph;

public class Edge {
	
	private final String id;
	private final Vertex src;
	private final Vertex dest;
	private final int weight;
	
	public Edge(String id, Vertex src, Vertex dest, int weight) {
		super();
		this.id = id;
		this.src = src;
		this.dest = dest;
		this.weight = weight;
	}

	public String getId() {
		return id;
	}

	public Vertex getSrc() {
		return src;
	}

	public Vertex getDest() {
		return dest;
	}

	public int getWeight() {
		return weight;
	}
	
	public String toString() {
		return src + "-" + dest;
	}

}
