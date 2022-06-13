/**
 * 
 */
package com.training.java.basic.capitulo5;

/**
 * Se deberá generar la secuencia “1-2-3-...-30000” en un String y comparar
 * tiempos y uso de memoria entre las distintas técnicas de concatenación
 * aprendidas.
 * 
 * @author luis.monzon
 *
 */
public class MemoryCheckString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Get exec time
		long startTime = System.nanoTime();
//		generateSecuencia();
		generateSecuenciaConcat();
		
		long endTime = System.nanoTime();

		//return duration of the exec time
		long duration = (endTime - startTime);

		System.out.println("Exec time with FOR: " + duration / 1_000_000);
	}

	/**
	 * @return
	 */
	@SuppressWarnings("unused")
	private static String generateSecuencia() {

		String secuencia = "";
		// generar string 
		for (int i = 1; i < 30001; i++) {
			secuencia += i + "-";
		}
		
		return secuencia;

	}
	
	/**
	 *  Generate String using concat method
	 * @return
	 */
	private static String generateSecuenciaConcat() {
		
		String strConcat = "";
		
		for (int i = 1; i < 30001; i++) {
			strConcat.concat("-" + i);
		}
		
		return strConcat;
		
	}

}
