package co.ceiba.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import co.ceiba.dominio.Vehiculo;
import co.ceiba.negocio.VehiculoNegocio;


public class VehiculoNegocioTest {
	@Test
	public void calcularPrecioMotoTest() {
		//arrange
		VehiculoNegocio vehiculo = new VehiculoNegocio();		
		int numHoras = 10;
		int cilindraje = 650;
		//act
		int totalMoto = vehiculo.calcularPrecioMoto(numHoras,cilindraje);
		//assert
		assertEquals(6000, totalMoto);
	}
	
	@Test
	public void calcularPrecioCarroTest() {
		//arrange
		VehiculoNegocio vehiculo = new VehiculoNegocio();		
		int numHoras = 27;
		//act
		int totalCarro = vehiculo.calcularPrecioCarro(numHoras);
		//assert
		assertEquals(11000, totalCarro);
	}
}
