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
	 * Constructor vac�o
	 */
	public Puppy() {

	}

	/**
	 * Constructor con un par�metro
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
