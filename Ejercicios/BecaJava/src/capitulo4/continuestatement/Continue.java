/**
 * 
 */
package capitulo4.continuestatement;

/**
 * @author luis.monzon
 *
 */
public class Continue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int counter = 10;

		while (counter >= 0) {
			if (counter == 7) {
				counter--;
				continue;
			}
			System.out.print(counter + " ");
			counter--;
		}

		for (int j = 0; j <= 6; j++) {
			if (j == 4) {
				continue;
			}
			System.out.println(j + "");
		}

		int j = 0;

		do {
			if (j == 7) {
				j++;
				continue;
			}

			System.out.print(j + " ");
			j++;

		} while (j < 10);

	}

}
