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
	private String especie;
	private double profundidad;
	private double distanciaEntrePlanta;
	// SIEMBRA - meses en los que se pueden sembrar dischas plantas
	private ArrayList<Meses> mesesDeSiembraDirecta;
	private ArrayList<Meses> mesesDeSiembraProtegida;
	// RECOLECCION - tiempo que tarda en poder recolectar las plantas
	private int[] tiempoDeRecoleccion;
	// TIPO DE SIEMBRA
	private TipoDeSiembra tipoDeSiembra;
	// GERMINACION - tiempo en dias que tarda en germinar una planta
	private int[] tiempoDeGerminacion;
	// TRANSPLANTE -
	// LITROS SUSTRATO - cantidad de sustrato en Litros
	private double volumenSustrato;
	// RIEGO - Tipo de riego
	// INDICE DE RIEGO

	@Override
	public String toString() {
		return "Planta [volumenSustrato=" + volumenSustrato + "]";
	}

}
