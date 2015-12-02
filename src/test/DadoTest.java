import static org.junit.Assert.*;

import org.junit.Test;

import com.ipartek.formacion.holamundo.pruebas.Dado;

public class DadoTest {

	@Test
	public void testGenerarNumero() {
		int numAle = 0;
		for (int i = 0; i < 1000; i++) {
			
			numAle = Dado.generarNumero();
			
			if (numAle == Dado.NUMERO_ALUMNOS)
				fail("tiene que ser un numero menor");
			
			assertTrue(numAle>=0 && numAle < Dado.NUMERO_ALUMNOS);
			
		}
	}

}
