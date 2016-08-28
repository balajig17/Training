package dp;

import java.util.HashMap;

public class MinimumSteps {

	int[] solutions = new int[100];
	HashMap<Integer, Integer> memo;

	public MinimumSteps() {
		memo = new HashMap<Integer, Integer>();
	}

	public static void main(String[] args) {
		MinimumSteps solution = new MinimumSteps();
		int num = 10;
		System.out.println(solution.countSteps(num));

	}

	public int countSteps(int n) {

		int r;

		if (n == 1)
			return 0;
		if (memo.containsKey(n))
			return memo.get(n);
		r = 1 + countSteps(n - 1);
		if (n % 2 == 0)
			r = Math.min(r, 1 + countSteps(n / 2));
		if (n % 3 == 0)
			r = Math.min(r, 1 + countSteps(n / 3));
		memo.put(n, r);
		return r;
	}

}
