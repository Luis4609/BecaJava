/**
 * 
 */
package capitulo8.tryofexception;

/**
 * @author luis.monzon
 *
 */
public class ArithmeticExceptionExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num1;
		int num2;

		try {

			num1 = 0;
			num2 = 62 / num1;

			System.out.println(num2);
			System.out.println("Try finished.");
		} catch (ArithmeticException e) {
			System.out.println("No divide by zero");
		} catch (Exception e) {
			System.out.println("An exception ocurred.");
		}

	}

}
