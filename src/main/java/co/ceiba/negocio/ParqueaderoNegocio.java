package co.ceiba.negocio;

public class ParqueaderoNegocio {
	public boolean vehiculoPuedeEntrar(String placa ,int dia) {
		boolean mensaje;
		if((placa.charAt(0)=='A')||(placa.charAt(0)=='a')){
			if((dia == 0)||(dia == 1)) {
				mensaje = true;
			}
			else {
				mensaje = false;
			}
		}
		else {
			mensaje = true;
		}		
		return mensaje;
	}
	
	public boolean hayCupo(String tipo,int capacidadCarros,int capacidadMotos) {
		boolean vacio = true;
		if(tipo.equals("Carro")&&(capacidadCarros == 0)) 
			vacio = false;
		if(tipo.equals("Moto")&&(capacidadMotos == 0)) 
			vacio = false;

		return vacio;
	}
	
	public int ingresarVehiculo(String tipo,int capacidadCarros,int capacidadMotos) {
		if(hayCupo(tipo,capacidadCarros,capacidadMotos)) {
			if(tipo.equals("Carro"))
				return capacidadCarros-1;
			else
				return capacidadMotos-1;
		}
		else {
			return 0;
		}
	}
}
