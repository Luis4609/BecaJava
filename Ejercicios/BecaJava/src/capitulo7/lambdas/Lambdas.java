/**
 * 
 */
package capitulo7.lambdas;

import java.util.function.Predicate;

/**
 * @author luis.monzon
 *
 */
public class Lambdas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Predicate<Integer> isPar = num -> (num % 2 == 0);

		// Show
		System.out.println("Result: " + isPar.test(4));
		System.out.println("Result: " + isPar.test(5));
	}

}
