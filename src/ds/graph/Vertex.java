package ds.graph;

public class Vertex {

	private final String id;
	private final String name;
	
	public Vertex(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return name;
	}
	
	public boolean equals(Object o){
		
		if(o == null)
			return false;
		if(getClass() != o.getClass())
			return false;
		if(getId() != ((Vertex)o).getId())
			return false;
		
		return true;
	}
	
	
	
}
