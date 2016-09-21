package problems;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
	
	Map<Integer, Integer> memo;

	public static void main(String[] args) {
		Fibonacci fn = new Fibonacci();
		int n = 6;
		System.out.println(String.format("Fibonacci number at %d = %d", n, fn.calcFibo(n)));
		System.out.println(fn.memo);

	}
	
	public Fibonacci() {
		memo = new HashMap<Integer, Integer>();
		memo.put(0, 0);
		memo.put(1, 1);
	}
	
	public int calcFibo(int n) {
		if(n==0 || n==1)
			return memo.get(n);
		if(memo.containsKey(n))
			return memo.get(n);
		else {
			int fib = calcFibo(n-1) + calcFibo(n-2);
			memo.put(n, fib);
			return fib;
		}
	}

}
