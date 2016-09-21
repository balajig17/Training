package ds.trie;

public class Vertex {

	private int prefixes;
	private int words;
	private Vertex[] references;

	public Vertex() {
		prefixes = 0;
		words = 0;
		references = new Vertex[26];
	}

	public void addWord(String word) {
		if (word.length() == 0) {
			this.words++;
		} else {
			this.prefixes++;
			Vertex next = this.addNext(word);
			next.addWord(word.substring(1));

		}
	}

	public int countWord(String word) {
		if (word.length() == 0)
			return this.words;
		else {
			Vertex next = this.getNext(word);
			if (next == null) {
				return 0;
			}
			return next.countWord(word.substring(1));
		}
	}

	public int countPrefix(String word) {
		if (word.length() == 0)
			return this.prefixes;
		else {
			Vertex next = this.getNext(word);
			if (next == null) {
				return 0;
			}
			return next.countPrefix(word.substring(1));
		}
	}

	private Vertex addNext(String word) {
		int pos = word.charAt(0) - 'a';
		if (references[pos] == null) {
			references[pos] = new Vertex();
		}
		return references[pos];
	}

	private Vertex getNext(String word) {
		int pos = word.charAt(0) - 'a';
		return references[pos];
	}

}
