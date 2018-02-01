package co.ceiba.test;

import static org.junit.Assert.*;

import org.junit.Test;


import co.ceiba.dominio.Parqueadero;
import co.ceiba.dominio.Vehiculo;
import co.ceiba.interfaces.IFacturaNegocio;
import co.ceiba.negocio.FacturaNegocio;
import co.ceiba.negocio.ParqueaderoNegocio;
import co.ceiba.negocio.VehiculoNegocio;


public class FacturaNegocioTest {
	
	private IFacturaNegocio factura=new FacturaNegocio();
	
	@Test
	public void horaEntradaAEntero() {
		//arrange
		String horaEntrada="10:00";
		//act
		int horaEntradaInt = factura.horaEntradaAEntero(horaEntrada);
		//assert
		assertEquals(10,horaEntradaInt);
	}
	
	@Test
	public void horaSalidaAEntero() {
		//arrange
		String horaSalida="12:00";
		//act
		int horaSalidaInt = factura.horaSalidaAEntero(horaSalida);
		//assert
		assertEquals(12,horaSalidaInt);
	}
	
	@Test
	public void minutosHoraEntradaAEntero() {
		//arrange
		String horaEntrada="10:00";
		//act
		int minutosEntrada = factura.minutosHoraEntradaAEntero(horaEntrada);
		//assert
		assertEquals(0,minutosEntrada);
	}
	
	@Test
	public void minutosHoraSalidaAEntero() {
		//arrange		
		String horaSalida="14:35";
		//act
		int minutosSalida = factura.minutosHoraSalidaAEntero(horaSalida);
		//assert
		assertEquals(35,minutosSalida);
	}
	@Test
	public void diferenciaDeHorasIgualesTest() {
		//arrange
		String horaEntrada="10:00";
		String horaSalida="14:00";

		//act
		int resultado = factura.diferenciaDeHoras(horaEntrada, horaSalida);
		//assert
		assertEquals(4,resultado);
	}
	@Test
	public void diferenciaDeHorasDistintasTest() {
		//arrange
		String horaEntrada="10:00";
		String horaSalida="14:35";

		//act
		int resultado = factura.diferenciaDeHoras(horaEntrada, horaSalida);
		//assert
		assertEquals(5,resultado);
	}
	
	@Test
	public void terminarFacturaTest() {
		//arrange
		Vehiculo vehiculo = new Vehiculo("adfef", "Carro", 1500);
		Parqueadero parqueadero = new Parqueadero("Parqueadero 47",20,10);
		ParqueaderoNegocio parqueaderoN = new ParqueaderoNegocio();
		VehiculoNegocio vehiculoN = new VehiculoNegocio();
		String horaEntrada="10:00";
		String horaSalida="14:35";
		int dia = 0;
		//act
		int precio = factura.terminarFactura(vehiculo, parqueadero, parqueaderoN, vehiculoN, horaEntrada, horaSalida, dia);
		//assert
		assertEquals(5000,precio);
	}
	
	@Test
	public void terminarFacturaTest2() {
		//arrange
		Vehiculo vehiculo = new Vehiculo("adfef", "Carro", 1500);
		Parqueadero parqueadero = new Parqueadero("Parqueadero 47",20,10);
		ParqueaderoNegocio parqueaderoN = new ParqueaderoNegocio();
		VehiculoNegocio vehiculoN = new VehiculoNegocio();
		String horaEntrada="10:00";
		String horaSalida="14:35";
		int dia = 2;
		//act
		int precio = factura.terminarFactura(vehiculo, parqueadero, parqueaderoN, vehiculoN, horaEntrada, horaSalida, dia);
		//assert
		assertEquals(0,precio);
	}
	
	@Test
	public void terminarFacturaTest3() {
		//arrange
		Vehiculo vehiculo = new Vehiculo("adfef", "Carro", 1500);
		Parqueadero parqueadero = new Parqueadero("Parqueadero 47",0,10);
		ParqueaderoNegocio parqueaderoN = new ParqueaderoNegocio();
		VehiculoNegocio vehiculoN = new VehiculoNegocio();
		String horaEntrada="10:00";
		String horaSalida="14:35";
		int dia = 2;
		//act
		int precio = factura.terminarFactura(vehiculo, parqueadero, parqueaderoN, vehiculoN, horaEntrada, horaSalida, dia);
		//assert
		assertEquals(0,precio);
	}
}
