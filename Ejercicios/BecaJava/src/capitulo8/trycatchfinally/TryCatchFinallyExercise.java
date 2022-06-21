/**
 * 
 */
package capitulo8.trycatchfinally;

/**
 * @author luis.monzon
 *
 */
public class TryCatchFinallyExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a[] = new int[2];

		try {
			System.out.println("Access element three: " + a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Exception thrown: " + e);
		} finally {

			a[0] = 6;

			System.out.println("First element: " + a[0]);
			System.out.println("The finally statement is executed");
		}

	}

}
