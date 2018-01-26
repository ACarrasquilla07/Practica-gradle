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
		int totalEntrada = (horaEntradaAEntero(horaEntrada)*60)+minutosHoraEntradaAEntero(horaEntrada);
		int totalSalida = (horaSalidaAEntero(horaSalida)*60)+minutosHoraSalidaAEntero(horaSalida);
		int promediarDiferenciaDeHoras = 60*(((totalSalida-totalEntrada)/60)+1);
		if((promediarDiferenciaDeHoras - (totalSalida-totalEntrada))<=30)
			return ((totalSalida-totalEntrada)/60)+1;
		else
			return (totalSalida-totalEntrada)/60;
	}
	
	public void cobrar(Vehiculo vehiculo, Parqueadero parqueadero,ParqueaderoNegocio parqueaderoN,VehiculoNegocio vehiculoN,String horaEntrada,String horaSalida,int dia) {
		if(parqueaderoN.hayCupo(vehiculo.getTipo(),parqueadero.getCapacidadCarros(),parqueadero.getCapacidadMotos())
				&&(parqueaderoN.vehiculoPuedeEntrar(vehiculo.getPlaca(),dia))) {
			if(vehiculo.getTipo().equals("Moto")) 
				vehiculoN.calcularPrecioMoto(diferenciaDeHoras(horaEntrada, horaSalida),vehiculo.getCilindraje());
			if(vehiculo.getTipo().equals("Carro"))
				vehiculoN.calcularPrecioCarro(diferenciaDeHoras(horaEntrada, horaSalida));
		}
	}	
}
