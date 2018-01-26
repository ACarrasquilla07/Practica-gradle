package co.ceiba.test;

import static org.junit.Assert.*;

import org.junit.Test;

import co.ceiba.interfaces.IFacturaNegocio;
import co.ceiba.negocio.FacturaNegocio;

public class FacturaNegocioTest {

	@Test
	public void horaEntradaAEntero() {
		//arrange
		IFacturaNegocio factura= new FacturaNegocio();;
		String horaEntrada="10:00";
		//act
		int horaEntradaInt = factura.horaEntradaAEntero(horaEntrada);
		//assert
		assertEquals(10,horaEntradaInt);
	}
	
	@Test
	public void horaSalidaAEntero() {
		//arrange
		IFacturaNegocio factura = new FacturaNegocio();
		String horaSalida="12:00";
		//act
		int horaSalidaInt = factura.horaSalidaAEntero(horaSalida);
		//assert
		assertEquals(12,horaSalidaInt);
	}
	
	@Test
	public void minutosHoraEntradaAEntero() {
		//arrange
		IFacturaNegocio factura = new FacturaNegocio();
		String horaEntrada="10:00";
		//act
		int minutosEntrada = factura.minutosHoraEntradaAEntero(horaEntrada);
		//assert
		assertEquals(0,minutosEntrada);
	}
	
	@Test
	public void minutosHoraSalidaAEntero() {
		//arrange
		IFacturaNegocio factura = new FacturaNegocio();
		String horaSalida="14:35";
		//act
		int minutosSalida = factura.minutosHoraSalidaAEntero(horaSalida);
		//assert
		assertEquals(35,minutosSalida);
	}
	@Test
	public void diferenciaDeHorasTest() {
		//arrange
		IFacturaNegocio factura = new FacturaNegocio();
		String horaEntrada="10:00";
		String horaSalida="14:35";

		//act
		int resultado = factura.diferenciaDeHoras(horaEntrada, horaSalida);
		//assert
		assertEquals(5,resultado);
	}

}
