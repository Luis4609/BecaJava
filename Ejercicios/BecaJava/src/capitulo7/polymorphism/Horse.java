/**
 * 
 */
package capitulo7.polymorphism;

/**
 * @author luis.monzon
 *
 */
public class Horse extends Animal {

	public String getSound() {
		return "Neigh";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Animal animal = new Horse();
		Horse horse = (Horse) animal;
		horse.displayInformation();

	}

}
