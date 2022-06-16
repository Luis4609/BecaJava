/**
* 
*/
package com.training.java.basic.capitulo7.huerto;

import java.util.ArrayList;

/**
 * @author luis.monzon
 *
 */
public class Huerto {

	// Atributos
	// Numero de ventanas en las que se puede tener el huerto, que es equivalente a
	// espacio
	private int espacio;
	// Lista de jardineras que forman un HUERTO
	private ArrayList<Jardinera> jardineras;

	/**
	 * 
	 */
	public Huerto() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param espacio    cantidad de espacio disponible (int)
	 * @param jardineras Lista de Jardineras que estan en el Huerto
	 */
	public Huerto(int espacio, ArrayList<Jardinera> jardineras) {
		this.espacio = espacio;
		this.jardineras = jardineras;
	}

	public int getEspacio() {
		return espacio;
	}

	public void setEspacio(int espacio) {
		this.espacio = espacio;
	}

	public ArrayList<Jardinera> getJardineras() {
		return jardineras;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Planta planta1 = new Planta();
		Planta planta2 = new Planta();
		Planta planta3 = new Planta();
		Planta planta4 = new Planta();
		Planta planta5 = new Planta();
		Planta planta6 = new Planta();

		ArrayList<Planta> plantas = new ArrayList<Planta>();
		plantas.add(planta1);
		plantas.add(planta2);
		plantas.add(planta3);
		plantas.add(planta4);
		plantas.add(planta5);
		plantas.add(planta6);

		Jardinera jardinera1 = new Jardinera(2, forma.RECTANGULAR, plantas);
		Jardinera jardinera2 = new Jardinera(2, forma.RECTANGULAR, plantas);
		Jardinera jardinera3 = new Jardinera(2, forma.RECTANGULAR, plantas);
		Jardinera jardinera4 = new Jardinera(2, forma.TUBULAR, plantas);

		ArrayList<Jardinera> jardineras = new ArrayList<Jardinera>();
		jardineras.add(jardinera1);
		jardineras.add(jardinera2);
		jardineras.add(jardinera3);
		jardineras.add(jardinera4);

		Huerto huerto = new Huerto(5, jardineras);

		System.out.println("Huerto:" + huerto);

	}

	@Override
	public String toString() {
		return "Huerto [espacio=" + espacio + ", jardineras=" + jardineras + "]";
	}

}
