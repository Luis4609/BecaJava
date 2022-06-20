package com.training.java.basic.capitulo7.huerto;

import java.util.ArrayList;

public class EspecieCM {

	/**
	 * @param especie
	 */
	public static void addEspecie(Especie especie) {

	}

	/**
	 * @param especie
	 */
	public static void deleteEspecie(Especie especie) {

	}

	/**
	 * @param especies
	 */
	public static void printEspecies(ArrayList<Especie> especies) {

		for (Especie especie : especies) {
			System.out.println("Especie: " + especie.get_Nombre() + " ");
		}

	}

	/**
	 * @param name
	 * @return
	 */
	public static Especie getEspecieByName(String name) {

		Especie especie = null;

		ArrayList<Especie> especiesList = new ArrayList<Especie>();

		especiesList = EspecieRepository.getEspecies();

		for (Especie especie2 : especiesList) {
			if (especie2.get_Nombre().contentEquals(name)) {
				especie = especie2;
			}
		}

		return especie;

	}

	public static void main(String[] args) {

		printEspecies(EspecieRepository.getEspecies());

	}
}
