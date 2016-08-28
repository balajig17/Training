package sort;

public class QuickSort {

	private int[] array;

	public static void main(String[] args) {

		int[] arr = { 5, 3, 54, 1, 4, 23, 2 };
		QuickSort qs = new QuickSort();
		qs.quickSort(arr);
		if (qs.array != null)
			for (int i = 0; i < qs.array.length; i++)
				System.out.println(qs.array[i]);
	}

	public void quickSort(int[] input) {

		this.array = input;
		if (array == null || array.length == 0)
			return;
		else {
			int low = 0;
			int high = array.length - 1;

			sort(low, high);
		}

	}

	private void sort(int low, int high) {
		int i = low;
		int j = high;
		int mid = (low + high) / 2;
		int pivot = array[mid];

		while (i <= j) {
			while (array[i] < pivot)
				i++;
			while (array[j] > pivot)
				j--;
			if (i <= j) {
				this.swap(i, j);
				i++;
				j--;
			}

		}
		if (low < j)
			sort(low, j);
		if (i < high)
			sort(i, high);

	}

	private void swap(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
