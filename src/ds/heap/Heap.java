package ds.heap;

public class Heap {
	
	private int heapSize;
	private int[] heap;
	
	public Heap(int capacity) {
		// Initializing heap size to 1 to avoid use of index 0.
		this.heapSize = 1;
		heap = new int[capacity + 1];
		heap[0] = -1;
		}
	
	public void insert(int value) {
		if(isFull())
			throw new RuntimeException("Cannot add further!!");
		heap[heapSize] = value;
		heapifyUp(heapSize);
		heapSize++;
	}
	
	public boolean isEmpty() {
		return heapSize <=1;
	}
	
	public boolean isFull() {
		return heapSize == heap.length;
	}
	
	public int parent(int childIndex) {
		return childIndex/2;
	}
	
	public void printHeap() {
		
		for(int i=1; i<heapSize; i++) {
			System.out.print(heap[i]+" ");
		}
		System.out.println();
	}
	
	
	public void heapifyUp(int newIndex) {
		int temp = heap[newIndex];
		while(heap[newIndex] <= heap[parent(newIndex)]) {
			int parent = parent(newIndex);
			heap[newIndex] = heap[parent];
			heap[parent] = temp;
			newIndex = parent;
		}
	}
	
	public void heapifyDown(int index) {
		while(index*2 <= heapSize-1) {
			int min = minChild(index);
			if(heap[min] < heap[index]) {
				int temp = heap[min];
				heap[min] = heap[index];
				heap[index] = temp;
			}
			index = min;
		}
		
	}
	
	public int minChild(int index) {
		if(index*2+1 > heapSize-1)
			return index*2;
		else if(heap[index*2] < heap[index*2+1])
			return index*2;
		else
			return index*2+1;
	}

	public int removeMin() {
		if(isEmpty())
			throw new RuntimeException("Heap empty!");
		int min = heap[1];
		heap[1] = heap[heapSize-1];
		heapSize--;
		heapifyDown(1);
		return min;
	}
}
