/**
 * 
 */
package capitulo6.accessmodifiers;

import capitulo6.accessmodifiers.package1.Default;
import capitulo6.accessmodifiers.package1.Protected;
import capitulo6.accessmodifiers.package1.Public;

/**
 * @author luis.monzon
 *
 */
public class Test extends Protected {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Default objDefault = new Default();
//		objDefault.addTwoNumbers(1, 3); //Error de compilacion

		// Private class
		Private objPrivate = new Private();
//		 objPrivate.square(10); // error de compilacion

		Test obj = new Test();
		System.out.println("Resta = " + obj.subtractTwoNumbers(5, 6));

		// Public
		Public objPublic = new Public();
		System.out.println(objPublic.divideTwoNumbers(6, 3));

	}

}
