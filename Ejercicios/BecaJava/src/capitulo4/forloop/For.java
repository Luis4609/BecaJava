/**
 * 
 */
package capitulo4.forloop;

import java.util.Iterator;

/**
 * @author luis.monzon
 *
 */
public class For {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// for LOOP
		for (int i = 10; i > 1; i--) {
			System.out.println("The value of i is: " + i);
		}

		int arr[] = { 2, 11, 45, 9 };

		for (int i = 0; i < 4; i++) {
			System.out.println("For: " + arr[i]);
		}

		for (int num : arr) {
			System.out.println("forEach: " + num);
		}
	}

}
