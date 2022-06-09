/**
 * 
 */
package com.training.java.basic.capitulo4;

/**
 * @author luis.monzon
 *
 */
public class Ejercicio07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Check si hay args
		if (args.length < 1) {
			System.out.println("No hay argumentos");
		} else {
			int i = 0;

			while (i < args.length && !args[i].equalsIgnoreCase("fin")) {
				System.out.println("Args en la pos: " + i + "arg: " + args[i]);
				i++;
			}

		}

	}

}
