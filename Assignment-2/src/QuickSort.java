/*
 * 2.Program to sort the given array using Quick-sort
 */

public class QuickSort {
	// Driver code
	public static void main(String[] args) {
		// Array declaration and initialization at the same line

		int quickArray[] = { 12, 13, 18, 27, 2, 19, 25 };

		QuickSort quickSort = new QuickSort();

		System.out.println("Elements of array before Sorting:");
		quickSort.display(quickArray);
		System.out.println();

		quickSort.quickSort(quickArray, 0, (quickArray.length - 1));
		System.out.println("Elements of an array after Sorting:");
		quickSort.display(quickArray);
	}

	void display(int[] quickArray) {
		for (int i = 0; i < quickArray.length; i++) {
			System.out.print(" " + quickArray[i] + " ");
		}
	}
	/*
	 * partition() method responsible for array partition and returns partitionIndex
	 */

	int partition(int[] a, int begin, int end) {

		int pivot = a[end]; // a[end] considered as pivot value
		int i = (begin - 1);

		for (int j = begin; j <= end - 1; j++) {
			if (a[j] < pivot) {
				i++;
				// logic to swap the elements
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}

		// logic to set the pivot value to its exact position

		int temp = a[i + 1];
		a[i + 1] = a[end];
		a[end] = temp;

		return (i + 1);
	}

	/* quickSort() method to sort the array based on the partitionIndex */

	void quickSort(int[] a, int begin, int end) {

		if (begin < end) {
			int partionIndex = partition(a, begin, end);
			quickSort(a, begin, partionIndex - 1);
			quickSort(a, partionIndex + 1, end);
		}
	}
}
