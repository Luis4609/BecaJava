/**
 * 
 */
package capitulo4.comparisonoperators;

/**
 * @author luis.monzon
 *
 */
public class ComparisonOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 50;

		String str = "Hola Mundo";
		String str2 = "Hola Mundo";

		// Int
		if (num1 == num2) {
			System.out.println("Equal num1 - num2");
		} else {
			System.out.println("Not equal");
		}

		// String
		if (str == str2) {
			System.out.println("Equal str - str2");
		} else {
			System.out.println("Not equal");
		}

	}

}
