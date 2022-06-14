/**
 * 
 */
package capitulo6.varargs;

/**
 * @author luis.monzon
 *
 */
public class VaragsDemo {

	/**
	 * Metodo que devuelve el mayor de los numeros recibidos por parametros
	 * 
	 * @param numbers
	 */
	public static void printMax(double... numbers) {

		// en caso de que no haya parametros, se imprimira un mensaje
		if (numbers.length == 0) {
			System.out.println("No argument passed");
			return;
		}
		double result = numbers[0];

		// obtener el mayor double del array
		for (int i = 1; i < numbers.length; i++) {
			if (result < numbers[i]) {
				result = numbers[i];
			}
		}
		System.out.println("The max value is: " + result);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		printMax(34, 3, 43, 2, 21, 56.6);
		printMax(new double[] { 1, 2, 4, 6 });
		printMax();

	}

}
