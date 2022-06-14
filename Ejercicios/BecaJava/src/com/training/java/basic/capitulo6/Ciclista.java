/**
 * 
 */
package com.training.java.basic.capitulo6;

import java.util.ArrayList;

/**
 * @author luis.monzon
 *
 */
public class Ciclista {

	private String nombre;
	private String ciudad;
	private int numero;
	private String calle;
	private boolean usaCasco;

	// Lista de bicicletas
	private ArrayList<Bicicleta> listaBicicletas;

	public ArrayList<Bicicleta> getListaBicicletas() {
		return listaBicicletas;
	}

	public void setListaBicicletas(ArrayList<Bicicleta> listaBicicletas) {
		this.listaBicicletas = listaBicicletas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public boolean isUsaCasco() {
		return usaCasco;
	}

	public void setUsaCasco(boolean usaCasco) {
		this.usaCasco = usaCasco;
	}

	/**
	 * @param nombre
	 * @param ciudad
	 * @param numero
	 * @param calle
	 * @param usaCasco
	 * @param listaBicicletas
	 */
	public Ciclista(String nombre, String ciudad, int numero, String calle, boolean usaCasco,
			ArrayList<Bicicleta> listaBicicletas) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.numero = numero;
		this.calle = calle;
		this.usaCasco = usaCasco;
		this.listaBicicletas = listaBicicletas;
	}

	/**
	 * Constructor sin Lista de Bicicletas
	 * 
	 * @param nombre
	 * @param ciudad
	 * @param numero
	 * @param calle
	 * @param usaCasco
	 */
	public Ciclista(String nombre, String ciudad, int numero, String calle, boolean usaCasco) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.numero = numero;
		this.calle = calle;
		this.usaCasco = usaCasco;

	}

	/**
	 * Comprar bici añadirá una bici de la lista de bicis en posesión del ciclista
	 * 
	 * @param bici
	 */
	public void comprarBicicleta(Bicicleta bici) {

		ArrayList<Bicicleta> nuevaListaBicicletas = new ArrayList<>();

		nuevaListaBicicletas = getListaBicicletas();

		nuevaListaBicicletas.add(bici);

		setListaBicicletas(nuevaListaBicicletas);

		System.out.println("Se ha comprado una nueva bici: " + bici.toString());

	}

	/**
	 * Vender bici borrara una bici de la lista de bicis en posesión del ciclista
	 * 
	 * @param bici
	 */
	public void venderBicicleta(Bicicleta bici) {

		ArrayList<Bicicleta> nuevaListaBicicletas = new ArrayList<>();

		nuevaListaBicicletas = getListaBicicletas();

		if (nuevaListaBicicletas.contains(bici)) {
			nuevaListaBicicletas.remove(bici);
		}

		setListaBicicletas(nuevaListaBicicletas);
	}

	@Override
	public String toString() {
		return "Ciclista [nombre=" + nombre + ", ciudad=" + ciudad + ", numero=" + numero + ", calle=" + calle
				+ ", usaCasco=" + usaCasco + ", listaBicicletas=" + listaBicicletas + "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Creo luz delantera y trasera
		Luz luzDelanteraBiciPepe = new Luz(null, false, 0);
		Luz luzTraseraBiciPepe = new Luz(null, false, 0);

		// Creo nueva bicicleta
		Bicicleta biciPepe = new Bicicleta("Rojo", 8, 30.0, 2, luzTraseraBiciPepe, luzDelanteraBiciPepe);
		Bicicleta biciPepe2 = new Bicicleta("Blanco", 7, 10.0, 2, luzTraseraBiciPepe, luzDelanteraBiciPepe);

		// Crear lista de bicicletas para el ciclista PEPE
		ArrayList<Bicicleta> listaBicisPepe = new ArrayList<Bicicleta>();
		listaBicisPepe.add(biciPepe);
		listaBicisPepe.add(biciPepe2);

		// Crear nuevo Ciclista
		Ciclista pepe = new Ciclista("Pepe", "Madrid", 21, "Calle del Carmen", false, listaBicisPepe);

		// Operaciones
//		pepe.comprarBicicleta(biciPepe);

		// Mostrar al ciclista PEPE
		System.out.println(pepe.toString());

		// Operaciones sobre la bicicleta
		biciPepe.acelerarBicicleta();
		biciPepe.acelerarBicicleta(10.0);
		biciPepe.bajarMarcha();

	}

}
