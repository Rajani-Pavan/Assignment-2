import java.util.Scanner;

/*
 * 1. Program to find Duplicate elements in a given array
 */
public class DuplicatesInArray {

	public static void main(String[] args) {
		int[] elements = new int[6];
		int[] duplicate = new int[6];
		int readElem;
		boolean flag = false;
		//reading user inputs
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter " + elements.length + " elements to array:");
		for (int i = 0; i < elements.length; i++) {
			readElem = scan.nextInt();
			elements[i] = readElem;
		}
		scan.close();
		// Logic to find duplicates in an array
		for (int i = 0; i < elements.length; i++) {
			for (int j = i + 1; j < elements.length; j++) {
				if (duplicate[i] != elements[i]) {
					if (elements[i] == elements[j]) {
						duplicate[i] = elements[i];
						flag = true;
					}
				}
			}
		}
		// Duplicate element display logic
		if (flag == true) {
			for (int i = 0; i < duplicate.length; i++) {
				if (duplicate[i] != 0)
					System.out.println("Duplicate element " + duplicate[i] + " found");
			}
		} else {
			System.out.println("No duplicate elements present in the array");
		}
	}
}
