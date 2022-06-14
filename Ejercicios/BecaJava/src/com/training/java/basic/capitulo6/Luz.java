/**
 * 
 */
package com.training.java.basic.capitulo6;

/**
 * @author luis.monzon
 *
 */
public class Luz {

	private String color;
	private boolean estado;
	private int nivelBateria;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int getNivelBateria() {
		return nivelBateria;
	}

	public void setNivelBateria(int nivelBateria) {
		this.nivelBateria = nivelBateria;
	}

	/**
	 * @param color
	 * @param estado
	 * @param nivelBateria
	 */
	public Luz(String color, boolean estado, int nivelBateria) {
		this.color = color;
		this.estado = estado;
		this.nivelBateria = nivelBateria;
	}

	@Override
	public String toString() {
		return "Luz [color=" + color + ", estado=" + estado + ", nivelBateria=" + nivelBateria + "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
