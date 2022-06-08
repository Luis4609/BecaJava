/**
 * 
 */
package capitulo3.javavariables;

/**
 * @author luis.monzon
 *
 */
public class LocalVariables {

	// Variable de instancia myVar

	public String myVar = "instance variable";

	public void myMethod() {

		// Variable local myVar
		String myVar = "Inside method";
		System.out.println(myVar);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LocalVariables obj = new LocalVariables();
		System.out.println("Calling Method");
		obj.myMethod();
		System.out.println(obj.myVar);

	}

}
