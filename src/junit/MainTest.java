package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import paquete.AlturaPeso;

public class MainTest {

	@Test
	public void testFormat() {
		try {
			AlturaPeso.calcularImc2("180", "27,8");
			fail("Error");
		} catch (NumberFormatException e) {
			System.err.println("Debe de introducir un numero entero");
		}
	}
}
