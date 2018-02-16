package junit;

import static org.junit.Assert.*;

import org.junit.Test;

import paquete.AlturaPeso;

public class MainTest {

	@Test
	public void testFormat() {
		try {
			AlturaPeso.calcularImc2("180", "d");
			fail("WTF");
		} catch (NumberFormatException e) {
			System.err.println("Error Formato");
		}
	}
	
	@Test
	public void testNull() {
		try {
			AlturaPeso.calcularImc2("180", null);
			fail("Pero que hacees!!");
		} catch (NullPointerException e) {
			System.err.println("Error Null");
		}
	}

}
