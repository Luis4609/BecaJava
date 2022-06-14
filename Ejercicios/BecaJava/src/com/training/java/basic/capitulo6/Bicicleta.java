/**
 * 
 */
package com.training.java.basic.capitulo6;

/**
 * @author luis.monzon
 *
 */
/**
 * @author luis.monzon
 *
 */
public class Bicicleta {

	private String color;
	private int numMarchas;
	private double velocidadActual;
	private int marchaActual;
	// Atributos Luz bicicleta
	private Luz luzTrasera;
	private Luz luzDelantera;

	/**
	 * @param color
	 * @param numMarchas
	 * @param velocidadActual
	 * @param marchaActual
	 * @param luzDelantera
	 * @param luzTrasera
	 */
	public Bicicleta(String color, int numMarchas, double velocidadActual, int marchaActual, Luz luzDelantera,
			Luz luzTrasera) {
		this.color = color;
		this.numMarchas = numMarchas;
		this.velocidadActual = velocidadActual;
		this.marchaActual = marchaActual;
		this.luzDelantera = luzDelantera;
		this.luzTrasera = luzTrasera;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumMarchas() {
		return numMarchas;
	}

	public void setNumMarchas(int numMarchas) {
		this.numMarchas = numMarchas;
	}

	public double getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(double velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public int getMarchaActual() {
		return marchaActual;
	}

	public void setMarchaActual(int marchaActual) {
		this.marchaActual = marchaActual;
	}

	public Luz getLuzTrasera() {
		return luzTrasera;
	}

	public void setLuzTrasera(Luz luzTrasera) {
		this.luzTrasera = luzTrasera;
	}

	public Luz getLuzDelantera() {
		return luzDelantera;
	}

	public void setLuzDelantera(Luz luzDelantera) {
		this.luzDelantera = luzDelantera;
	}

	/**
	 * @return estado
	 */
	public void cambiarEstadoLuz(Luz luz) {

		if (luz.isEstado()) {
			luz.setEstado(false);
		} else {
			luz.setEstado(true);
		}
	}

	/**
	 * Arrancar la bici pondrá la marcha actual y la velocidad a 1
	 */
	public void arrancarBicicleta() {

		setMarchaActual(marchaActual);
		setVelocidadActual(1);
	}

	/**
	 * Acelerar incrementara la velocidad actua
	 */
	public void acelerarBicicleta() {

		setVelocidadActual(velocidadActual + 1.0);

		System.out.println("Nueva velocidad: " + velocidadActual);
	}

	/**
	 * Acelerar incrementara la velocidad actual con un parametro
	 */
	public void acelerarBicicleta(double aceleracion) {

		setVelocidadActual(velocidadActual + aceleracion);

		System.out.println("Nueva velocidad: " + velocidadActual);
	}

	/**
	 * Frenar disminuirá la velocidad actual
	 */
	public void frenarBicicleta() {
		setVelocidadActual(velocidadActual--);

		System.out.println("Nueva velocidad despues de desacelerar: " + velocidadActual);
	}

	/**
	 * Frenar disminuirá la velocidad actual con un parametro
	 */
	public void frenarBicicleta(double desaceleracion) {
		setVelocidadActual(velocidadActual - desaceleracion);

		System.out.println("Nueva velocidad despues de desacelerar: " + velocidadActual);
	}

	/**
	 * Subir de marcha aumentará la marcha actual
	 */
	public void subirMarcha() {

		if (marchaActual == numMarchas) {
			setMarchaActual(marchaActual);
			System.out.println("Se ha mantenido la marcha, porque es la maxima: " + numMarchas);
		} else {
			setMarchaActual(marchaActual++);
			System.out.println("Se ha subido la marcha a: " + getMarchaActual());
		}

	}

	/**
	 * bajar de marcha disminuirá la marcha actual
	 */
	public void bajarMarcha() {

		if (marchaActual > 0) {
			setMarchaActual(marchaActual--);
		} else {
			setMarchaActual(0);
		}

		System.out.println("Se ha bajado la marcha a: " + getMarchaActual());
	}

	@Override
	public String toString() {
		return "Bicicleta [color=" + color + ", numMarchas=" + numMarchas + ", velocidadActual=" + velocidadActual
				+ ", marchaActual=" + marchaActual + ", luzTrasera=" + luzTrasera + ", luzDelantera=" + luzDelantera
				+ "]\n";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
