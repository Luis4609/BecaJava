/**
 * 
 */
package capitulo4.ifthenelse;

/**
 * @author luis.monzon
 *
 */
public class IfThenElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num = 1234;

		// if else
		if (num < 50) {
			System.out.println("Number is less than 50");
		} else {
			System.out.println("num is greater than or equal 50");
		}

		// else if
		if (num < 100 && num >= 1) {
			System.out.println("Its a two digit number");
		} else if (num < 1000 && num >= 100) {
			System.out.println("Its a three digit number");
		} else if (num < 10000 && num >= 1000) {
			System.out.println("Its a four digit number");
		} else if (num < 100000 && num >= 10000) {
			System.out.println("Its a five digit number");
		} else {
			System.out.println("number is not between 1 & 99999");
		}

	}

}
