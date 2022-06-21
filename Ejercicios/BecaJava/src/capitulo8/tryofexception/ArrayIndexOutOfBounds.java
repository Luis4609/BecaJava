/**
 * 
 */
package capitulo8.tryofexception;

/**
 * @author luis.monzon
 *
 */
public class ArrayIndexOutOfBounds {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {

			int a[] = new int[10];

			a[11] = 9;
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("No element in that position");
		}

	}

}
