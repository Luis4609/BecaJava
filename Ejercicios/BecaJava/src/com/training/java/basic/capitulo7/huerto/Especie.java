/**
 * 
 */
package com.training.java.basic.capitulo7.huerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author luis.monzon
 *
 */
public class Especie {

	// Atributos tiempos de germinacion
	private int _TiempoMinGerminacion;
	private int _TiempoMaxGerminacion;

	private float _Distancia;

	private int _VolumenDeSustrato;
	private float _IndiceDeRiego;
	private String _Riego;

	//
	private boolean[] _MesesSiembraDirecta = new boolean[12];
	private boolean[] _MesesSiembraProtegida = new boolean[12];

	// Lista de compatibilidades
	List<String> _Compatibilidad;
	List<String> _Incompatibilidad;

	// Atributos recoleccion
	private float _RecoleccionMin;
	private float _RecoleccionMax;

	private String _Nombre;
	private String _Trasplante;
	private String _TipoSiembra;

	/**
	 * 
	 */
	public Especie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int get_TiempoMinGerminacion() {
		return _TiempoMinGerminacion;
	}

	public void set_TiempoMinGerminacion(int _TiempoMinGerminacion) {
		this._TiempoMinGerminacion = _TiempoMinGerminacion;
	}

	public int get_TiempoMaxGerminacion() {
		return _TiempoMaxGerminacion;
	}

	public void set_TiempoMaxGerminacion(int _TiempoMaxGerminacion) {
		this._TiempoMaxGerminacion = _TiempoMaxGerminacion;
	}

	public float get_Distancia() {
		return _Distancia;
	}

	public void set_Distancia(float _Distancia) {
		this._Distancia = _Distancia;
	}

	public int get_VolumenDeSustrato() {
		return _VolumenDeSustrato;
	}

	public void set_VolumenDeSustrato(int _VolumenDeSustrato) {
		this._VolumenDeSustrato = _VolumenDeSustrato;
	}

	public float get_IndiceDeRiego() {
		return _IndiceDeRiego;
	}

	public void set_IndiceDeRiego(float _IndiceDeRiego) {
		this._IndiceDeRiego = _IndiceDeRiego;
	}

	public String get_Riego() {
		return _Riego;
	}

	public void set_Riego(String _Riego) {
		this._Riego = _Riego;
	}

	public boolean[] get_MesesSiembraDirecta() {
		return _MesesSiembraDirecta;
	}

	public void set_MesesSiembraDirecta(boolean[] _MesesSiembraDirecta) {
		this._MesesSiembraDirecta = _MesesSiembraDirecta;
	}

	public boolean[] get_MesesSiembraProtegida() {
		return _MesesSiembraProtegida;
	}

	public void set_MesesSiembraProtegida(boolean[] _MesesSiembraProtegida) {
		this._MesesSiembraProtegida = _MesesSiembraProtegida;
	}

	public List<String> get_Compatibilidad() {
		return _Compatibilidad;
	}

	public void set_Compatibilidad(List<String> _Compatibilidad) {
		this._Compatibilidad = _Compatibilidad;
	}

	public List<String> get_Incompatibilidad() {
		return _Incompatibilidad;
	}

	public void set_Incompatibilidad(List<String> _Incompatibilidad) {
		this._Incompatibilidad = _Incompatibilidad;
	}

	public float get_RecoleccionMin() {
		return _RecoleccionMin;
	}

	public void set_RecoleccionMin(float _RecoleccionMin) {
		this._RecoleccionMin = _RecoleccionMin;
	}

	public float get_RecoleccionMax() {
		return _RecoleccionMax;
	}

	public void set_RecoleccionMax(float _RecoleccionMax) {
		this._RecoleccionMax = _RecoleccionMax;
	}

	public String get_Nombre() {
		return _Nombre;
	}

	public void set_Nombre(String _Nombre) {
		this._Nombre = _Nombre;
	}

	public String get_Trasplante() {
		return _Trasplante;
	}

	public void set_Trasplante(String _Transplante) {
		this._Trasplante = _Transplante;
	}

	public String get_TipoSiembra() {
		return _TipoSiembra;
	}

	public void set_TipoSiembra(String _TipoSiembra) {
		this._TipoSiembra = _TipoSiembra;
	}

