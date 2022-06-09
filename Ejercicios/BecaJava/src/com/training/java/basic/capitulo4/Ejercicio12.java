/**
 * 
 */
package com.training.java.basic.capitulo4;

import java.util.Random;
import java.util.Scanner;

enum Jugada {
	PIEDRA, PAPEL, TIJERAS
}

/**
 * jugar a piedra-papel-tijeras contra el ordenador Se tendrá que explicar al
 * jugador cómo se juega, pedirle que dé su jugada (Piedra, papeL, Tijeras,
 * Salir), generar una jugada aleatoria para el ordenador y decidir quien ha
 * ganado.
 * 
 * @author luis.monzon
 *
 */
public class Ejercicio12 {

	/**
	 * @return jugada random
	 */
	static String randomJugada() {

		String jugadaRandom = null;
		Random random = new Random();

		int valueJugada = random.nextInt(3);

		switch (valueJugada) {
		case 0:
			jugadaRandom = "Piedra";
			break;
		case 1:
			jugadaRandom = "Papel";
			break;
		default:
			jugadaRandom = "Tijeras";
		}

		return jugadaRandom;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println(
				"Las reglas del juego son las siguientes: Piedra gana a Tijeras, Papel gana a Pierda y Tijeras gana a Papel");

		System.out.println("Por favor proporciona tu jugada: ");

		String jugada = scan.nextLine();

		while (!jugada.equalsIgnoreCase("Salir")) {

			String jugadaPc = randomJugada();

			if (jugada.equalsIgnoreCase("Piedra")) {
				// Se ha jugado piedra, por lo tanto se gana contra tijeras y pierde contra
				// papel
				if (jugada.equalsIgnoreCase(jugadaPc)) {
					System.out.println("Se tiene que repetir, se ha empatado");
				} else {
					if (jugada != jugadaPc && jugadaPc == "Tijeras") {
						System.out.println("Has ganado!!!" + jugada + jugadaPc);
					} else {
						System.out.println("Has perdido"  + jugada + jugadaPc);
					}
				}
			} else if (jugada.equalsIgnoreCase("Papel")) {
				// Se ha jugado papel, por lo tanto se gana contra piedra y pierde contra
				// tijeras
				if (jugada == jugadaPc) {
					System.out.println("Se tiene que repetir, se ha empatado");
				} else {
					if (jugada != jugadaPc && jugadaPc == "Piedra") {
						System.out.println("Has ganado!!!");
					} else {
						System.out.println("Has perdido");
					}
				}
			} else {
				// Se ha jugado tijeras, por lo tanto se gana contra papel y pierde contra
				// piedra
				if (jugada == jugadaPc) {
					System.out.println("Se tiene que repetir, se ha empatado");
				} else {
					if (jugada != jugadaPc && jugadaPc == "Papel") {
						System.out.println("Has ganado!!!");
					} else {
						System.out.println("Has perdido");
					}
				}
			}
			scan.nextLine();
		}

		scan.close();

	}
}
