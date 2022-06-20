package com.training.java.basic.capitulo7.huerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EspecieRepository {

//	private static EspecieCM especieCM;

	static {
//		ArrayList<Especie> especies = new ArrayList<Especie>();
		startRepository();

	}

	/**
	 * @param especieCM
	 * @return
	 */
	public static ArrayList<Especie> getEspecies() {

		return startRepository();
	}

	/**
	 * 
	 */
	private static ArrayList<Especie> startRepository() {

		// Lista de especies
		ArrayList<Especie> especies = new ArrayList<>();

		// Guillermo Baixeras Espinosa
		Especie especie = new Especie();

		List<String> compatibilidadAcelga = new ArrayList<>();

		compatibilidadAcelga.add("Achicoria");

		compatibilidadAcelga.add("Ajo");

		compatibilidadAcelga.add("Berenjena");

		compatibilidadAcelga.add("Brócoli");

		compatibilidadAcelga.add("Cebollas");

		compatibilidadAcelga.add("Chirivía");

		compatibilidadAcelga.add("Col");

		compatibilidadAcelga.add("Coliflor");

		compatibilidadAcelga.add("Judías");

		compatibilidadAcelga.add("Lechuga");

		compatibilidadAcelga.add("Pimiento");

		compatibilidadAcelga.add("Rabano");

		compatibilidadAcelga.add("Repollo");

		compatibilidadAcelga.add("Tomates");

		compatibilidadAcelga.add("Zanahoria");

		List<String> incompatibilidadAcelga = new ArrayList<>();

		incompatibilidadAcelga.add("Espinacas");

		incompatibilidadAcelga.add("Remolacha");

		especie.set_TiempoMinGerminacion(10);

		especie.set_TiempoMaxGerminacion(12);

		especie.set_Distancia(1);

		especie.set_VolumenDeSustrato(0);

		especie.set_IndiceDeRiego(90);

		especie.set_Riego("Mantener humedad");

		boolean[] acelgaDirecta = { true, true, true, true, true, true, true, true, true, true, true, true };

		especie.set_MesesSiembraDirecta(acelgaDirecta);

		boolean[] acelgaProtegida = { false, false, false, false, false, false, false, false, false, false, false,
				false };

		especie.set_MesesSiembraProtegida(acelgaProtegida);

		especie.set_Compatibilidad(compatibilidadAcelga);

		especie.set_Incompatibilidad(incompatibilidadAcelga);

		especie.set_RecoleccionMin(3);

		especie.set_RecoleccionMax(4);

		especie.set_Nombre("Acelga");

		especie.set_Trasplante("Aclarar en 12cm");

		especie.set_TipoSiembra("Directa");

		// Añadir especie : Acelga
		especies.add(especie);
		especie = new Especie();

		List<String> compatibilidadAchicoria = new ArrayList<>();

		compatibilidadAchicoria.add("Acelga");

		compatibilidadAchicoria.add("Espinicas");

		compatibilidadAchicoria.add("Remolacha");

		List<String> incompatibilidadAchicoria = new ArrayList<>();

		especie.set_TiempoMinGerminacion(6);

		especie.set_TiempoMaxGerminacion(8);

		especie.set_Distancia(1);

		especie.set_VolumenDeSustrato(0);

		especie.set_IndiceDeRiego(40);

		especie.set_Riego("Mantener humedad");

		boolean[] achicoriaDirecta = { false, false, false, false, false, true, true, false, false, false, false,
				false };

		especie.set_MesesSiembraDirecta(achicoriaDirecta);

		boolean[] achicoriaProtegida = { false, false, false, false, false, false, false, false, false, false, false,
				false };

		especie.set_MesesSiembraProtegida(achicoriaProtegida);

		especie.set_Compatibilidad(compatibilidadAchicoria);

		especie.set_Incompatibilidad(incompatibilidadAchicoria);

		especie.set_RecoleccionMin(0);

		especie.set_RecoleccionMax(0);

		especie.set_Nombre("Achicoria");

		especie.set_Trasplante("15cm");

		especie.set_TipoSiembra("Directa");

		// Añadir especie : Achicoria
		especies.add(especie);
		especie = new Especie();

		List<String> compatibilidadAjo = new ArrayList<>();

		compatibilidadAjo.add("Acelga");

		compatibilidadAjo.add("Berenjena");

		compatibilidadAjo.add("Chirivía");

		compatibilidadAjo.add("Escarola");

		compatibilidadAjo.add("Fresa");

		compatibilidadAjo.add("Lechuga");

		compatibilidadAjo.add("Pepino");

		compatibilidadAjo.add("Pimiento");

		compatibilidadAjo.add("Remolacha");

		compatibilidadAjo.add("Tomates");

		compatibilidadAjo.add("Zanahoria");

		List<String> incompatibilidadAjo = new ArrayList<>();

		incompatibilidadAjo.add("Brócoli");

		incompatibilidadAjo.add("Calçot");

		incompatibilidadAjo.add("Cebollas");

		incompatibilidadAjo.add("Cebollino");

		incompatibilidadAjo.add("Col");

		incompatibilidadAjo.add("Coliflor");

		incompatibilidadAjo.add("Colinabo");

		incompatibilidadAjo.add("Guisantes");

		incompatibilidadAjo.add("Habas");

		incompatibilidadAjo.add("Judías");

		incompatibilidadAjo.add("Puerro");

		incompatibilidadAjo.add("Repollo");

		especie.set_TiempoMinGerminacion(10);

		especie.set_TiempoMaxGerminacion(12);

		especie.set_Distancia(1);

		especie.set_VolumenDeSustrato(0);

		especie.set_IndiceDeRiego(10);

		especie.set_Riego(null);

		boolean[] ajoDirecta = { true, false, false, false, false, true, true, false, false, true, true, true };

		especie.set_MesesSiembraDirecta(ajoDirecta);

		boolean[] ajoProtegida = { false, false, false, false, false, false, false, false, false, false, false, false };

		especie.set_MesesSiembraProtegida(ajoProtegida);

		especie.set_Compatibilidad(compatibilidadAjo);

		especie.set_Incompatibilidad(incompatibilidadAjo);

		especie.set_RecoleccionMin(0);

		especie.set_RecoleccionMax(0);

		especie.set_Nombre("Ajo");

		especie.set_Trasplante("No necesita");

		especie.set_TipoSiembra("De asiento");

		// Añadir especie : Acelga
		especies.add(especie);

		// Sergio Bernal Parrondo
		especie = new Especie();
		especie.set_TiempoMinGerminacion(20);
		especie.set_TiempoMaxGerminacion(20);
		especie.set_Distancia(0);
		especie.set_VolumenDeSustrato(5);
		especie.set_IndiceDeRiego(70);
		especie.set_Riego("Generoso sin excesos");
		especie.set_MesesSiembraDirecta(
				new boolean[] { false, false, true, true, true, false, false, false, false, false, false, false });
		especie.set_MesesSiembraProtegida(new boolean[12]);
		especie.set_Compatibilidad(Arrays.asList("Albahaca", "Berenjena", "Pimiento", "Tomates"));
		especie.set_Incompatibilidad(Collections.emptyList());
		especie.set_RecoleccionMin(1);
		especie.set_RecoleccionMax(1);
		especie.set_Nombre("Albahaca");
		especie.set_Trasplante("No necesita");
		especie.set_TipoSiembra("Directa");

		// Añadir especie : Acelga
		especies.add(especie);

		especie = new Especie();
		especie.set_TiempoMinGerminacion(12);
		especie.set_TiempoMaxGerminacion(15);
		especie.set_Distancia(0);
		especie.set_VolumenDeSustrato(30);
		especie.set_IndiceDeRiego(70);
		especie.set_Riego("Frecuente, mantener humedad");
		especie.set_MesesSiembraDirecta(new boolean[12]);
		especie.set_MesesSiembraProtegida(
				new boolean[] { false, false, true, true, true, true, false, false, false, false, false, false });
		especie.set_Compatibilidad(Arrays.asList("Alcachofa", "Apio", "Lechuga", "Pepino"));
		especie.set_Incompatibilidad(Collections.singletonList("Patata"));
		especie.set_RecoleccionMin(12);
		especie.set_RecoleccionMax(12);
		especie.set_Nombre("Alcachofa");
		especie.set_Trasplante("10 cm");
		especie.set_TipoSiembra("En semillero");

		especie = new Especie();
		especie.set_TiempoMinGerminacion(15);
		especie.set_TiempoMaxGerminacion(18);
		especie.set_Distancia(0);
		especie.set_VolumenDeSustrato(9);
		especie.set_IndiceDeRiego(70);
		especie.set_Riego("Frecuente, mantener humedad");
		especie.set_MesesSiembraDirecta(new boolean[12]);
		especie.set_MesesSiembraProtegida(
				new boolean[] { true, true, true, true, true, true, false, false, true, true, true, true });
		especie.set_Compatibilidad(
				Arrays.asList("Apio", "Alcachofa", "Berenjena", "Brocoli", "Col", "Coliflor", "Colinabo", "Guisantes",
						"Judias", "Lechuga", "Pepino", "Pimiento", "Puerro", "Rabanos", "Repollo", "Tomates"));
		especie.set_Incompatibilidad(Arrays.asList("Patata", "Zanahorias"));
		especie.set_RecoleccionMin(7);
		especie.set_RecoleccionMax(8);
		especie.set_Nombre("Apio");
		especie.set_Trasplante("10 cm");
		especie.set_TipoSiembra("En semillero");

		// Añadir especie : Acelga
		especies.add(especie);

		// ESTO ABAJO ES DE ANTONIO

		especie = new Especie();

		especie.set_Nombre("Berenjena");

		especie.set_Compatibilidad(Arrays.asList("Acelga", "ajo", "Albahaca", "Apio", "Berenjena", "Brocoli", "Calçot",
				"Cebollas", "Col", "Coliflor", "Espinacas", "Judias", "Lechuga", "Perejil", "Pimiento", "Puerro",
				"Rabanos", "Repollo", "Rucula"));

		especie.set_Distancia(12);

		especie.set_Incompatibilidad(Arrays.asList("Guisantes", "Hinojo", "Pepino"));

		especie.set_IndiceDeRiego(30);

		especie.set_MesesSiembraDirecta(new boolean[12]);

		especie.set_MesesSiembraProtegida(
				new boolean[] { true, true, true, true, true, false, false, false, false, false, false, false });

		especie.set_RecoleccionMax(5);

		especie.set_RecoleccionMin(5);

		especie.set_Riego("Mantener Humedad");

		especie.set_TiempoMaxGerminacion(20);

		especie.set_TiempoMinGerminacion(15);

		especie.set_TipoSiembra("En semillero");

		especie.set_Trasplante("12 cm");

		especie.set_VolumenDeSustrato(13);

		// Añadir especie : Acelga
		especies.add(especie);

		especie = new Especie();

		especie.set_Nombre("Brocoli");

		especie.set_Compatibilidad(Arrays.asList("Acelga", "Alcachofa", "Apio", "Brocoli", "Coliflor", "Escarola",
				"Espinacas", "Guisantes", "Judias", "Lechuga", "Pepino", "Pimiento", "Puerro", "Rabanos", "Tomates"));

		especie.set_Distancia(12);

		especie.set_Incompatibilidad(Arrays.asList("Ajo", "Cebollas", "Patata"));

		especie.set_IndiceDeRiego(70);

		especie.set_MesesSiembraDirecta(new boolean[12]);

		especie.set_MesesSiembraProtegida(
				new boolean[] { false, false, false, false, true, true, true, true, false, false, false, false });

		especie.set_RecoleccionMax(6);

		especie.set_RecoleccionMin(5);

		especie.set_Riego("Frecuente, Mantener Humedad");

		especie.set_TiempoMaxGerminacion(10);

		especie.set_TiempoMinGerminacion(6);

		especie.set_TipoSiembra("En semillero");

		especie.set_Trasplante("12 cm");

		especie.set_VolumenDeSustrato(18);

		// Añadir especie : Acelga
		especies.add(especie);
		especie = new Especie();

		especie.set_Nombre("Calabacin");

		especie.set_Compatibilidad(Arrays.asList("Calabacin", "Cebollas", "Lechuga", "Maiz", "Rabanos", "Rucula"));

		especie.set_Distancia(18);

		especie.set_Incompatibilidad(Arrays.asList("Hinojo", "Melon", "Pepino"));

		especie.set_IndiceDeRiego(100);

		especie.set_MesesSiembraDirecta(
				new boolean[] { false, true, true, true, true, false, false, false, false, false, false, false });

		especie.set_MesesSiembraProtegida(new boolean[12]);

		especie.set_RecoleccionMax(3);

		especie.set_RecoleccionMin(3);

		especie.set_Riego("Generoso y abonado");

		especie.set_TiempoMaxGerminacion(10);

		especie.set_TiempoMinGerminacion(8);

		especie.set_TipoSiembra("3 - 4 Semillas por golpe");

		especie.set_Trasplante("Aclarar en 15cm de altura");

		especie.set_VolumenDeSustrato(22);

		// Añadir especie : Acelga
		especies.add(especie);

		// HENOCH
		// CALABAZA
		especie = new Especie();

		// MIN TIPO SIEMBRA

		especie.set_TiempoMinGerminacion(10);

		// MAX TIPO SIEMBRA

		especie.set_TiempoMaxGerminacion(15);

		// DISTANCIA

		especie.set_Distancia(0);

		// VOLUMEN DE SUSTRATO

		especie.set_VolumenDeSustrato(20);

		// INDICE DE RIEGO

		especie.set_IndiceDeRiego(90);

		// RIEGO

		especie.set_Riego("Generoso y abonado");

		// MESES SIEMBRA DIRECTA

		boolean[] sDcal = { false, true, true, true, false, false, false, false, false, false, false, false };

		especie.set_MesesSiembraDirecta(sDcal);

		// MESES SIEMBRA PROTEGIDA

		boolean[] sPcal = { false, false, false, false, false, false, false, false, false, false, false, false };

		especie.set_MesesSiembraProtegida(sPcal);

		// COMPATIBILIDAD

		List<String> compCal = new ArrayList();

		compCal.add("judia");

		compCal.add("maiz");

		especie.set_Compatibilidad(compCal);

		// INCOMPATIBILIDAD

		List<String> inCompCal = new ArrayList();

		inCompCal.add(null);

		especie.set_Incompatibilidad(inCompCal);

		// RECOLECCION MIN

		especie.set_RecoleccionMin(4);

		// RECOLECCION MAX

		especie.set_RecoleccionMax(5);

		// NOMBRE

		especie.set_Nombre("Calabaza");

		// TRASPLANTE

		especie.set_Trasplante("Aclarar en 15cm de altura");

		// TIPO DE SIEMBRA

		especie.set_TipoSiembra("3-4 semillas por golpe");

		// Añadir especie : Acelga
		especies.add(especie);

		// CANONIGO
		especie = new Especie();

		// MIN TIPO SIEMBRA

		especie.set_TiempoMinGerminacion(8);

		// MAX TIPO SIEMBRA

		especie.set_TiempoMaxGerminacion(10);

		// DISTANCIA

		especie.set_Distancia(0);

		// VOLUMEN DE SUSTRATO

		especie.set_VolumenDeSustrato(5);

		// INDICE DE RIEGO

		especie.set_IndiceDeRiego(30);

		// RIEGO

		especie.set_Riego("Mantener humedad");

		// MESES SIEMBRA DIRECTA

		boolean[] sDcan = { true, true, true, true, true, true, true, true, true, true, true, false };

		especie.set_MesesSiembraDirecta(sDcan);

		// MESES SIEMBRA PROTEGIDA

		boolean[] sPcan = { false, false, false, false, false, false, false, false, false, false, false, false };

		especie.set_MesesSiembraProtegida(sPcan);

		// COMPATIBILIDAD

		List<String> compCan = new ArrayList();

		compCan.add("col");

		compCan.add("colinabo");

		compCan.add("puerro");

		compCan.add("zanahoria");

		especie.set_Compatibilidad(compCan);

		// INCOMPATIBILIDAD

		List<String> inComp = new ArrayList();

		inComp.add(null);

		especie.set_Incompatibilidad(inComp);

		// RECOLECCION MIN

		especie.set_RecoleccionMin(1.5f);

		// RECOLECCION MAX

		especie.set_RecoleccionMax(1.5f);

		// NOMBRE

		especie.set_Nombre("Canonigo");

		// TRASPLANTE

		especie.set_Trasplante("No necesita");

		// TIPO DE SIEMBRA

		especie.set_TipoSiembra("Directa");

		// Añadir especie : Acelga
		especies.add(especie);

		// Johansel calderon
		especie = new Especie();

		especie.set_Nombre("Cebolla");

		especie.set_TiempoMinGerminacion(10);

		especie.set_TiempoMaxGerminacion(12);

		especie.set_Distancia(20);

		especie.set_VolumenDeSustrato(5);

		especie.set_IndiceDeRiego(20);

		especie.set_Riego("Escaso y espaciado");

		boolean[] mesesDi = { false };

		especie.set_MesesSiembraDirecta(mesesDi);

		boolean[] mesesPro = { true, true, true, true, false, false, true, true, true, true, true, true };

		especie.set_MesesSiembraProtegida(mesesPro);

		List<String> listaCompati = new ArrayList<>();

		listaCompati.add("Acelga");

		listaCompati.add("Berenjena");

		listaCompati.add("Calabacín");

		listaCompati.add("Chirivía");

		listaCompati.add("Escarola");

		listaCompati.add("Espinacas");

		listaCompati.add("Lechuga");

		listaCompati.add("Manzanilla");

		listaCompati.add("Pepino");

		listaCompati.add("Pimiento");

		listaCompati.add("Remolacha");

		listaCompati.add("Tomates");

		listaCompati.add("Zanahorias");

		especie.set_Compatibilidad(listaCompati);

		List<String> listaInCompati = new ArrayList<>();

		listaInCompati.add("Ajo");

		listaInCompati.add("Brócoli");

		listaInCompati.add("Cebollino");

		listaInCompati.add("Col");

		listaInCompati.add("Coliflor");

		listaInCompati.add("Guisantes");

		listaInCompati.add("Habas");

		listaInCompati.add("Judias");

		listaInCompati.add("Puerro");

		listaInCompati.add("Repollo");

		especie.set_Incompatibilidad(listaInCompati);

		especie.set_RecoleccionMin(5);

		especie.set_RecoleccionMax(5);

		especie.set_Trasplante("Grosor como un Lapiz");

		especie.set_TipoSiembra("En Semillero");

		// Añadir especie : Acelga
		especies.add(especie);
		// Cebollino

		especie = new Especie();

		especie.set_Nombre("Cebollino");

		especie.set_TiempoMinGerminacion(15);

		especie.set_TiempoMaxGerminacion(15);

		especie.set_Distancia(40);

		especie.set_VolumenDeSustrato(3);

		especie.set_IndiceDeRiego(20);

		especie.set_Riego("Mantener Humedad");

		boolean[] mesesDi2 = { true, true, true, true, false, false, false, false, false, false, false, false };

		especie.set_MesesSiembraDirecta(mesesDi2);

		boolean[] mesesPro2 = { false };

		especie.set_MesesSiembraProtegida(mesesPro2);

		List<String> listaCompati2 = new ArrayList<>();

		listaCompati.add("Zanahorias");

		listaCompati.add("Perejil");

		especie.set_Compatibilidad(listaCompati2);

		List<String> listaInCompati2 = new ArrayList<>();

		listaInCompati.add("Ajo");

		listaInCompati.add("Cebollas");

		listaInCompati.add("Puerro");

		especie.set_Incompatibilidad(listaInCompati2);

		especie.set_RecoleccionMin(2);

		especie.set_RecoleccionMax(2);

		especie.set_Trasplante("No necesita");

		especie.set_TipoSiembra("Directa");

		// Añadir especie : Acelga
		especies.add(especie);

		// Chirivia ------------------------------------------------

		especie = new Especie();

		especie.set_Nombre("Chirivia");

		especie.set_TiempoMinGerminacion(20);

		especie.set_TiempoMaxGerminacion(25);

		especie.set_Distancia(30);

		especie.set_VolumenDeSustrato(5);

		especie.set_IndiceDeRiego(30);

		especie.set_Riego("Mantener Humedad");

		boolean[] mesesDi3 = { false, false, true, true, true, true, true, true, true, true, true, false };

		especie.set_MesesSiembraDirecta(mesesDi3);

		boolean[] mesesPro3 = { false, false, false, false, false, false, false, false, false, false, false, false };

		especie.set_MesesSiembraProtegida(mesesPro3);

		List<String> listaCompati3 = new ArrayList<>();

		listaCompati.add("Acelga");

		listaCompati.add("Ajo");

		listaCompati.add("Cebollas");

		listaCompati.add("Guisantes");

		listaCompati.add("Puerro");

		listaCompati.add("Rabanos");

		listaCompati.add("Rabanitos");

		especie.set_Compatibilidad(listaCompati3);

		List<String> listaInCompati3 = new ArrayList<>();

		listaInCompati.add(null);

		especie.set_Incompatibilidad(listaInCompati3);

		especie.set_RecoleccionMin(4);

		especie.set_RecoleccionMax(4);

		especie.set_Trasplante("No necesita");

		especie.set_TipoSiembra("De asiento o de Alvoleo");

		// Añadir especie : Acelga
		especies.add(especie);

		// Jesús

		boolean colinaboSiembraDirecta[] = { false, false, true, true, true, true, true, true, true, true, false,
				false };

		boolean colinaboSiembraProtegida[] = { false, false, false, false, false, false, false, false, false, false,
				false, false };

		List<String> ColinabocompatibilidadNombres = new ArrayList();

		ColinabocompatibilidadNombres.add("canónigo");

		ColinabocompatibilidadNombres.add("espinaca");

		ColinabocompatibilidadNombres.add("guisante");

		ColinabocompatibilidadNombres.add("judías");

		ColinabocompatibilidadNombres.add("lechuga");

		List<String> ColinaboincompatibilidadNombres = new ArrayList();

		ColinaboincompatibilidadNombres.add("ajo");

		especie = new Especie();

		especie.set_TiempoMinGerminacion(6);

		especie.set_TiempoMaxGerminacion(10);

		especie.set_Distancia(0);

		especie.set_Compatibilidad(null);

		especie.set_Incompatibilidad(null);

		especie.set_IndiceDeRiego(0);

		especie.set_MesesSiembraDirecta(colinaboSiembraDirecta);

		especie.set_MesesSiembraProtegida(colinaboSiembraProtegida);

		especie.set_Riego("Mantener humedad");

		especie.set_VolumenDeSustrato(0);

		especie.set_Nombre("colinabo");

		especie.set_TipoSiembra("asiento o voleo");

		especie.set_RecoleccionMax(6);

		especie.set_RecoleccionMin(5);

		especie.set_Trasplante("no necesita");

		// Añadir especie : Acelga
		especies.add(especie);

		boolean escarolaSiembraDirecta[] = { false, false, false, false, true, true, true, true, false, false, false,
				false };

		boolean escaloraSiembraProtegida[] = { false, false, true, true, false, false, false, false, false, false,
				false, false };

		List<String> EscaloracompatibilidadNombres = new ArrayList();

		EscaloracompatibilidadNombres.add("ajo");

		EscaloracompatibilidadNombres.add("brócoli");

		EscaloracompatibilidadNombres.add("cebolla");

		EscaloracompatibilidadNombres.add("col");

		EscaloracompatibilidadNombres.add("coliflor");

		List<String> EscaloraincompatibilidadNombres = new ArrayList();

		EscaloraincompatibilidadNombres.add("Lechuga");

		especie = new Especie();

		especie.set_TiempoMinGerminacion(6);

		especie.set_TiempoMaxGerminacion(8);

		especie.set_Distancia(0);

		especie.set_Compatibilidad(null);

		especie.set_Incompatibilidad(null);

		especie.set_IndiceDeRiego(0);

		especie.set_MesesSiembraDirecta(escarolaSiembraDirecta);

		especie.set_MesesSiembraProtegida(escaloraSiembraProtegida);

		especie.set_Riego("1 o 2 días");

		especie.set_VolumenDeSustrato(5);

		especie.set_Nombre("espinaca");

		especie.set_TipoSiembra("directa o semillero");

		especie.set_RecoleccionMax(5);

		especie.set_RecoleccionMin(2);

		especie.set_Trasplante("con 3 o 4 hojas");

		boolean espinacaSiembraDirecta[] = { true, true, true, true, true, true, true, true, false, false, false,
				false };

		boolean espinacaSiembraProtegida[] = { false, false, false, false, false, false, false, false, false, false,
				false, false };

		List<String> EspinacacompatibilidadNombres = new ArrayList<>();

		EspinacacompatibilidadNombres.add("achicoria");

		EspinacacompatibilidadNombres.add("berenjena");

		EspinacacompatibilidadNombres.add("cebolla");

		EspinacacompatibilidadNombres.add("col");

		EspinacacompatibilidadNombres.add("coliflor");

		EspinacacompatibilidadNombres.add("colinabo");

		EspinacacompatibilidadNombres.add("escarola");

		List<String> EspinacaincompatibilidadNombres = new ArrayList();

		EspinacaincompatibilidadNombres.add("acelga");

		// Añadir especie : Acelga
//		especies.add(especie);
		especie = new Especie();

		especie.set_TiempoMinGerminacion(10);

		especie.set_TiempoMaxGerminacion(12);

		especie.set_Distancia(0);

		especie.set_Compatibilidad(null);

		especie.set_Incompatibilidad(null);

		especie.set_IndiceDeRiego(0);

		especie.set_MesesSiembraDirecta(espinacaSiembraDirecta);

		especie.set_MesesSiembraProtegida(espinacaSiembraProtegida);

		especie.set_Riego("ligero/frecuente");

		especie.set_VolumenDeSustrato(3);

		especie.set_Nombre("espinaca");

		especie.set_TipoSiembra("directa o a voleo");

		especie.set_RecoleccionMax(3);

		especie.set_RecoleccionMin(2);

		especie.set_Trasplante("no necesita");

		// Añadir especie :
		especies.add(especie);

		// Enrique

		boolean escarolaSiembraProtegida[] = { true, true, true, true, false, false, false, false, false, true, true,
				true };

		especie = new Especie();

		List<String> CompatibleEscarola = new ArrayList<String>();

		List<String> IncompatibleEscarola = new ArrayList<String>();

		CompatibleEscarola.add("Ajo");

		CompatibleEscarola.add("Brocoli");

		CompatibleEscarola.add("Cebolla");

		CompatibleEscarola.add("Col");

		CompatibleEscarola.add("Coliflor");

		CompatibleEscarola.add("Espinacas");

		CompatibleEscarola.add("Hinojo");

		CompatibleEscarola.add("Lechuga");

		CompatibleEscarola.add("Puerro");

		CompatibleEscarola.add("Repollo");

		CompatibleEscarola.add("Tomates");

		IncompatibleEscarola.add("Lechuga ");

		especie.set_TiempoMinGerminacion(6);

		especie.set_TiempoMaxGerminacion(8);

		especie.set_Distancia(100);

		especie.set_VolumenDeSustrato(5);

		especie.set_IndiceDeRiego(75);

		especie.set_Riego("Cada uno o dos dias");

		// especie.set_MesesSiembraDirecta(true, true, true, true, false, false, false,

		// false, false, true, true ,true);

		// especie.set_MesesSiembraIndirecta = (null, null, true, true, false, false,

		// false, false, false, null, null ,null);

		especie.set_Compatibilidad(CompatibleEscarola);

		especie.set_Incompatibilidad(IncompatibleEscarola);

		especie.set_RecoleccionMin(0);

		especie.set_RecoleccionMax(0);

		especie.set_Nombre("Escarola ");

		especie.set_Trasplante("Con 3 o 4 hojas");

		especie.set_TipoSiembra("Directa o en semillero");

		List<String> CompatibleEspinaca = new ArrayList<String>();

		List<String> IncompatibleEspinaca = new ArrayList<String>();

		boolean espinacaSiembraProtegida1[] = { false, false, false, false, false, false, false, false, false, false,
				false, false };

		CompatibleEspinaca.add("Achicoria");

		CompatibleEspinaca.add("Berenjena ");

		CompatibleEspinaca.add("Brocoli ");

		CompatibleEspinaca.add("Cebollas ");

		CompatibleEspinaca.add("Chirivia ");

		CompatibleEspinaca.add("Col ");

		CompatibleEspinaca.add("Coliflor ");

		CompatibleEspinaca.add("Colinabo ");

		CompatibleEspinaca.add("Escarola ");

		CompatibleEspinaca.add("Fresa ");

		CompatibleEspinaca.add("Habas ");

		CompatibleEspinaca.add("Judias ");

		CompatibleEspinaca.add("Maiz ");

		CompatibleEspinaca.add("Melon ");

		CompatibleEspinaca.add("Patata ");

		CompatibleEspinaca.add("Perejil ");

		CompatibleEspinaca.add("Rabanos ");

		CompatibleEspinaca.add("Repollo ");

		CompatibleEspinaca.add("Tomates ");

		IncompatibleEspinaca.add("Acelga ");

		IncompatibleEspinaca.add("Remolacha");

		// Añadir especie :
		especies.add(especie);

		especie = new Especie();

		especie.set_TiempoMinGerminacion(6);

		especie.set_TiempoMaxGerminacion(8);

		especie.set_Distancia(100);

		especie.set_VolumenDeSustrato(5);

		especie.set_IndiceDeRiego(75);

		especie.set_Riego("Cada uno o dos dias");

		// especie1.set_MesesSiembraDirecta(true, true, true, true, false, false, false,

		// false, false, true, true ,true);

		// especie1.set_MesesSiembraIndirecta = (null, null, true, true, false, false,

		// false, false, false, null, null ,null);

		especie.set_Compatibilidad(CompatibleEscarola);

		especie.set_Incompatibilidad(IncompatibleEscarola);

		especie.set_RecoleccionMin(0);

		especie.set_RecoleccionMax(0);

		especie.set_Nombre("Escarola ");

		especie.set_Trasplante("Con 3 o 4 hojas");

		especie.set_TipoSiembra("Directa o en semillero");
		// Añadir especie :
		especies.add(especie);

		// fin Enrique

//		// Raúl González De La Aleja ( Fresas y guisantes )
//
//		especie = new Especie();
//
//		especie._MesesSiembraDirecta = new boolean[12];
//
//		especie._MesesSiembraProtegida = new boolean[12];
//
//		especie.set_TiempoMinGerminacion(15);
//
//		especie.set_TiempoMaxGerminacion(20);
//
//		especie.set_Distancia(1);
//
//		especie.set_VolumenDeSustrato(5);
//
//		especie.set_IndiceDeRiego(70);
//
//		especie.set_Riego("Mantener humedad");
//
//		especie._MesesSiembraDirecta[0] = false;
//
//		especie._MesesSiembraDirecta[1] = false;
//
//		especie._MesesSiembraDirecta[2] = false;
//
//		especie._MesesSiembraDirecta[3] = true;
//
//		especie._MesesSiembraDirecta[4] = true;
//
//		especie._MesesSiembraDirecta[5] = true;
//
//		especie._MesesSiembraDirecta[6] = true;
//
//		especie._MesesSiembraDirecta[7] = true;
//
//		especie._MesesSiembraDirecta[8] = false;
//
//		especie._MesesSiembraDirecta[9] = false;
//
//		especie._MesesSiembraDirecta[10] = false;
//
//		especie._MesesSiembraDirecta[11] = false;
//
//		for (int i = 0; i < 12; i++) {
//
//			especie._MesesSiembraProtegida[i] = false;
//
//		}
//
//		ArrayList<String> compatiblesFresa = new ArrayList<>();
//
//		ArrayList<String> incompatiblesFresa = new ArrayList<>();
//
//		compatiblesFresa.add("Ajo");
//
//		compatiblesFresa.add("Espinacas");
//
//		compatiblesFresa.add("Judias");
//
//		compatiblesFresa.add("Lechugas");
//
//		compatiblesFresa.add("Tomates");
//
//		incompatiblesFresa.add("Col");
//
//		incompatiblesFresa.add("Coliflor");
//
//		incompatiblesFresa.add("Colinabo");
//
//		especie._Compatibilidad = compatiblesFresa;
//
//		especie._Incompatibilidad = incompatiblesFresa;
//
//		especie.set_RecoleccionMin(4);
//
//		especie.set_RecoleccionMax(5);
//
//		especie.set_Nombre("Fresa");
//
//		especie.set_Trasplante("8 cm");
//
//		especie.set_TipoSiembra("Semillero");
//
//		/// Guisantes
//
//		especie = new Especie();
//
//		especie._MesesSiembraDirecta = new boolean[12];
//
//		especie._MesesSiembraProtegida = new boolean[12];
//
//		especie.set_TiempoMinGerminacion(10);
//
//		especie.set_TiempoMaxGerminacion(12);
//
//		especie.set_Distancia(1);
//
//		especie.set_VolumenDeSustrato(5);
//
//		especie.set_IndiceDeRiego(50);
//
//		especie.set_Riego("Mantener humedad");
//
//		especie._MesesSiembraDirecta[0] = true;
//
//		especie._MesesSiembraDirecta[1] = true;
//
//		especie._MesesSiembraDirecta[2] = true;
//
//		especie._MesesSiembraDirecta[3] = false;
//
//		especie._MesesSiembraDirecta[4] = false;
//
//		especie._MesesSiembraDirecta[5] = false;
//
//		especie._MesesSiembraDirecta[6] = false;
//
//		especie._MesesSiembraDirecta[7] = false;
//
//		especie._MesesSiembraDirecta[8] = true;
//
//		especie._MesesSiembraDirecta[9] = true;
//
//		especie._MesesSiembraDirecta[10] = true;
//
//		especie._MesesSiembraDirecta[11] = true;
//
//		for (int i = 0; i < 12; i++) {
//
//			especie._MesesSiembraProtegida[i] = false;
//
//		}
//
//		ArrayList<String> compatiblesGuisantes = new ArrayList<>();
//
//		ArrayList<String> incompatiblesGuisantes = new ArrayList<>();
//
//		compatiblesGuisantes.add("Apio");
//
//		compatiblesGuisantes.add("Brocoli");
//
//		compatiblesGuisantes.add("Chirivia");
//
//		compatiblesGuisantes.add("Col");
//
//		compatiblesGuisantes.add("Coliflor");
//
//		compatiblesGuisantes.add("Colinabo");
//
//		compatiblesGuisantes.add("Hinojo");
//
//		compatiblesGuisantes.add("Lechuga");
//
//		compatiblesGuisantes.add("Maiz");
//
//		compatiblesGuisantes.add("Pepino");
//
//		compatiblesGuisantes.add("Rabanos");
//
//		compatiblesGuisantes.add("Repollo");
//
//		compatiblesGuisantes.add("Zanahorias");
//
//		especie._Compatibilidad = compatiblesGuisantes;
//
//		incompatiblesGuisantes.add("Ajo");
//
//		incompatiblesGuisantes.add("Berenjena");
//
//		incompatiblesGuisantes.add("Cebollas");
//
//		incompatiblesGuisantes.add("Habas");
//
//		incompatiblesGuisantes.add("Judias");
//
//		incompatiblesGuisantes.add("Patata");
//
//		incompatiblesGuisantes.add("Pimiento");
//
//		incompatiblesGuisantes.add("Puerro");
//
//		incompatiblesGuisantes.add("Tomates");
//
//		especie._Incompatibilidad = incompatiblesGuisantes;
//
//		especie.set_RecoleccionMin(4);
//
//		especie.set_RecoleccionMax(5);
//
//		especie.set_Nombre("Guisante");
//
//		especie.set_Trasplante("No necesita");
//
//		especie.set_TipoSiembra("Diecta");
//

		// Gonzalo
		// Habas

		especie = new Especie();

		// tiempo de germinacion

		especie.set_TiempoMaxGerminacion(12);

		especie.set_TiempoMinGerminacion(10);

		// distancia entre plantas

		especie.set_Distancia(5);

		especie.set_VolumenDeSustrato(10);

		especie.set_IndiceDeRiego(30);

		especie.set_Riego("Mantener humedad");

		// meses de siembra directa protegida

		boolean[] dir = { true, true, false, false, false, false, false, false, true, true, true, true };

		boolean[] pro = { false, false, false, false, false, false, false, false, false, false, false, false };

		especie.set_MesesSiembraDirecta(dir);

		especie.set_MesesSiembraProtegida(pro);

		// compatibilidad e incompatibilad

		List<String> compati = new ArrayList<String>();

		compati.add("Col");

		compati.add("Espinacas");

		compati.add("Lechiga");

		compati.add("Maiz");

		compati.add("Repollo");

		List<String> inconpa = new ArrayList<String>();

		inconpa.add("Ajo");

		inconpa.add("Calçot");

		inconpa.add("Cebolla");

		inconpa.add("Guisante");

		inconpa.add("Puerro");

		inconpa.add("Judias");

		especie.set_Compatibilidad(compati);

		especie.set_Incompatibilidad(inconpa);

		especie.set_RecoleccionMin(4);

		especie.set_RecoleccionMax(5);

		especie.set_Nombre("Habas");

		especie.set_Trasplante("No necesita");

		especie.set_TipoSiembra("Directa o golpes 2-4 semillas");

		// Añadir especie :
		especies.add(especie);

		// Hinojo
		especie = new Especie();

		especie.set_TiempoMaxGerminacion(15);

		especie.set_TiempoMinGerminacion(20);

		especie.set_Distancia(9);

		especie.set_VolumenDeSustrato(8);

		especie.set_IndiceDeRiego(40);

		especie.set_Riego("Mantener humedad");

		boolean[] directa2 = { false, false, false, true, true, true, false, false, false, false, false, false };

		boolean[] protegida2 = { false, false, false, false, false, false, false, false, false, false, false, false };

		especie.set_MesesSiembraDirecta(directa2);

		especie.set_MesesSiembraProtegida(protegida2);

		List<String> compati2 = new ArrayList<String>();

		compati2.add("Escarola");

		compati2.add("Pepino");

		compati2.add("Puerro");

		compati2.add("Guisantes");

		compati2.add("Lechuga");

		List<String> inconpa2 = new ArrayList<String>();

		inconpa2.add("Tomates");

		inconpa2.add("Remolacha");

		inconpa2.add("Zanahorias");

		inconpa2.add("Pimiento");

		inconpa2.add("Brocoli");

		inconpa2.add("Calabaza");

		inconpa2.add("Judias");

		especie.set_Compatibilidad(compati2);

		especie.set_Incompatibilidad(inconpa2);

		especie.set_RecoleccionMin(3);

		especie.set_RecoleccionMax(4);

		especie.set_Nombre("Hinojo");

		especie.set_Trasplante("Se dejara la mas fuerte");

		especie.set_TipoSiembra("Asiento de 3-4 semillas");

		// Añadir especie :
		especies.add(especie);

		// Sergio Llorente
		// Judia

		especie = new Especie();

		boolean[] MesSiembraDirectaJudia = { true, true, true, true, true, true, true, true, true, true, true, true };

		boolean[] MesSiembraProtegidaJudia = { false, false, false, false, false, false, false, false, false, false,
				false, false };

		ArrayList<String> compJudia = new ArrayList<>();

		compJudia.add("Acelga");

		compJudia.add("Apio");

		compJudia.add("Berenjena");

		compJudia.add("Brocoli");

		compJudia.add("Calabraza");

		compJudia.add("Col");

		compJudia.add("Coliflor");

		compJudia.add("Colinabo");

		compJudia.add("Espinacas");

		compJudia.add("Fresa");

		compJudia.add("Lechuga");

		compJudia.add("Melon");

		compJudia.add("Patata");

		compJudia.add("Pepinillo");

		compJudia.add("Rabanos");

		compJudia.add("Remolacha");

		compJudia.add("Repollo");

		compJudia.add("Tomates");

		ArrayList<String> NoCompJudia = new ArrayList<>();

		compJudia.add("Ajo");

		compJudia.add("Cebolla");

		compJudia.add("Guisante");

		compJudia.add("Habas");

		compJudia.add("Hinojo");

		compJudia.add("Puerro");

		especie.set_TiempoMinGerminacion(8);

		especie.set_TiempoMaxGerminacion(10);

		especie.set_Distancia(6);

		especie.set_VolumenDeSustrato(14);

		especie.set_IndiceDeRiego(50);
		;

		especie.set_Riego("Ligero y frecuente");
		;

		especie.set_MesesSiembraDirecta(MesSiembraDirectaJudia);

		especie.set_MesesSiembraProtegida(MesSiembraProtegidaJudia);

		especie.set_Compatibilidad(compJudia);

		especie.set_Incompatibilidad(NoCompJudia);

		especie.set_RecoleccionMin(2);

		especie.set_RecoleccionMax(3);

		especie.set_Nombre("Judia");

		especie.set_Trasplante("No necesita");

		especie.set_TipoSiembra("Asiento de 2-3 semillas");

		// Añadir especie :
		especies.add(especie);

		// Lechuga

		especie = new Especie();

		boolean[] MesSiembraDirectaLechuga = { false, false, false, false, false, false, false, false, false, false,
				false, false };

		boolean[] MesSiembraProtegidaLechuga = { false, false, true, true, true, true, true, true, true, true, true,
				true };

		ArrayList<String> CompLechuga = new ArrayList<>();

		CompLechuga.add("Acelga");

		CompLechuga.add("Ajo");

		CompLechuga.add("Alcachofa");

		CompLechuga.add("Apio");

		CompLechuga.add("Berenjena");

		CompLechuga.add("Brocoli");

		CompLechuga.add("Calabacin");

		CompLechuga.add("Calcot");

		CompLechuga.add("Cebollas");

		CompLechuga.add("Col");

		CompLechuga.add("Coliflor");

		CompLechuga.add("Colinabo");

		CompLechuga.add("Fresa");

		CompLechuga.add("Guisante");

		CompLechuga.add("Habas");

		CompLechuga.add("Hinojo");

		CompLechuga.add("Judias");

		CompLechuga.add("Manzanilla");

		CompLechuga.add("Pepino");

		CompLechuga.add("Pimiento");

		CompLechuga.add("Puerro");

		CompLechuga.add("Rabanos");

		CompLechuga.add("Remolacha");

		CompLechuga.add("Repollo");

		CompLechuga.add("Tomates");

		CompLechuga.add("Zanahorias");

		ArrayList<String> NoCompLechuga = new ArrayList<>();

		NoCompLechuga.add("Escarola");

		NoCompLechuga.add("Perejil");

		especie.set_TiempoMinGerminacion(6);

		especie.set_TiempoMaxGerminacion(8);

		especie.set_Distancia(6);

		especie.set_VolumenDeSustrato(3);

		especie.set_IndiceDeRiego(50);

		especie.set_Riego("Dos veces por semana");

		especie.set_MesesSiembraDirecta(MesSiembraDirectaLechuga);

		especie.set_MesesSiembraProtegida(MesSiembraProtegidaLechuga);

		especie.set_Compatibilidad(CompLechuga);

		especie.set_Incompatibilidad(NoCompLechuga);

		especie.set_RecoleccionMin(2);

		especie.set_RecoleccionMax(4);

		especie.set_Nombre("Lechuga");

		especie.set_Trasplante("8cm/4-5 hojas");

		especie.set_TipoSiembra("En semillero");

		// Añadir especie :
		especies.add(especie);

		// Luis Monzón : Especies (Maíz y Manzanilla)

		// Maiz

		especie = new Especie();

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

		// Añadir especie :
		especies.add(especie);

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

		// Añadir especie :
		especies.add(especie);

		// JORGE PEREZ
		especie = new Especie();

		especie.set_TiempoMaxGerminacion(0);

		especie.set_TiempoMinGerminacion(0);

		especie.set_Distancia(10);

		especie.set_VolumenDeSustrato(10);

		especie.set_IndiceDeRiego(23);

		especie.set_Riego("Generoso sin excesos");

		especie.set_MesesSiembraDirecta(
				new boolean[] { false, true, true, true, true, false, false, false, false, false, false });

		especie.set_MesesSiembraProtegida(new boolean[12]);

		especie.set_Compatibilidad(Arrays.asList("Espinacas", "Judias", "Pimiento"));

		especie.set_Incompatibilidad(Arrays.asList("Alcachofa", "Apio", "Calabacin", "Col", "Coliflor", "Colinabo",
				"Guisantes", "Pepino", "Tomates"));

		especie.set_RecoleccionMin(3);

		especie.set_RecoleccionMax(4);

		especie.set_Nombre("Patata");

		especie.set_Trasplante("No necesita");

		especie.set_TipoSiembra("Directa");

		// Añadir especie :
		especies.add(especie);

		especie = new Especie();

		especie.set_TiempoMaxGerminacion(12);

		especie.set_TiempoMinGerminacion(10);

		especie.set_Distancia(24);

		especie.set_VolumenDeSustrato(28);

		especie.set_IndiceDeRiego(23);

		especie.set_Riego("Escaso,1-2 por semana");

		especie.set_MesesSiembraDirecta(
				new boolean[] { false, true, true, true, true, true, false, false, false, false, false, false });

		especie.set_MesesSiembraProtegida(new boolean[12]);

		especie.set_Compatibilidad(Arrays.asList("Espinacas", "Judias", "Maiz", "Rabanitos"));

		especie.set_Incompatibilidad(Arrays.asList("Calabacin", "Pepino"));

		especie.set_RecoleccionMin(3);

		especie.set_RecoleccionMax(3);

		especie.set_Nombre("Melon");

		especie.set_Trasplante("No necesita");

		especie.set_TipoSiembra("Directa");

		// Añadir especie :
		especies.add(especie);

		// Mario Pricop

		especie = new Especie();

		especie.set_TiempoMinGerminacion(8);

		especie.set_TiempoMaxGerminacion(10);

		especie.set_Distancia(10);

		especie.set_VolumenDeSustrato(15);

		especie.set_IndiceDeRiego(25);

		especie.set_Riego("mantener");

		especie.set_MesesSiembraDirecta(
				new boolean[] { false, false, true, true, true, true, true, false, false, false, false, false });

		especie.set_MesesSiembraProtegida(new boolean[12]);

		especie.set_Compatibilidad(Arrays.asList(
				"Ajo , Alcachofa , Apio , Brocoli, Cebollas, Col,Coliflor, Guisantes, Hinojo, Judias, Lechuga, Maiz, Remolacha, Repollo, Zanahorias"));

		especie.set_Incompatibilidad(
				Arrays.asList("Berenjena, Calabacin, Melon , Patata , Pimiento , Rabanitos, Tomates"));

		especie.set_RecoleccionMin(2);

		especie.set_RecoleccionMax(5);

		especie.set_Nombre("Pepino");

		especie.set_Trasplante("No necesita");

		especie.set_TipoSiembra("Directa");

		// Añadir especie :
		especies.add(especie);

		especie = new Especie();

		especie.set_TiempoMinGerminacion(15);

		especie.set_TiempoMaxGerminacion(20);

		especie.set_Distancia(10);

		especie.set_VolumenDeSustrato(5);

		especie.set_IndiceDeRiego(25);

		especie.set_Riego("Dos dias");

		especie.set_MesesSiembraDirecta(
				new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true });

		especie.set_MesesSiembraProtegida(new boolean[12]);

		especie.set_Compatibilidad(Arrays.asList("Berenjena, Cebollino, Pimiento, Rabanitos, Tomates"));

		especie.set_Incompatibilidad(Arrays.asList("Lechuga, Zanhorias"));

		especie.set_RecoleccionMin(3);

		especie.set_RecoleccionMax(3);

		especie.set_Nombre("Perejil");

		especie.set_Trasplante("No necesita");

		especie.set_TipoSiembra("Diecta");

		// Añadir especie :
		especies.add(especie);

		// Andrés

		especie = new Especie();

		especie.set_TiempoMinGerminacion(15);

		especie.set_TiempoMaxGerminacion(20);

		especie.set_Distancia(10);

		especie.set_VolumenDeSustrato(14);

		especie.set_IndiceDeRiego(100);

		especie.set_Riego("Generoso y abonado");

		especie.set_MesesSiembraDirecta(null);

		boolean sPpimiento[] = { true, true, true, true, true, false, false, false, false, false, false, true };

		especie.set_MesesSiembraProtegida(sPpimiento);

		List<String> compPim = new ArrayList();

		compPim.add("Acelga");

		compPim.add("Ajo");

		compPim.add("Albahaca");

		compPim.add("Apio");

		compPim.add("Berengena");

		compPim.add("Brocoli");

		compPim.add("Calçot");

		compPim.add("Cebollas");

		compPim.add("Col");

		compPim.add("Coliflor");

		compPim.add("Fresa");

		compPim.add("Judias");

		compPim.add("Lechuga");

		compPim.add("Patata");

		compPim.add("Perejil");

		compPim.add("Puerro");

		compPim.add("Rabanos/nitos");

		compPim.add("Repollo");

		compPim.add("Rucula");

		compPim.add("Tomates");

		especie.set_Compatibilidad(compPim);

		List<String> incompPim = new ArrayList();

		incompPim.add("Guisante");

		incompPim.add("Hinojo");

		incompPim.add("Pepino");

		especie.set_Compatibilidad(compPim);

		especie.set_RecoleccionMin(5);

		especie.set_RecoleccionMax(6);

		especie.set_Nombre("Pimiento");

		especie.set_Trasplante("Con 3 - 4 hojas");

		especie.set_TipoSiembra("En semillero");

		// Añadir especie :
		especies.add(especie);

		// Puerro
		especie = new Especie();

		especie.set_TiempoMinGerminacion(12);

		especie.set_TiempoMaxGerminacion(15);

		especie.set_Distancia(10);

		especie.set_VolumenDeSustrato(5);

		especie.set_IndiceDeRiego(50);

		especie.set_Riego("Mantener humedad");

		boolean sDpuerro[] = { false, false, false, true, true, false, false, false, true, true, false, false };

		especie.set_MesesSiembraDirecta(sDpuerro);

		boolean sPpuerro[] = { false, false, true, false, false, false, false, false, false, false, true, false };

		especie.set_MesesSiembraProtegida(sPpuerro);

		List<String> compPue = new ArrayList();

		compPue.add("Apio");

		compPue.add("Berengena");

		compPue.add("Brocoli");

		compPue.add("Canonigo");

		compPue.add("Chirivia");

		compPue.add("Col");

		compPue.add("Coliflor");

		compPue.add("Colinabo");

		compPue.add("Escarola");

		compPue.add("Espinacas");

		compPue.add("Hinojo");

		compPue.add("Pimiento");

		compPue.add("Repollo");

		compPue.add("Tomates");

		compPue.add("Zanahoria");

		especie.set_Compatibilidad(compPue);

		List<String> incompPue = new ArrayList();

		incompPue.add("Albahaca");

		incompPue.add("Calçot");

		incompPue.add("Cebollas");

		incompPue.add("Cebollino");

		incompPue.add("Guisantes");

		incompPue.add("Habas");

		incompPue.add("Judias");

		incompPue.add("Remolacha");

		especie.set_Incompatibilidad(incompPue);

		especie.set_RecoleccionMin(6);

		especie.set_RecoleccionMax(7);

		especie.set_Nombre("Puerro");

		especie.set_Trasplante("No necesita");

		especie.set_TipoSiembra("Directa o en semillero");
		// Añadir especie :
		especies.add(especie);

		// David Rivera
		// Rabanos/itos

		especie = new Especie();

		especie.set_TiempoMinGerminacion(6);

		especie.set_TiempoMaxGerminacion(8);

		especie.set_Distancia(1);

		especie.set_VolumenDeSustrato(2);

		especie.set_IndiceDeRiego(75);

		especie.set_Riego("Cada día");

		// siembra directa

		boolean sb[] = { true, true, true, true, true, true, true, true, true, true, true, true };

		especie.set_MesesSiembraDirecta(sb);

		// siembra protegida

		boolean sc[] = { false, false, false, false, false, false, false, false, false, false, false, false };

		especie.set_MesesSiembraProtegida(sc);

		// compatibilidad

		List<String> comp = new ArrayList<String>();

		comp.add("Acelga");

		comp.add("Ajo");

		comp.add("Berenjena");

		comp.add("Brocoli");

		comp.add("Calabacin");

		comp.add("Chirivía");

		comp.add("Espinacas");

		comp.add("Guisantes");

		comp.add("Judias");

		comp.add("Lechuga");

		comp.add("Melon");

		comp.add("Perejil");

		comp.add("Pimiento");

		comp.add("Repollo");

		comp.add("Tomates");

		comp.add("Zanahorias");

		especie.set_Compatibilidad(comp);

		// incompatibilidad

		List<String> inc = new ArrayList<>();

		inc.add("Col");

		inc.add("Coliflor");

		inc.add("Colinabo");

		inc.add("Pepino");

		especie.set_Incompatibilidad(inc);

		especie.set_RecoleccionMin(1);

		especie.set_RecoleccionMax(1);

		especie.set_Nombre("Rabanos/itos");

		especie.set_Trasplante("Aclarado en 8cm");

		especie.set_TipoSiembra("Directa, a voleo en lineas");

		// Añadir especie :
		especies.add(especie);

		// Remolacha
		especie = new Especie();

		especie.set_Distancia(1);

		especie.set_TiempoMinGerminacion(10);

		especie.set_TiempoMaxGerminacion(12);

		especie.set_VolumenDeSustrato(5);

		especie.set_IndiceDeRiego(50);

		especie.set_Riego("Mantener humedad");

		// siembra directa

		boolean sdd[] = { true, true, true, true, true, true, true, true, true, true, true, true };

		especie.set_MesesSiembraDirecta(sdd);

		// siembra protegida

		boolean sp[] = { false, false, false, false, false, false, false, false, false, false, false, false };

		especie.set_MesesSiembraProtegida(sp);

		// compatibilidad

		List<String> inc1 = new ArrayList<>();

		inc1.add("Alchicoria");

		inc1.add("Ajo");

		inc1.add("Cebollas");

		inc1.add("Col");

		inc1.add("Escarola");

		inc1.add("Judias");

		inc1.add("Lechuga");

		inc1.add("Pepino");

		inc1.add("Repollo");

		inc1.add("Zanahorias");

		especie.set_Compatibilidad(inc1);

		// incompatibilidad

		List<String> inc2 = new ArrayList<>();

		inc2.add("Acelga");

		inc2.add("Hinojo");

		inc2.add("Pimiento");

		especie.set_Incompatibilidad(inc2);

		especie.set_RecoleccionMin(3);

		especie.set_RecoleccionMax(4);

		especie.set_Nombre("Remolacha");

		especie.set_Trasplante("Adarado en 20 cm");

		especie.set_TipoSiembra("Directa, a voleo en lineas");

		// Añadir especie :
		especies.add(especie);

		// ---------Celia Salamanca-----------------------

		// -------------BORRAJA--------------
		especie = new Especie();

		// array de siembra directa y protegida

		boolean borrajaSiembraDirecta[] = { true, true, true, true, false, false, false, false, true, true, true,
				true };

		// Array de siembra protegida

		boolean borrajaSiembraProtegida[] = { false, false, false, false, false, false, false, false, false, false,
				false, false };

		// Lista de compatiblidad

		// NO TENEMOS DATOS DE COMPATIBILIDAD

		// Añadimos datos

		especie.set_TiempoMinGerminacion(10);

		especie.set_TiempoMaxGerminacion(12);

		especie.set_Distancia(1);

		especie.set_VolumenDeSustrato(22);

		especie.set_IndiceDeRiego(50);

		especie.set_Riego("Mantener humedad");

		especie.set_MesesSiembraDirecta(borrajaSiembraDirecta);

		especie.set_MesesSiembraProtegida(borrajaSiembraProtegida);

		especie.set_Compatibilidad(null);

		especie.set_Incompatibilidad(null);

		especie.set_RecoleccionMin(2);

		especie.set_RecoleccionMax(4);

		especie.set_Nombre("Borraja");

		especie.set_Trasplante("No necesita");

		especie.set_TipoSiembra("Directa");

		// Añadir especie :
		especies.add(especie);

		// -----------RÚCULA-------------------------

		especie = new Especie();

		// array de siembra directa

		boolean ruculaSiembraDirecta[] = { true, true, true, true, true, true, true, true, true, true };

		// array siembra protegida

		boolean ruculaSiembraProtegida[] = { false, false, false, false, false, false, false, false, false, false };

		// Creamos lista compatibilidad

		List<String> compatibilidadNombres = new ArrayList();

		// añadimos datos

		compatibilidadNombres.add("Berenjena");

		compatibilidadNombres.add("Calabacín");

		compatibilidadNombres.add("Pimiento");

		compatibilidadNombres.add("Tomate");

		// lista incompatibilidad

		List<String> inCompatibilidadNombres = new ArrayList();

		// añadimos datos

		inCompatibilidadNombres.add("Col");

		inCompatibilidadNombres.add("Coliflor");

		inCompatibilidadNombres.add("Colinabo");

		inCompatibilidadNombres.add("Rabanos");

		inCompatibilidadNombres.add("Rabanitos");

		// añadimos datos

		especie.set_TiempoMinGerminacion(10);

		especie.set_TiempoMaxGerminacion(12);

		especie.set_Distancia(10);

		especie.set_VolumenDeSustrato(3);

		especie.set_IndiceDeRiego(90);

		especie.set_Riego("Abundante");

		especie.set_MesesSiembraDirecta(ruculaSiembraDirecta);

		especie.set_MesesSiembraProtegida(ruculaSiembraProtegida);

		especie.set_Compatibilidad(compatibilidadNombres);

		especie.set_Incompatibilidad(inCompatibilidadNombres);

		especie.set_RecoleccionMin(1.5f);

		especie.set_RecoleccionMax(1.5f);

		especie.set_Nombre("Rucula");

		especie.set_Trasplante("No necesita");

		especie.set_TipoSiembra("Directa");

		// Añadir especie :
		especies.add(especie);

		// Ivaylo

		especie = new Especie();

		especie.set_TiempoMinGerminacion(8);

		especie.set_TiempoMaxGerminacion(10);

		especie.set_Distancia(20);

		especie.set_VolumenDeSustrato(18);

		especie.set_IndiceDeRiego(80);

		especie.set_Riego("Frecuente, mantener humedad");

		boolean[] mesesSiembraDirecta = { false, false, false, false, false,

				false, false, false, false, false, false, false };

		especie.set_MesesSiembraDirecta(mesesSiembraDirecta);

		boolean[] mesesSiembraProtegida = { false, true, true, true, true,

				true, false, false, false, false, false, false };

		especie.set_MesesSiembraProtegida(mesesSiembraProtegida);

		ArrayList<String> especiesCompatibles = new ArrayList<>();

		especiesCompatibles.add("Acelga");

		especiesCompatibles.add("Ajo");

		especiesCompatibles.add("Albahaca");

		especiesCompatibles.add("Apio");

		especiesCompatibles.add("Brocoli");

		especiesCompatibles.add("Calcot");

		especiesCompatibles.add("Cebollas");

		especiesCompatibles.add("Col");

		especiesCompatibles.add("Coliflor");

		especiesCompatibles.add("Colinabo");

		especiesCompatibles.add("Escarola");

		especiesCompatibles.add("Espinacas");

		especiesCompatibles.add("Fresa");

		especiesCompatibles.add("Judias");

		especiesCompatibles.add("Lechuga");

		especiesCompatibles.add("Manzanilla");

		especiesCompatibles.add("Perejil");

		especiesCompatibles.add("Pimiento");

		especiesCompatibles.add("Puerro");

		especiesCompatibles.add("Rabanos");

		especiesCompatibles.add("Rabanillos");

		especiesCompatibles.add("Repollo");

		especiesCompatibles.add("Rucula");

		especiesCompatibles.add("Zanahorias");

		especie.set_Compatibilidad(especiesCompatibles);

		ArrayList<String> especiesIncompatibles = new ArrayList<>();

		especiesIncompatibles.add("Guisantes");

		especiesIncompatibles.add("Hinojo");

		especiesIncompatibles.add("Patata");

		especiesIncompatibles.add("Pepino");

		especie.set_Incompatibilidad(especiesIncompatibles);

		especie.set_RecoleccionMin(4);

		especie.set_RecoleccionMax(5);

		especie.set_Nombre("Tomates");

		especie.set_Trasplante("Con 3-4 hojas");

		especie.set_TipoSiembra("En semillero");

		// Añadir especie :
		especies.add(especie);

		especie = new Especie();

		especie.set_TiempoMinGerminacion(12);

		especie.set_TiempoMaxGerminacion(15);

		especie.set_Distancia(15);

		especie.set_VolumenDeSustrato(3);

		especie.set_IndiceDeRiego(70);

		especie.set_Riego("Cada dia");

		boolean[] mesesSiembraDirecta1 = { true, true, true, true, true,

				true, true, true, true, true, true, true };

		especie.set_MesesSiembraDirecta(mesesSiembraDirecta1);

		boolean[] mesesSiembraProtegida1 = { false, false, false, false, true,

				false, false, false, false, false, false, false };

		especie.set_MesesSiembraProtegida(mesesSiembraProtegida1);

		ArrayList<String> especiesCompatibles1 = new ArrayList<>();

		especiesCompatibles1.add("Acelga");

		especiesCompatibles1.add("Ajo");

		especiesCompatibles1.add("Canonigo");

		especiesCompatibles1.add("Cebollas");

		especiesCompatibles1.add("Cebollino");

		especiesCompatibles1.add("Guisantes");

		especiesCompatibles1.add("Lechuga");

		especiesCompatibles1.add("Pepino");

		especiesCompatibles1.add("Puerro");

		especiesCompatibles1.add("Rabanos");

		especiesCompatibles1.add("Rabanillos");

		especiesCompatibles1.add("Remolacha");

		especiesCompatibles1.add("Tomates");

		especie.set_Compatibilidad(especiesCompatibles1);

		ArrayList<String> especiesInCompatibles1 = new ArrayList<>();

		especiesInCompatibles1.add("Apio");

		especiesInCompatibles1.add("Hinojo");

		especiesInCompatibles1.add("Perejil");

		especie.set_Incompatibilidad(especiesInCompatibles1);

		especie.set_RecoleccionMin(3);

		especie.set_RecoleccionMax(4);

		especie.set_Nombre("Zanahoria");

		especie.set_Trasplante("No necesita");

		especie.set_TipoSiembra("Directa");

		// Añadir especie :
		especies.add(especie);
		return especies;

		// Fin Ivaylo

	}

}
