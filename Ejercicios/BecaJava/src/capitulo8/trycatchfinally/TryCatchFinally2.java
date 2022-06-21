/**
 * 
 */
package capitulo8.trycatchfinally;

/**
 * @author luis.monzon
 *
 */
public class TryCatchFinally2 {

	/**
	 * 
	 */
	private static void fall() {
		throw new RuntimeException();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			fall();
		} catch (Exception e) {
			System.out.println("RuntimeException: " + e.getMessage());
			System.out.println("RuntimeException: " + e.getCause());
		} finally {

			System.out.println("Finish");
		}

		System.out.println("Finish try-catch-finally");
	}

}
