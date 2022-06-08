/**
 * 
 */
package capitulo3.packagedeclarationsandimports;

import capitulo3.packagedeclarationsandimports.letmecalculate.Calculator;

/**
 * @author luis.monzon
 *
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Calculator calc = new Calculator();

		System.out.println("Suma de 100 + 200: " + calc.add(100, 200));

	}

}
