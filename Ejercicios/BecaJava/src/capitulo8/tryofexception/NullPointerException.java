/**
 * 
 */
package capitulo8.tryofexception;

/**
 * @author luis.monzon
 *
 */
public class NullPointerException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {

			String str = null;
			System.out.println(str.length());

		} catch (Exception e) {
			System.out.println("Null: " + e.getMessage());
		}

	}

}
