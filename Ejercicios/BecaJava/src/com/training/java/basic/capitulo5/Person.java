/**
 * 
 */
package com.training.java.basic.capitulo5;

import java.util.ArrayList;

/**
 * 
 * @author luis.monzon
 *
 */
public class Person {

	// Atributes of the Person class
	private String personName;
	private String personFirstSurname;
	private String personSecondSurname;

	/**
	 * @param personName
	 * @param personFirstSurname
	 * @param personSecondSurname
	 */
	public Person(String personName, String personFirstSurname, String personSecondSurname) {
		this.personName = personName;
		this.personFirstSurname = personFirstSurname;
		this.personSecondSurname = personSecondSurname;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonFirstSurname() {
		return personFirstSurname;
	}

	public void setPersonFirstSurname(String personFirstSurname) {
		this.personFirstSurname = personFirstSurname;
	}

	public String getPersonSecondSurname() {
		return personSecondSurname;
	}

	public void setPersonSecondSurname(String personSecondSurname) {
		this.personSecondSurname = personSecondSurname;
	}

	/**
	 * Se deberá generar el trigrama de dicho nombre: Inicial del nombre, inicial
	 * del primer apellido y final del último apellido (puede tener 1 o 2).
	 */
	public String generateTriagram() {

		String personTriagram = "";

		personTriagram += personName.charAt(0);
		personTriagram += personFirstSurname.charAt(0);
		personTriagram += personSecondSurname.charAt(0);

		// show triagram
//		System.out.println(personTriagram);

		return personTriagram;

	}

	/**
	 * Dada una persona, se debe generar su nombre en el siguiente formato Nombre
	 * APELLIDO1 APELLIDO2 e imprimirlo por pantalla
	 */
	private void generatePersonName() {

		try {
			System.out.println("Nombre generado: " + personName + " " + personFirstSurname + " " + personSecondSurname);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @return List of Persons
	 */
	public static ArrayList<Person> generatePersonList() {

		ArrayList<Person> personList = new ArrayList<Person>();

		// Create new Persons
		Person person1 = new Person("Manuel", "Perez", "Alvarez");
		Person person2 = new Person("Jose", "Fernandez", "Gonzales");
		Person person3 = new Person("Luis", "Fernandez", "Gonzales");
		Person person4 = new Person("Manuel", "Perez", "Alvarez");
		Person person5 = new Person("Manolo", "Paco", "Alvarez");
		Person person6 = new Person("Jose", "Fernandez", "Gonzales");
		Person person7 = new Person("Jose", "Felipez", "Gonzales");
		Person person8 = new Person("Pedro", "Manolo", "Gonzales");
		Person person9 = new Person("Alberto", "Teniente", "Pepe");

		// add persons to Array of Persons
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		// 4 and 5 equal to 1
		personList.add(person4);
		personList.add(person5);
		// 6 equal to 2
		personList.add(person6);
		personList.add(person7);

		// Different persons
		personList.add(person8);
		personList.add(person9);

		System.out.println("Size personList:" + personList.size());

		return personList;
	}

	/**
	 * De una lista de personas, se deberán sacar las estadísticas de cuántas tienen
	 * el mismo trigrama.
	 * 
	 * @return
	 */
	public static int getTriagramStatistics(ArrayList<Person> personList) {

		int numberOfPersonsWithSameTriagram = 0;
		int numberOfRepeatedTriagrams = 0;

		if (personList == null || personList.size() == 0) {
			return 0;
		} else {
			// Check if a person has the same Triagram

			ArrayList<String> triagramArray = new ArrayList<String>();

			for (Person person : personList) {
				// Si el Tiagrama se encuentra en el array, se suma, si no se encuentra se añade
				if (!triagramArray.contains(person.generateTriagram())) {
					triagramArray.add(person.generateTriagram());
				} else {
					numberOfRepeatedTriagrams++;
				}
			}

		}
		System.out.println("Number of times a triagram repeat: " + (numberOfRepeatedTriagrams));
		return numberOfPersonsWithSameTriagram + numberOfRepeatedTriagrams;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// new Person
		Person person = new Person("Pepe", "Perez", "Rodriguez");
		person.generatePersonName();
		person.generateTriagram();
		System.out.println("toString() = " + person.toString());

		// show stats for the triagrams of the list
		System.out.println("Triagram stats (numero de veces que se repite el mismo Triagrama) = "
				+ getTriagramStatistics(generatePersonList()));
	}

	public String toString() {
		return personName + " " + personFirstSurname + " " + personSecondSurname;
	}
}
