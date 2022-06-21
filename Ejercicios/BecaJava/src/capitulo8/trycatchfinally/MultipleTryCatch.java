/**
 * 
 */
package capitulo8.trycatchfinally;

/**
 * @author luis.monzon
 *
 */
public class MultipleTryCatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			int arr[] = new int[7];
			arr[10] = 10 / 0;

			System.out.println("Last Statement of try block.");

		} catch (ArithmeticException e) {

			System.out.println("You shouldnt divide a number by zero.");
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Accesing array elements outside of the limit.");
		} catch (Exception e) {

			System.out.println("Another exception ocurred");
		}

	}

}
