/*
 * 6. Program to check whether an array is a subset of another array.
 * 
 */
public class SubsetArray {

	public static void main(String[] args) {

		int[] array1 = { 11, 2, 3, 4, 5, 6};
		int[] array2 = { 2, 3, 4 };
		SubsetArray subsetArray = new SubsetArray();

		if (subsetArray.isSubset(array1, array2)) {
			System.out.println("Array2 is subset of Array1");
		} else {
			System.out.println("Array2 is not subset of Array1");
		}
	}
	
/* isSubset() method  returns boolean =>
 * if it is subset then it returns true otherwise false
 * subset : if all the elements present in the array2 present
 * in the array1 then array2 is subset of array1. If one element is 
 * not present then it is not a subset.
 * */
	
	boolean isSubset(int[] array1, int[] array2) {

		
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				if (array2[i] == array1[j]) {
					break;
				}
				if (j == array1.length-1) {
					return false;
				}
			}
		}
		return true;
	}
}
