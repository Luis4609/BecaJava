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

		// Crear Lista de plantas
		ArrayList<Planta> plantas = new ArrayList<>();

		Planta planta1 = new Planta(EspecieCM.getEspecieByName("Maiz"), "Maiz");
		plantas.add(planta1);

		// Crear Lista de Jardineras
		ArrayList<Jardinera> jardinerasHuerto1 = new ArrayList<>();

		// Crear jardinera1
		Jardinera jardinera1 = new Jardinera(1000, null, plantas);
		jardinerasHuerto1.add(jardinera1);

//		// Crear jardinera2
//		Jardinera jardinera2;
//		jardinerasHuerto1.add(jardinera2);
//		
//		// Crear jardinera3
//		Jardinera jardinera3;
//		jardinerasHuerto1.add(jardinera3);

		// Crear un huerto
		Huerto huerto = new Huerto(1, jardinerasHuerto1);
		
		System.out.println("Nuestro huerto: " + huerto.toString());
	}

	@Override
	public String toString() {
		return "Huerto [espacio=" + espacio + ", jardineras=" + jardineras + "]";
	}

}
