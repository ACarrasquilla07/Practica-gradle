package co.ceiba.negocio;

import co.ceiba.dominio.Parqueadero;
import co.ceiba.dominio.Vehiculo;
import co.ceiba.interfaces.IFacturaNegocio;

public class FacturaNegocio implements IFacturaNegocio{
	public int horaEntradaAEntero(String horaEntrada) {
		String [] numHoraE = horaEntrada.split(":");
		return Integer.parseInt(numHoraE[0]);
	}
	
	public int horaSalidaAEntero(String horaSalida) {
		String [] numHoraS = horaSalida.split(":"); 
		return Integer.parseInt(numHoraS[0]);
	}
	
	public int minutosHoraEntradaAEntero(String horaEntrada) {
		String [] numHoraE = horaEntrada.split(":");
		return Integer.parseInt(numHoraE[1]);
	}
	
	public int minutosHoraSalidaAEntero(String horaSalida) {
		String [] numHoraS = horaSalida.split(":");
		return Integer.parseInt(numHoraS[1]);
	}
	
	public int diferenciaDeHoras(String horaEntrada,String horaSalida) {
		int horaEntradaInt = horaEntradaAEntero(horaEntrada);
		int minutosEntrada = minutosHoraEntradaAEntero(horaEntrada);
		int horaSalidaInt = horaSalidaAEntero(horaSalida);
		int minutosSalida = minutosHoraSalidaAEntero(horaSalida);
		if(minutosEntrada==minutosSalida)
			return horaSalidaInt-horaEntradaInt;
		else
			return (horaSalidaInt-horaEntradaInt)+1;
			
	}
	
	public int terminarFactura(Vehiculo vehiculo, Parqueadero parqueadero,ParqueaderoNegocio parqueaderoN,VehiculoNegocio vehiculoN,String horaEntrada,String horaSalida,int dia) {
		if(parqueaderoN.hayCupo(vehiculo.getTipo(),parqueadero.getCapacidadCarros(),parqueadero.getCapacidadMotos())
				&&(parqueaderoN.vehiculoPuedeEntrar(vehiculo.getPlaca(),dia))) {
			return vehiculoN.calcularPrecio(diferenciaDeHoras(horaEntrada, horaSalida),vehiculo.getCilindraje(),vehiculo.getTipo());	
		}
		else 
			return 0;
	}	
}
