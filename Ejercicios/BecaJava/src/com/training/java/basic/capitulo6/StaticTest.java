/**
 * 
 */
package com.training.java.basic.capitulo6;

/**
 * @author luis.monzon
 *
 */
public class StaticTest {

	private static int enteroStatic = 0;
	private int entero = 0;

	/**
	 * Incrementar un entero e Imprimir por pantalla un entero (int)
	 * 
	 * @param a
	 */
	public void printEnteroStatic() {

		System.out.println("Entero con static" + enteroStatic++);
	}

	/**
	 * Incrementar un entero e Imprimir por pantalla un entero (int)
	 * 
	 * @param a
	 */
	public void printEntero() {

		entero++;
		System.out.println("Entero sin static: " + entero);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		StaticTest test1 = new StaticTest();

		// llamando metodo no estatico
		test1.printEntero();
		// llamando metodo static
		test1.printEnteroStatic();

	}

}
