package co.ceiba.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


import co.ceiba.negocio.ParqueaderoNegocio;

public class ParqueaderoNegocioTest {

	@Test
	public void vehiculoPuedeEntrarTest() {
		//arrange
		ParqueaderoNegocio parqueadero = new ParqueaderoNegocio();
		int dia = 0;
		String placa = "AAA333";
		//act
		boolean mensajeDelParqueadero = parqueadero.vehiculoPuedeEntrar(placa, dia);
		//assert
		Assert.assertTrue(mensajeDelParqueadero);
	}
	
	@Test
	public void vehiculoPuedeEntrarTest2() {
		//arrange
		ParqueaderoNegocio parqueadero = new ParqueaderoNegocio();
		int dia = 0;
		String placa = "BAA333";
		//act
		boolean mensajeDelParqueadero = parqueadero.vehiculoPuedeEntrar(placa, dia);
		//assert
		Assert.assertTrue(mensajeDelParqueadero);
	}
	
	@Test
	public void vehiculoNoPuedeEntrarTest() {
		//arrange
		ParqueaderoNegocio parqueadero = new ParqueaderoNegocio();
		int dia = 2;
		String placa = "AAA333";
		//act
		boolean mensajeDelParqueadero = parqueadero.vehiculoPuedeEntrar(placa,dia);
		//assert
		Assert.assertFalse(mensajeDelParqueadero);
	}
	
	@Test
	public void vehiculoPuedeEntrarTest4() {
		//arrange
		ParqueaderoNegocio parqueadero = new ParqueaderoNegocio();
		int dia = 1;
		String placa = "aAA333";
		//act
		boolean mensajeDelParqueadero = parqueadero.vehiculoPuedeEntrar(placa, dia);
		//assert
		Assert.assertTrue(mensajeDelParqueadero);
	}
	
	@Test
	public void hayCupoTest() {
		//arrange
		ParqueaderoNegocio parqueadero = new ParqueaderoNegocio();
		String tipo = "Carro";
		//act
		boolean hayCupo = parqueadero.hayCupo(tipo,1,0);
		//assert
		Assert.assertTrue(hayCupo);
	}
	
	@Test
	public void noHayCupoTest() {
		//arrange
		ParqueaderoNegocio parqueadero = new ParqueaderoNegocio();
		String tipo = "Moto";
		//act
		boolean hayCupo = parqueadero.hayCupo(tipo,1,0);
		//assert
		Assert.assertFalse(hayCupo);
	}
	
	@Test
	public void noHayCupoTest2() {
		//arrange
		ParqueaderoNegocio parqueadero = new ParqueaderoNegocio();
		String tipo = "Carro";
		//act
		boolean hayCupo = parqueadero.hayCupo(tipo,0,0);
		//assert
		Assert.assertFalse(hayCupo);
	}
	
	@Test
	public void ingresarVehiculoTest() {
		//arrange
		ParqueaderoNegocio parqueadero = new ParqueaderoNegocio();
		String tipo = "Carro";
		//act
		int resultado = parqueadero.ingresarVehiculo(tipo,1,0);
		//assert
		assertEquals(0,resultado);
	}
	
	@Test
	public void ingresarVehiculoTest2() {
		//arrange
		ParqueaderoNegocio parqueadero = new ParqueaderoNegocio();
		String tipo = "Moto";
		//act
		int resultado = parqueadero.ingresarVehiculo(tipo,1,4);
		//assert
		assertEquals(3,resultado);
	}
	
	@Test
	public void noIngresarVehiculoTest() {
		//arrange
		ParqueaderoNegocio parqueadero = new ParqueaderoNegocio();
		String tipo = "Moto";
		//act
		int resultado = parqueadero.ingresarVehiculo(tipo,1,0);
		//assert
		assertEquals(0,resultado);
	}


}
