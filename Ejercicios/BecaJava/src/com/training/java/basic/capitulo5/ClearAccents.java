/**
 * 
 */
package com.training.java.basic.capitulo5;

import java.text.Normalizer;

/**
 * Se deberá crear una funcionalidad que retire los acentos de una palabra (las
 * palabras están en castellano y en minúsculas)
 * 
 * @author luis.monzon
 *
 */
public class ClearAccents {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(stripAccents("cápitulo"));
		System.out.println(stripAccents("página página"));
		System.out.println(stripAccents("Hola buenas a todos ASí"));

	}

	/**
	 * @param str
	 * @return
	 */
	public static String stripAccents(String str) {
		
		str = Normalizer.normalize(str, Normalizer.Form.NFD);
		str = str.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
		
		return str;
	}

}
