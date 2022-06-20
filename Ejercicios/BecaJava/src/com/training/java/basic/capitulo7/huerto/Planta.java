/**
 * 
 */
package com.training.java.basic.capitulo7.huerto;

import java.util.ArrayList;

enum TipoDeSiembra {
	DIRECTA, PROTEGIDA
}

enum Meses {
	ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE
}

/**
 * @author luis.monzon
 *
 */
public class Planta {

	// Atributos de planta
	private Especie especie;

	private String nombre;

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param especie
	 * @param nombre
	 */
	public Planta(Especie especie, String nombre) {
		this.especie = especie;
		this.nombre = nombre;
	}

	/**
	 * 
	 */
	public Planta() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Planta [especie=" + especie + ", nombre=" + nombre + "]";
	}

}
