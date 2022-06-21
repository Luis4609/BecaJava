/**
 * 
 */
package capitulo8.tryofexception;

/**
 * @author luis.monzon
 *
 */
public class NumberFormatExceptionExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {

			int num = Integer.parseInt("XYZ");
			
			System.out.println(num);
		} catch (NumberFormatException e) {
			
			System.out.println("Cant convert to Integer");
		}

	}

}
