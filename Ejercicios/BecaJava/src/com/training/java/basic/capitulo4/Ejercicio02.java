/**
 * 
 */
package com.training.java.basic.capitulo4;

/**
 * Calcular el area de un rectangulo e imprima por pantalla el texto “El
 * rectángulo de … por … tiene un área de …”.
 * 
 * @author luis.monzon
 *
 */
public class Ejercicio02 {
	
	static void imprimirTexto(int a, int b) {
		System.out.println("El rectángulo de " + a + " por " + b + " tiene un área de " + (a * b));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		imprimirTexto(4,5);

	}

}
