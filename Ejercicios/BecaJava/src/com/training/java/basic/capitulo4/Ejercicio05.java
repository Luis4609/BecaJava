/**
 * 
 */
package com.training.java.basic.capitulo4;

/**
 * @author luis.monzon
 *
 */
public class Ejercicio05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int contador = 0;

		if (args.length < 1) {
			System.out.println("No se han recibido argumentos");
		} else {
			for (String arg : args) {
				System.out.println("Argumentos en la posicion: " + (contador++) + " el argumento: " + arg);
			}
		}

	}

}
