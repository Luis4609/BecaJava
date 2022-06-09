/**
 * 
 */
package capitulo4.autoincrementoperators;

import java.util.Iterator;

/**
 * @author luis.monzon
 *
 */
public class AutoincrementOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num1 = 100;
		int num2 = 200;

		num1++;

		for (int i = 0; i < 30; i++) {
			System.out.println(num2--);
		}

		System.out.println(num1);

	}

}
