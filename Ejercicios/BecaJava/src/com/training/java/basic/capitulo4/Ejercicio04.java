/**
 * 
 */
package com.training.java.basic.capitulo4;

/**
 * @author luis.monzon
 *
 */
public class Ejercicio04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if (args.length < 1) {
			System.out.println("No se han recibido argumentos");
		} else if (args.length <= 4) {
			System.out.println("Numero de argumentos recibidos:" + args.length);
		} else {
			System.out.println("Se han recibido mas de 4 argumentos");
		}

	}

}
