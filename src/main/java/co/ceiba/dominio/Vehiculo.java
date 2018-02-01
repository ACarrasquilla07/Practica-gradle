package co.ceiba.dominio;

public class Vehiculo {
	private String placa;
	private String tipo;
	private int cilindraje;
	public Vehiculo(String placa, String tipo, int cilindraje) {
		super();
		this.placa = placa;
		this.tipo = tipo;
		this.cilindraje = cilindraje;
	}
	public String getPlaca() {
		return placa;
	}
	public String getTipo() {
		return tipo;
	}
	public int getCilindraje() {
		return cilindraje;
	}
}
