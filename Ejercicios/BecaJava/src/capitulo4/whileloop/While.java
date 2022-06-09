/**
 * 
 */
package capitulo4.whileloop;

/**
 * @author luis.monzon
 *
 */
public class While {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int i = 10;

		while (i > 1) {
			System.out.println(i);
			i--;
		}

		int arr[] = { 2, 11, 45, 9 };
		int y = 0;

		while (y < 4) {

			System.out.println("pos " + y + ": " + arr[y]);

			y++;
		}

	}

}
