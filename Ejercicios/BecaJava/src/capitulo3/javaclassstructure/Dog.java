package capitulo3.javaclassstructure;

/**
 * Cap�tulo 3: Bloques b�sicos en Java
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
	 * @param bark contiene el n�mero de ladridos
	 * @return bark un entero con el n�mero de ladridos modificado
	 */
	public int barking(int bark) {
		bark = bark + 1;
		return bark;
	}//Cierre de m�todo barking()

	// Metodo en blanco
	private void hungry() {

	}// Cierre de m�todo hungry()

	// Metodo en blanco
	private void sleeping() {

	}// Cierre de m�todosleeping()
	
}// Cierre de clase Dog
