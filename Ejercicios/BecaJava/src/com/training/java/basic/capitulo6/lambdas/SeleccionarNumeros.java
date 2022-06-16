/**
 * 
 */
package com.training.java.basic.capitulo6.lambdas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

/**
 * @author luis.monzon
 *
 */
public class SeleccionarNumeros implements CombinarNumeros {

	/**
	 * Comprobar si un numero cumple una condicion
	 * 
	 * @param numberList
	 * @param checker
	 * @return
	 */
	public static boolean checkNumberList(Integer number, Predicate<Integer> checker) {

		if (checker.test(number)) {
			System.out.println("Number " + number);
			return true;
		}
		return false;

	}

	/**
	 * @param numbers
	 * @param predicate
	 * @return
	 */
	public static ArrayList<Integer> processNumbers(int[] numbers, Predicate<Integer> predicate) {

		ArrayList<Integer> result = new ArrayList<Integer>();

		for (Integer num : numbers)
			if (predicate.test(num))
				result.add(num);

		System.out.println("Process: ");
		return result;
	}

	/**
	 * Delete elements from a List with a given condition
	 * 
	 * @param <T>
	 * @param elementsList
	 * @param condition
	 * @return
	 */
	public static <T> ArrayList<T> removeElementsWithCondition(ArrayList<T> elementsList, Predicate<T> condition) {

		// Create an iterator from the l
		Iterator<T> itr = elementsList.iterator();

		// Find and remove all null
		while (itr.hasNext()) {

			// Fetching the next element
			T t = itr.next();

			// Checking for Predicate condition
			if (!condition.test(t)) {

				// If the condition matches,
				// remove that element
				itr.remove();
			}
		}

		// Return the null
		return elementsList;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Predicate<Integer> isPositive = i -> (i > 0);
		Predicate<Integer> isPar = i -> (i % 2 == 0);

//		checkNumberList(5, isPositive);
//		checkNumberList(-3, isPositive.negate());
//		checkNumberList(20, isPar);
//		checkNumberList(-21, isPositive.negate().and(isPar.negate()));

		// Array
		// Listas con diferentes variantes
		int[] numPositivos = { 1, 3, 5, 453243, 3, 21 };
		int[] numNegativos = { -1, -32, -43232, -3 };
		int[] numPares = { 2, 4, 6, 8, 10, 12 };
		int[] numImparesNegativos = { -21, -3, -53, -1, -43 };

		System.out.println(processNumbers(numPositivos, isPositive));
		System.out.println(processNumbers(numPares, isPar));
		System.out.println(processNumbers(numNegativos, isPositive.negate()));
		System.out.println(processNumbers(numImparesNegativos, isPositive.negate().and(isPar.negate())));

		// Crear lista de elementos
		ArrayList<Integer> elementList = new ArrayList<>();

		int[] numRandom = { 10, -3, -53, -1, -44 };

		// rellenar lista de elementos con numeros negativos
		for (int i = 0; i < numRandom.length; i++) {
			elementList.add(numRandom[i]);
		}

		// REMOVE ELEMENTS
		System.out.println("Borrar los elementos de la lista que no sean pares: "
				+ removeElementsWithCondition(elementList, isPar));

		// Using removeIf()
		
		elementList.removeIf(isPositive);
		System.out.println("Elementos que me quedan despues de borrar !isPar y isPositive:" + elementList);

	}

	/**
	 * @param a
	 * @param b
	 * @return
	 */
	@Override
	public int cNum(int a, int b) {

		Predicate<Integer> isPositive = i -> (i > 0);

		if (checkNumberList(a, isPositive) && checkNumberList(b, isPositive)) {
			System.out.println("Dos positivos");
		}
		if (checkNumberList(a, isPositive.negate()) && checkNumberList(b, isPositive.negate())) {
			System.out.println("Dos negativos");
		}
		if (checkNumberList(a, isPositive) || checkNumberList(b, isPositive.negate())
				|| (checkNumberList(a, isPositive.negate()) || (checkNumberList(b, isPositive)))) {
			System.out.println("Son diferentes");
		}

		//
		System.out.println("Suma de los dos parametros:" + (a + b));

		// Restar 1 a los dos números y multiplicarlos, mostrando el resultado por
		// pantalla.
		System.out.println("Operacion, resto 1 a los parametros y multiplico: " + ((a - 1) * (b - 1)));

		// Mostrar por pantalla un mensaje dependiendo de los dos números de entrada (el
		// valor de
		// retorno de la expresión lambda será “null”):

		return 0;
	}

}
