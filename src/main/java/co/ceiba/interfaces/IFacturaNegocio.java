package co.ceiba.interfaces;

import co.ceiba.dominio.Parqueadero;
import co.ceiba.dominio.Vehiculo;
import co.ceiba.negocio.ParqueaderoNegocio;
import co.ceiba.negocio.VehiculoNegocio;

public interface IFacturaNegocio {
	public int horaEntradaAEntero(String horaEntrada);
	
	public int horaSalidaAEntero(String horaSalida) ;
	
	public int minutosHoraEntradaAEntero(String horaEntrada);
	
	public int minutosHoraSalidaAEntero(String horaSalida);
	
	public int diferenciaDeHoras(String horaEntrada,String horaSalida);
	
	public int terminarFactura(Vehiculo vehiculo, Parqueadero parqueadero,ParqueaderoNegocio parqueaderoN,
			VehiculoNegocio vehiculoN,String horaEntrada,String horaSalida,int dia);
}
