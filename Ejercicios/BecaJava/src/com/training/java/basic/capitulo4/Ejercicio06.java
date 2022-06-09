/**
 * 
 */
package com.training.java.basic.capitulo4;

/**
 * @author luis.monzon
 *
 */
public class Ejercicio06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		if (args.length < 1) {
			System.out.println("No se han recibido argumentos");
		} else {
			for (int i = 0; i < args.length; i++) {
				System.out.println("Argumentos en la posicion: " + (i) + " el argumento: " + args[i]);
			}
		}

	}

}
