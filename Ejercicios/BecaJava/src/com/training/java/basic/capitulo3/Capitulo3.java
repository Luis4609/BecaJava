/**
 * 
 */
package com.training.java.basic.capitulo3;

import java.util.Random;

/**
 * @author luis.monzon
 *
 */
public class Capitulo3 {

	/**
	 * Bloque inicializador de instancia num
	 */
	{
		int num = 2322;
		System.out.println("Valor bloque inicial con la variable num: " + num);
	}

	Random randomNumber = new Random();

	// Argumentos de la clase Capitulo 3

	/**
	 * Indica si se ha finalizado el capitulo
	 */
	boolean finalizado = true;
	/**
	 * Horas de duracion de un capitulo
	 */
	int horasDuracionCapitulo = 10;

	/**
	 * Obtener numero aleatorio entre 0 y 9
	 */
	int randomValue = randomNumber.nextInt(10);

	/**
	 * Título del capitulo
	 */
	static String titulo = "Bloques Básicos";
	/**
	 * Descripcion del capitulo
	 */
	static String description = "Esto es un String";

	/**
	 * Constructor vacio
	 */
	public Capitulo3() {
		super();

	}

	/**
	 * @param finalizado
	 * @param horasDuracionCapitulo
	 */
	public Capitulo3(boolean finalizado, int horasDuracionCapitulo) {
		super();
		this.finalizado = finalizado;
		this.horasDuracionCapitulo = horasDuracionCapitulo;
		this.randomValue = randomNumber.nextInt(10);

		int horasEstimadas = 25;
	}

	/**
	 * Mostrar por pantalla un mensaje junto al parametro de entrada
	 * 
	 * @param texto
	 */
	private void getTexto(String texto) {

		System.out.println("Me has mandado el texto: " + texto);
	}

	/**
	 * Devolver un numero aleatorio entre un maximo y un minimo
	 * 
	 * @param max
	 * @param min
	 * @return randomNumber entre Max y min
	 */
	private int getRandomNumber(int max, int min) {

		int newRandom = randomNumber.nextInt(max + min) + min;
		return newRandom;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Estoy aprendiendo a programar en Java");

		Capitulo3 cp = new Capitulo3(true, 7);

		// Mandar un mensaje
		cp.getTexto("he pasado este mensaje");

		// Mostrar un valor aleatorio entre 0 - 5
		System.out.println("Mostrar un valor aleatorio entre 0 - 5: " + cp.getRandomNumber(5, 0));

		// Mostrar variables static
		System.out.println("Título: " + titulo);
		System.out.println(description);

		// Comprobar si se ha mandado un mensaje por consola
		if (args.length > 0) {
			System.out.println("Me has mandado el texto como argumento: " + args[0]);
		} else {
			System.out.println("No se ha pasado ningun mensaje por teclado");
		}

		// Crear 2 objetos Capitulo3 para destruirlos
		Capitulo3 cp2 = new Capitulo3();
		Capitulo3 cp3 = new Capitulo3();

		cp3 = cp2;

		System.gc();

	}

	/**
	 * Override el metodo finalize del GC
	 */
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage collection is performed by JVM");
	}

	/**
	 * Bloque inicializador de instancia
	 */
	{
		String myInstance = "Este bloque es un inicializador de instancia";
		System.out.println(myInstance);
	}

}
