/**
 * 
 */
package capitulo3.creatingobjects;

/**
 * @author luis.monzon
 *
 */
public class Puppy {

	/**
	 * Constructor vacío
	 */
	public Puppy() {

	}

	/**
	 * Constructor con un parámetro
	 * 
	 * @param name
	 */
	public Puppy(String name) {
		System.out.println("Passed Name is: " + name);
	}

	public static void main(String[] args) {

		Puppy myPuppy = new Puppy("Tommy");
	}
}
