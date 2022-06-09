/**
 * 
 */
package com.training.java.basic.capitulo4;

/**
 * @author luis.monzon
 *
 */
public class Ejercicio10 {

	/**
	 * @param ancho
	 * @param alto
	 */
	static void printRec(int ancho, int alto, char ch) {
		for (int i = 0; i < ancho; i++) {
			for (int j = 0; j < alto; j++) {
				System.out.print(ch);
			}
			System.out.println();

		}

	}

	/**
	 * @param ancho
	 * @param alto
	 * @return
	 */
	static void multiplo3(int ancho, int alto) {

		int area = ancho * alto;
		if (area % 3 == 0) {
			printRec(ancho, alto, '#');

		} else if (area % 3 == 1) {
			printRec(ancho, alto, '%');

		} else {
			printRec(ancho, alto, 'X');
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		multiplo3(2, 5);
	}

}
