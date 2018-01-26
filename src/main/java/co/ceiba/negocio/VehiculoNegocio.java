package co.ceiba.negocio;

import co.ceiba.interfaces.IVehiculoNegocio;

public class VehiculoNegocio implements IVehiculoNegocio{
	
	public int calcularPrecioMoto(int numHoras,int cilindraje) {
		int precio = 0;
		if(numHoras >= 9) {
			if(numHoras < 24)
				precio=4000;
			else {
				precio=4000*(numHoras/24);
				numHoras -= 24*(precio/4000);
				if(numHoras < 9)
					precio += (numHoras)*500;
				else
					precio += 4000;
			}
		}
		else
			precio = numHoras*500;
		if(cilindraje > 500) {
			precio+=2000;
		}
		return precio;
	}
	
	public int calcularPrecioCarro(int numHoras) {
		int precio = 0;
		if(numHoras >= 9) {
			if(numHoras < 24)
				precio=8000;
			else {
				precio=8000*(numHoras/24);
				numHoras -= 24*(precio/8000);
				if(numHoras < 9)
					precio += (numHoras)*1000;
				else
					precio += 8000;
			}
		}
		else
			precio = numHoras*100;
		return precio;
	}
}
