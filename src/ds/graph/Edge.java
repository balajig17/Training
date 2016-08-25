package ds.graph;

public class Edge {
	
	private final String id;
	private final Vertex src;
	private final Vertex dest;
	private final int weight;
	
	public Edge(Vertex src, Vertex dest, int weight) {
		this.src = src;
		this.dest = dest;
		this.id = this.toString();
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
		return src + " - " + dest;
	}

	@Override
	public boolean equals(Object obj) {

		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		if(this.getId() != ((Edge)obj).getId())
			return false;
		return true;
	}
	
	

}
