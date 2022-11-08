/*
 * 4. Program to perform mergesort
 */
public class MergeSort {

	/* Function to merge the subarrays of a[] */
	void merge(int a[], int beginIndex, int midIndex, int endIndex) {
		int i, j, k;
		int n1 = midIndex - beginIndex + 1;
		int n2 = endIndex - midIndex;

		/* temporary Arrays */
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];

		/* copy data to temp arrays */
		for (i = 0; i < n1; i++)
			leftArray[i] = a[beginIndex + i];
		for (j = 0; j < n2; j++)
			rightArray[j] = a[midIndex + 1 + j];

		i = 0; /* initial index of first sub-array */
		j = 0; /* initial index of second sub-array */
		k = beginIndex; /* initial index of merged sub-array */

		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				a[k] = leftArray[i];
				i++;
			} else {
				a[k] = rightArray[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			a[k] = leftArray[i];
			i++;
			k++;
		}

		while (j < n2) {
			a[k] = rightArray[j];
			j++;
			k++;
		}
	}

	void mergeSort(int a[], int beginIndex, int endIndex) {
		if (beginIndex < endIndex) {
			int mid = (beginIndex + endIndex) / 2;
			mergeSort(a, beginIndex, mid);
			mergeSort(a, mid + 1, endIndex);
			merge(a, beginIndex, mid, endIndex);
		}
	}

	/* Function to print the array */
	void display(int a[], int n) {
		int i;
		for (i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}

	/* Driver method */
	public static void main(String args[]) {
		int a[] = { 16, 33, 42, 8, 13, 61, 93, 90 };
		int arrayLength = a.length;
		MergeSort m1 = new MergeSort();
		System.out.println("\nBefore sorting array elements are: ");
		m1.display(a, arrayLength);
		m1.mergeSort(a, 0, arrayLength - 1);
		System.out.println("\nAfter sorting array elements are: ");
		m1.display(a, arrayLength);
		System.out.println("");
	}

}
