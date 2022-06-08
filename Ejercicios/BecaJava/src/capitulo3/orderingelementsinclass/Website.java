/**
 *  Declaración del package 
 */
package capitulo3.orderingelementsinclass;

/**
 *  Imports, después de la declaración del paquete.
 */
import java.util.Calendar;
import java.util.Date;

/**
 * Capítulo 3: Bloques básicos en Java
 * 
 * @author luis.monzon
 * 
 *         Esta clase prentende mostrar la estructura de una clase Java. Como se
 *         puede ver, los comentarios pueden estar en cualquier parte de la
 *         clase.
 *
 */
public class Website {

	// Variables de instancia
	String webName;
	int webAge;

	/**
	 * @param webName
	 * @param webAge
	 */
	public Website(String webName, int webAge) {
		super();
		this.webName = webName;
		this.webAge = webAge;
	}

	/**
	 * Método de la clase Website
	 * 
	 * @return actual time
	 */
	public Date fechaActual() {
		Calendar c1 = Calendar.getInstance();
		return c1.getTime();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
