/**
 * 
 */
package capitulo6.passingdataamongmethods;

/**
 * @author luis.monzon
 *
 */
public class PassingDataAmongMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Se crea una variable de tipo String con el valor "Hello!"
		String s1 = "Hello!";

		/**
		 * Se llama al método bye y se le pasa s1 como parámetro
		 */
		bye(s1);

		/**
		 * Se imprime en la consola el valor de s1, que será Hello! Esto se debe a que a
		 * pesar de que en el método bye hay una variable que se llama s1, es una
		 * variable de ámbito local completamente diferente a la variable s1 creada en
		 * el método main.
		 */

		System.out.println(s1);

		StringBuilder s2 = new StringBuilder();

		goodMorning(s2);
		System.out.println(s2);

	}

	/**
	 * @param s
	 */
	public static void goodMorning(StringBuilder s) {
		s.append("Good Morning");

	}

	/**
	 * @param s1
	 */
	public static void bye(String s1) {
		
		s1 = "Bye";

	}

}
