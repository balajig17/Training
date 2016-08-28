package sort;

import java.util.Arrays;

public class MergeSort {

	private int[] array;
	private int[] temp;

	public static void main(String[] args) {

		int[] arr = { 3, 7, 2, 67, 1, 5 };
		MergeSort ms = new MergeSort();
		arr = ms.sort(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	public int[] sort(int[] input) {
		array = input;
		temp = new int[array.length];
		int low = 0;
		int high = input.length - 1;
		mergeSort(low, high);
		return array;

	}

	private void mergeSort(int low, int high) {

		int mid;
		if (low < high) {
			mid = (low + high) / 2;
			mergeSort(low, mid);
			mergeSort(mid + 1, high);
			merge(low, mid, high);
		}

	}

	private void merge(int low, int mid, int high) {

		int i = low;
		int j = mid + 1;
		int k = low;

		for (int l = low; l <= high; l++)
			temp[l] = array[l];

		while (i <= mid && j <= high) {
			if (temp[i] <= temp[j])
				array[k++] = temp[i++];
			else
				array[k++] = temp[j++];
		}
		while (i <= mid)
			array[k++] = temp[i++];
		while (j <= high)
			array[k++] = temp[j++];

	}
}
