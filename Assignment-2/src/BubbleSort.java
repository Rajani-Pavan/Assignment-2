import java.util.Scanner;

/*
 * 3. Program to sort given array using BubbleSort
 */
public class BubbleSort {

	public static void main(String[] args) {

		int[] elements = new int[5];
		int readEle, swap;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter " + elements.length + " elements to sort:");

		for (int i = 0; i < elements.length; i++) {
			readEle = scan.nextInt();
			elements[i] = readEle;
		}
		scan.close();
		// Element exchange logic
		for (int i = 0; i < elements.length; i++) {
			for (int j = 1; j < elements.length - i; j++) {
				if (elements[j] < elements[j - 1]) {
					swap = elements[j - 1];
					elements[j - 1] = elements[j];
					elements[j] = swap;

				}
			}
		}
		System.out.println("sorted array elements are:");
		for (int i = 0; i < elements.length; i++)
			System.out.print(elements[i] + " ");

	}
}
