/**
 * 
 */
package capitulo5.arrays;

import java.util.Arrays;


/**
 * @author luis.monzon
 *
 */
public class ArrayType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] myList = { 3, 5, 2, 1 };

		// methods
		printArray(myList);
		reverseArray(myList);

		Arrays.sort(myList);

		// print the array myList sorted
		for (int elem : myList) {
			System.out.println(elem + "");
		}

		// test binarySearch
		System.out.println("Position of elem 3 after being sorted: " + Arrays.binarySearch(myList, 3));

	}

	/**
	 * @param myList
	 */
	private static int[] reverseArray(int[] myList) {

		// create new array to insert the reverse
		int[] result = new int[myList.length];

		for (int i = 0, j = result.length - 1; i < myList.length; i++, j--) {
			result[j] = myList[i];
		}

		return result;

	}

	/**
	 * Method to print one array
	 * 
	 * @param myList
	 */
	private static void printArray(int[] myList) {

		for (int i = 0; i < myList.length; i++) {
			System.out.println(myList[i] + "");
		}

	}

}
