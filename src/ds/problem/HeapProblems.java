package ds.problem;

import java.util.ArrayList;
import java.util.List;

import ds.heap.Heap;

public class HeapProblems {
	
	private static Heap heap;

	public static void main(String[] args) {
		
		List<Integer> input = new ArrayList<Integer>();
		input.add(5);
		input.add(7);
		input.add(4);
		input.add(2);
		input.add(3);
		input.add(23);
		System.out.println(input);
		heapSort(input);
		System.out.println(input);
		

	}
	
	public static List<Integer> heapSort(List<Integer> inputList) {
		int size = inputList.size();
		heap = new Heap(size);
		for(int i=0; i<size; i++) {
			heap.insert(inputList.get(i));
		}
		heap.printHeap();
		
		inputList.clear();
		for(int i=0; i<size;i++) {
			inputList.add(i, heap.removeMin());
		}
		return inputList;
	}

}
