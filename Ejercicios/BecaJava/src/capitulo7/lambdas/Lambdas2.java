/**
 * 
 */
package capitulo7.lambdas;

/**
 * @author luis.monzon
 *
 */
public class Lambdas2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		StringModify s = (str1, str2) -> (str1 + str2).toUpperCase();
		System.out.println("Result: " + s.sModify("Hello", "World"));

	}

}
