/**
 * 
 */
package com.training.java.basic.capitulo7.huerto;

import java.util.ArrayList;

enum forma {
	RECTANGULAR, TUBULAR
}

/**
 * @author luis.monzon
 *
 */
public class Jardinera {

	// ATRIBUTOS
	// Tamaño de la jardinera
	private int tamanoJardinera;

	// Profundidad
	private double profundidad;
	// Forma de la Jardinara
	private forma forma;
	// Lista de plantas que se encuentran en la jardinara
	private ArrayList<Planta> plantas;

	public ArrayList<Planta> getPlantas() {
		return plantas;
	}

	public void setPlantas(ArrayList<Planta> plantas) {
		this.plantas = plantas;
	}

	public int getTamanoJardinera() {
		return tamanoJardinera;
	}

	public forma getFormaJardinera() {
		return forma;
	}

	/**
	 * 
	 */
	public Jardinera() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param tamanoJardinera
	 * @param formaJardinera
	 * @param plantas
	 */
	public Jardinera(int tamanoJardinera, forma formaJardinera, ArrayList<Planta> plantas) {
		this.tamanoJardinera = tamanoJardinera;
		this.forma = formaJardinera;
		this.plantas = plantas;
	}

	/**
	 * Encontrar si dos plantas son compatibles entre si
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean plantasCompatibles(Especie a, Especie b) {
		return false;
	}

	/**
	 * Devolver si una planta cabe en la Jardinera
	 * 
	 * @param a
	 * @return
	 */
	public static boolean cabePlanta(Especie a) {

		return false;
	}

	@Override
	public String toString() {
		return "Jardinera [tamanoJardinera=" + tamanoJardinera + ", formaJardinera=" + forma + ", plantas=" + plantas
				+ "]";
	}

}
