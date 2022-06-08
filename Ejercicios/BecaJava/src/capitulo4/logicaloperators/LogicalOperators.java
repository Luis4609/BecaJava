/**
 * 
 */
package capitulo4.logicaloperators;

/**
 * Operadores logicos de Java haciendo un paso practico
 * 
 * @author luis.monzon
 *
 */
public class LogicalOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		boolean b1 = true;

		boolean b2 = false;

		System.out.println("AND " + (b1 && b2));
		System.out.println("OR " + (b1 || b2));
		System.out.println("AND negativo " + !(b1 && b2));
		System.out.println("& " + (b1 & b2));
		System.out.println("| " + (b1 | b2));
		System.out.println("^ " + (b1 ^ b2));

	}

}
