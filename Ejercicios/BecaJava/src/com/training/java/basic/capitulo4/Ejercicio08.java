/**
 * 
 */
package com.training.java.basic.capitulo4;

/**
 * @author luis.monzon
 *
 */
public class Ejercicio08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i = 0;
		
		if (args.length < 1) {
			System.out.println("No hay argumentos");
		} else {
			do {

				System.out.println("Args en la pos: " + i + "arg: " + args[i]);
				i++;
				
			}while(!args[i].equalsIgnoreCase("fin"));
		}
		

	}

}
