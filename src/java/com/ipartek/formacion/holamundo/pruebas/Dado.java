package com.ipartek.formacion.holamundo.pruebas;

/**
 * Clase que simula un dado y saca un alumno aleatorio
 * 
 * @author Curso
 *
 */
public class Dado {

	/**
	 * Variable para representar el número de alumnos static: sólo se reserva
	 * memoria 1 vez final: no es modificable int: tipo Integer, número entero
	 */
	public static final int NUMERO_ALUMNOS = 15;

	public static final String NOMBRES_ALUMNOS[] = { "David Ibarzabal", "Oscar", "Gorka", "Ariane", "Gontzal", "Aitor",
			"Santi", "Raúl", "David Ortiz", "Sergio", "David Barbudo", "Edorta", "Asier", "Alberto", "Iñigo" };

	/**
	 * Muestra por consola todos los alumnos del array <code>NOMBRES_ALUMNOS</code>.<br>
	 * Ejemplo:
	 * <ul>
	 *    <li>[0] David Ibarzabal</li>
	 *    <li>[1] Oscar</li>
	 *    <li>[x] ...</li>
	 *    <li>[14] Iñigo</li>
	 * </ul>
	 */
	public static void mostrarAlumnos (){
		//TODO implementar método
		for (int i=0; i<15; i++){
			System.out.println("["+i+"]"+" "+NOMBRES_ALUMNOS[i]);
		}
	}
	
	/**
	 * Genera un número aleatorio entre 0 y <code>NUMERO_ALUMNOS</code>
	 * @return entero, si falla -1
	 */
	public static int generarNumero(){
		int resul= -1;
		//TODO implementar método
		resul = (int) (Math.random()*NUMERO_ALUMNOS);
		return resul;
	}
	
	public static void mostrarAfortunado(){
		System.out.println("El afortunado en leer es: ");
		
		//TODO obtener numero aleatorio
		int alumnoAfortunado= generarNumero();

		System.out.println(NOMBRES_ALUMNOS[alumnoAfortunado]);
	}
	
	public static void main(String[] args) {

		mostrarAlumnos();
		
		System.out.println("El afortunado en leer es: ");
		
		//TODO obtener numero aleatorio
		int alumnoAfortunado= generarNumero();

		System.out.println(NOMBRES_ALUMNOS[alumnoAfortunado]);
		
	}

}