	@Override
	public String toString() {
		return "Especie [_TiempoMinGerminacion=" + _TiempoMinGerminacion + ", _TiempoMaxGerminacion="
				+ _TiempoMaxGerminacion + ", _Distancia=" + _Distancia + ", _VolumnenDeSustrato=" + _VolumenDeSustrato
				+ ", _IndiceDeRiego=" + _IndiceDeRiego + ", _Riego=" + _Riego + ", _MesesSiembraDirecta="
				+ Arrays.toString(_MesesSiembraDirecta) + ", _MesesSiembraProtegida="
				+ Arrays.toString(_MesesSiembraProtegida) + ", _Compatibilidad=" + _Compatibilidad
				+ ", _Incompatibilidad=" + _Incompatibilidad + ", _RecoleccionMin=" + _RecoleccionMin
				+ ", _RecoleccionMax=" + _RecoleccionMax + ", _Nombre=" + _Nombre + ", _Transplante=" + _Trasplante
				+ ", _TipoSiembra=" + _TipoSiembra + "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Luis Monzón : Especies (Maíz y Manzanilla)
		// Maiz
		Especie especie = new Especie();

		especie.set_Nombre("Maiz");
		especie.set_Trasplante("No necesita");
		especie.set_TipoSiembra("A golpes");
		especie.set_Distancia(10);
		especie.set_VolumenDeSustrato(9);
		especie.set_Riego("Abundante");
		especie.set_IndiceDeRiego(100);

		// Meses para la recoleccion
		especie.set_RecoleccionMin(4);
		especie.set_RecoleccionMax(5);

		// Tablas de compatibilidades/incompatibilidades
		List<String> compatiblesMaiz = new ArrayList<String>();
		compatiblesMaiz.add("Calabacín");
		compatiblesMaiz.add("Calabaza");
		compatiblesMaiz.add("Col");
		compatiblesMaiz.add("Espinacas");
		compatiblesMaiz.add("Guisantes");
		compatiblesMaiz.add("Habas");
		compatiblesMaiz.add("Judias");
		compatiblesMaiz.add("Melon");
		compatiblesMaiz.add("Pepino");

		// Lista de compatibilidades
		especie.set_Compatibilidad(compatiblesMaiz);
		especie.set_Incompatibilidad(null);

		// Tiempo de Germinacion
		especie.set_TiempoMinGerminacion(7);
		especie.set_TiempoMaxGerminacion(8);

		// Meses de siembra directa Maiz
		boolean[] mesesDirectaMaiz = { false, false, true, true, true, true, true, false, false, false, false, false };
		especie.set_MesesSiembraDirecta(mesesDirectaMaiz);

		// Meses de siembra protegida Maiz
		boolean[] mesesProtegidaMaiz = { false, false, false, false, false, false, false, false, false, false, false,
				false };
		especie.set_MesesSiembraProtegida(mesesProtegidaMaiz);

		// Manzanilla
		especie = new Especie();
		especie.set_Nombre("Manzanilla");
		especie.set_Trasplante("No necesita");
		especie.set_TipoSiembra("Directa");
		especie.set_Distancia(10);
		especie.set_VolumenDeSustrato(5);
		especie.set_Riego("Moderada");
		especie.set_IndiceDeRiego(30);

		// Meses para la recoleccion
		especie.set_RecoleccionMin(3);
		especie.set_RecoleccionMax(3);

		// Tablas de compatibilidades/incompatibilidades
		List<String> compatiblesManzanilla = new ArrayList<String>();
		compatiblesManzanilla.add("Cebollas");
		compatiblesManzanilla.add("Lechuga");
		compatiblesManzanilla.add("Tomates");

		// Listas de compatibilidades de manzanilla
		especie.set_Compatibilidad(compatiblesManzanilla);
		especie.set_Incompatibilidad(null);

		// Tiempo de Germinacion
		especie.set_TiempoMinGerminacion(15);
		especie.set_TiempoMaxGerminacion(20);

		// Meses de siembra directa Manzanilla
		boolean[] mesesDirectaManzanilla = { false, false, true, true, true, false, false, false, false, false, false,
				false };
		especie.set_MesesSiembraDirecta(mesesDirectaManzanilla);

		// Meses de siembra protegida Manzanilla
		boolean[] mesesProtegidaManzanilla = { false, false, false, false, false, false, false, false, false, false,
				false, false };
		especie.set_MesesSiembraProtegida(mesesProtegidaManzanilla);

		// show toString()
		System.out.println(especie.toString());
//		System.out.println(manzanilla.toString());

	}

}
