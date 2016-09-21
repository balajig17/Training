package ds.problem;

import ds.trie.Trie;

public class TrieProblem {

	public static void main(String[] args) {
		Trie t = new Trie();
		t.addWord("Bala");
		t.addWord("Balance");
		t.addWord("Bali");
		t.addWord("Apple");
		t.addWord("zombie");
		t.addWord("function");
		t.addWord("java");
		System.out.println(t.countPrefixes("a"));
		System.out.println(t.findWord("zombie"));
		

	}

}
