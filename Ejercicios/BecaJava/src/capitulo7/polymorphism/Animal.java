/**
 * 
 */
package capitulo7.polymorphism;

/**
 * @author luis.monzon
 *
 */
public class Animal {

	public String getSound() {
		return "Unknown";
	}

	public void displayInformation() {
		System.out.println("Animal is making a sound: " + getSound());
	}

}
