package ds.trie;

public class Trie {
	
	private Vertex root;
	
	public Trie() {
		root = new Vertex();
	}
	
	public void addWord(String word) {
		if(word.length()==0)
			return;
		root.addWord(word.toLowerCase());
	}
	
	public int countWords(String word) {
		if(word.length()==0)
			return 0;
		else
			return root.countWord(word.toLowerCase());
	}
	
	public int countPrefixes(String word) {
		if(word.length()==0)
			return 0;
		else
			return root.countPrefix(word.toLowerCase());
	}
	
	public boolean findWord(String word) {
		if(word.length()==0)
			return false;
		int wordCount = root.countWord(word.toLowerCase());
		if(wordCount >0)
			return true;
		else
			return false;
	}
}
