/**
 * This class solves the problem of finding a rotation point in a mostly sorted list of words. 
 * eg. [ "u", "v" , "y", "z", "A", "c"], rotation point will be the index of A
 * 
 */
package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Balaji Gurumurthy
 * 
 */
public class RotationPoint {

	private List<String> words;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		RotationPoint p = new RotationPoint();
		p.addWord("Variety");
		p.addWord("Wildlife");
		p.addWord("Zoo");
		p.addWord("Books");
		p.addWord("Cluster");
		p.addWord("penguin");
		p.printWordsList();
		System.out.println("Rotation Point = " + p.getRotationPoint());

	}

	public RotationPoint() {
		this.words = new ArrayList<String>();
	}

	public void addWord(String word) {
		words.add(word);
	}

	public void printWordsList() {
		System.out.println(words);
	}

	public int getRotationPoint() {

		String startWord = words.get(0);
		int floorIndex = 0, ceilIndex = words.size();
		while (floorIndex < ceilIndex) {
			String guess = words.get((floorIndex + ceilIndex) / 2);
			if (guess.compareToIgnoreCase(startWord) < 0) {
				ceilIndex = words.indexOf(guess);
			} else {
				floorIndex = words.indexOf(guess);
			}
			if (floorIndex + 1 == ceilIndex)
				break;
		}

		return ceilIndex;
	}

}
