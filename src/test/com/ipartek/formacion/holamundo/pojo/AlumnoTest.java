package com.ipartek.formacion.holamundo.pojo;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class AlumnoTest {

	@Test
	public void constructorVacio() {
		
		Alumno a = new Alumno();
		assertTrue("No coincide nombre", Alumno.NOMBRE_ANONIMO.equals(a.getNombre()));
		assertTrue("No coincide apellido", "".equals(a.getApellidos()));
		assertTrue("No coincide becado", a.isBecado()==false);
		assertTrue("No coincide edad", a.getEdad()==0);
		assertTrue("No coincide sexo", a.getSexo()==Alumno.SEXO_INDEFINIDO);
	}

	@Test
	public void constructorParametros() {
		
		Alumno a = new Alumno("Asier");
		assertTrue("No coincide nombre", "Asier".equals(a.getNombre()));
	}

	@Test
	public void testSetNombre() {
		
		
		Alumno a = new Alumno("asier");
		assertTrue("No coincide nombre", "Asier".equals(a.getNombre()));
	}

	@Ignore
	public void testIsMayorEdad() {
		fail("Not yet implemented");
	}

}
