/*
 * 5. Program to perform selection Sort
 */

public class SelectionSort {

	/* method responsible to perform selection sort */
	void selectionSort(int[] a) {
		int smallElement, temp;
		for (int i = 0; i < a.length - 1; i++) {
			smallElement = i;
			for (int j = 0; j < a.length; j++) {
				if (a[j] < a[smallElement]) {
					smallElement = j;

					/* swapping of smallElement to its exact position */

					temp = a[smallElement];
					a[smallElement] = a[i];
					a[i] = temp;
				}
			}
		}
	}

	/* method to display array elements */

	void display(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}

	/* Driver method */

	public static void main(String[] args) {
		int a[] = { 91, 49, 4, 19, 10, 21 };
		SelectionSort selectionSort = new SelectionSort();
		System.out.println("\nBefore sorting array elements are: ");
		selectionSort.display(a);
		selectionSort.selectionSort(a);
		System.out.println("\nAfter sorting array elements are: ");
		selectionSort.display(a);
		System.out.println();
	}
}
