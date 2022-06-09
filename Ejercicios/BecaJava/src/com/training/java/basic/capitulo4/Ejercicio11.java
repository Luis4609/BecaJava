/**
 * 
 */
package com.training.java.basic.capitulo4;

/**
 * Se deberá calcular el valor absoluto de un float
 * 
 * @author luis.monzon
 *
 */
public class Ejercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		float getAbs = -3232.2f;
//		Math.abs(getAbs);
		float abs = (getAbs > 0) ? getAbs : -getAbs;
		
		System.out.println(abs);

	}

}
