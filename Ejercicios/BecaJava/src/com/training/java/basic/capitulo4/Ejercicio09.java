/**
 * 
 */
package com.training.java.basic.capitulo4;

/**
 * Recibir num de mes y devolver el numero de dias
 * 
 * @author luis.monzon
 *
 */
public class Ejercicio09 {

	int[] cantidadDiasMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	String[] nombreMes = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
			"Octubre", "Noviembre", "Diciembre" };

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int mes = 10;
		//
		if (args.length == 1) {
			switch (mes) {
			case 1:
				System.out.println("Numero de dias del mes especificado: " + 31);
				break;
			case 2:
				System.out.println("Numero de dias del mes especificado: " + 30);
				break;

			default:
				System.out.println("Numero de dias del mes febrero: " + 28);
			}
		}

	}

}
