/**
 * 
 */
package capitulo3.javavariables;

/**
 * @author luis.monzon
 *
 */
public class ClassVariables {

	/*
	 * Cada uno de los objetos de la clase ClassVariables que se cree tendrá la
	 * misma variable myClassVar
	 */
	public static String myClassVar = "class or static variable";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ClassVariables obj = new ClassVariables();
		ClassVariables obj2 = new ClassVariables();
		ClassVariables obj3 = new ClassVariables();

		System.out.println(obj.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);

		/*
		 * Se cambia la variable myClassVar del obj2 y por tanto, puesto que es la
		 * única, cambiará también para obj y obj3
		 */
		obj2.myClassVar = "Changed Text";

		System.out.println(obj.myClassVar);
		System.out.println(obj2.myClassVar);
		System.out.println(obj3.myClassVar);
	}

}
