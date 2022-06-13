/**
 * 
 */
package com.training.java.basic.capitulo5;

import java.text.Normalizer;

/**
 * Se deber� crear una funcionalidad que retire los acentos de una palabra (las
 * palabras est�n en castellano y en min�sculas)
 * 
 * @author luis.monzon
 *
 */
public class ClearAccents {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(stripAccents("c�pitulo"));
		System.out.println(stripAccents("p�gina p�gina"));
		System.out.println(stripAccents("Hola buenas a todos AS�"));

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
