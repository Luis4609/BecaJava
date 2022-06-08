package capitulo3.javaclassstructure;

/**
 * Capítulo 3: Bloques básicos en Java
 * 
 * Esta clase define objetos tipo Dog
 * 
 * @author luis.monzon
 *
 */
public class Dog {

	// Atributos de la clase Dog
	String breed;
	int age;
	String color;

	/**
	 * @param bark contiene el número de ladridos
	 * @return bark un entero con el número de ladridos modificado
	 */
	public int barking(int bark) {
		bark = bark + 1;
		return bark;
	}//Cierre de método barking()

	// Metodo en blanco
	private void hungry() {

	}// Cierre de método hungry()

	// Metodo en blanco
	private void sleeping() {

	}// Cierre de métodosleeping()
	
}// Cierre de clase Dog
