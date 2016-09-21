package ds.problem;

public class Regex {

	public static void main(String[] args) {
		String input = "balajiffgnfbdgnbb324iivfbndfg";
		
		boolean result = input.matches(".*(b\\d+i).*");
		System.out.println(result);
		
	}

}
