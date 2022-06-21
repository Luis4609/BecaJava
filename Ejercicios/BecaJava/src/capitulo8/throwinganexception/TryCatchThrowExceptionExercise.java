/**
 * 
 */
package capitulo8.throwinganexception;

/**
 * @author luis.monzon
 *
 */
public class TryCatchThrowExceptionExercise {

	/**
	 * 
	 */
	public static void fall() {
		throw new RuntimeException();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			fall();
		} catch (RuntimeException e) {
			System.out.println("RuntimeException");
		}

		// Finished try-catch
		System.out.println("Finished Try-Catch.");

	}

}
