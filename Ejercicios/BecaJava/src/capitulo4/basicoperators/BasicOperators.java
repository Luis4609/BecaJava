/**
 * 
 */
package capitulo4.basicoperators;

/**
 * Trabajando con los Operadores binarios aritmeticos
 * 
 * @author luis.monzon
 *
 */
public class BasicOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num1 = 100;

		int num2 = 20;

		System.out.println("Suma: " + (num1 + num2));
		System.out.println("Resta: " + (num1 - num2));
		System.out.println("Multiplicacion: " + (num1 * num2));
		if (num2 > 0) {
			System.out.println("Division :" + (num1 / num2));
		}
		System.out.println("Resto :" + (num1 % num2));

	}

}
