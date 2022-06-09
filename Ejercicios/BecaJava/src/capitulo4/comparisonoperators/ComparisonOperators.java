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

		if (num1 != num2) {
			System.out.println("num1 and num2 are not equal");
		} else {
			System.out.println("num1 and num2 are equal");
		}
		if (num1 > num2) {
			System.out.println("num1 is greater than num2");
		} else {
			System.out.println("num1 is not greater than num2");
		}
		if (num1 >= num2) {
			System.out.println("num1 is greater than or equal to num2");
		} else {
			System.out.println("num1 is less than num2");
		}
		if (num1 < num2) {
			System.out.println("num1 is less than num2");
		} else {
			System.out.println("num1 is not less than num2");
		}
		if (num1 <= num2) {
			System.out.println("num1 is less than or equal to num2");
		} else {
			System.out.println("num1 is greater than num2");
		}

	}

}
