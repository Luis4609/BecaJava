/**
 * 
 */
package capitulo8.tryofexception;

/**
 * @author luis.monzon
 *
 */
public class IndexOutOfBounds {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {

			String str = "beginnersbook";
			System.out.println(str.length());

			char c = str.charAt(0);
			c = str.charAt(40);

			System.out.println(c);
		} catch (StringIndexOutOfBoundsException e) {

			System.out.println("The position you are trying to access does not exist,outside of the limits.");
		}

	}

}
