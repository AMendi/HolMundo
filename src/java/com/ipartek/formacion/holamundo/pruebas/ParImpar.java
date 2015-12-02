package com.ipartek.formacion.holamundo.pruebas;

import com.ipartek.formacion.holamundo.pojo.Alumno;

public class ParImpar {
	
	//Cambio tonto

	public static void main(String[] args) {
		System.out.println("Primer ejercicio");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				System.out.println("El número " + i + " es par.");
			else
				System.out.println("El número " + i + " es impar.");
		}
		
		Alumno a1 = new Alumno("Manolo");
		Alumno a2 = new Alumno("Manolita");
		Alumno a3 = new Alumno("Heufrasio");
		
		System.out.println(a1.toString());
		a1.setNombre("Manoli");
		a1.setApellidos("Livinston supongo");
		System.out.println("A1 cambiado: " + a1.toString());
	}

}