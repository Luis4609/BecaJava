/**
 * 
 */
package capitulo3.javavariables;

/**
 * @author luis.monzon
 *
 */
public class InstanceVariables {

	/*
	 * Cada uno de los objetos de la clase InstanceVariables que se cree tendrá su
	 * propia variable de instancia myInstanceVar
	 */
	String myInstanceVar = "instance variable";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		InstanceVariables obj = new InstanceVariables();
		InstanceVariables obj2 = new InstanceVariables();
		InstanceVariables obj3 = new InstanceVariables();

		System.out.println(obj.myInstanceVar);
		System.out.println(obj2.myInstanceVar);
		System.out.println(obj3.myInstanceVar);

		// Se cambia la variable de instancia myInstanceVar del obj2
		obj2.myInstanceVar = "Changed text";
		
		System.out.println(obj2.myInstanceVar);

	}

}
