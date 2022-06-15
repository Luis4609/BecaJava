/**
 * 
 */
package capitulo7.polymorphism;

/**
 * @author luis.monzon
 *
 */
public class Cat extends Animal {

	/**
	 *
	 */
	public String getSound() {
		return "Meow";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Animal cat = new Cat();
		cat.displayInformation();
	}

}
