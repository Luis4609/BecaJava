/**
 * 
 */
package capitulo4.breakstatement;

/**
 * @author luis.monzon
 *
 */
public class Break {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num1 = 0;

		while (num1 <= 100) {
			System.out.println("Value of variable is: " + num1);

			if (num1 == 2) {
				System.out.println("Break en num1 = " + num1);
				break;
			}
			num1++;
		}
		System.out.println("Out of the while");

		int var;

		for (var = 100; var >= 10; var--) {
			System.out.println("var: " + var);

			if (var == 99) {
				break;
			}
		}

		System.out.println("Out of the for");

		int num2 = 2;

		// switch
		switch (num2) {
		case 1:
			System.out.println("Case 1");
			break;
		case 2:
			System.out.println("Case 2");
			break;
		case 3:
			System.out.println("Case 3");
			break;
		case 4:
			System.out.println("Case 4");
			break;

		default:
			System.out.println("Default ");
		}

	}

}
