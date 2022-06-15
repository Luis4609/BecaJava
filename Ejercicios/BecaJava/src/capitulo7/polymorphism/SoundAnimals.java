/**
 * 
 */
package capitulo7.polymorphism;

/**
 * @author luis.monzon
 *
 */
public class SoundAnimals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		sound(new Cat());
		sound(new Horse());
		sound(new Animal());

	}

	public static void sound(Animal animal) {
		
		System.out.println("Animal sound: " + animal.getSound());
	}

}
