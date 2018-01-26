package co.ceiba.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parqueadero")
public class ParqueaderoEntity {
	@Id
	@Column(name = "parqueadero_id")
	private int parqueaderoId;
	
	@Column(name = "cupo_carros")
	private int capacidadCarros;
	
	@Column(name = "cupo_motos")
	private int capacidadMotos;

	public int getParqueaderoId() {
		return parqueaderoId;
	}

	public void setParqueaderoId(int parqueaderoId) {
		this.parqueaderoId = parqueaderoId;
	}

	public int getCapacidadCarros() {
		return capacidadCarros;
	}

	public void setCapacidadCarros(int capacidadCarros) {
		this.capacidadCarros = capacidadCarros;
	}

	public int getCapacidadMotos() {
		return capacidadMotos;
	}

	public void setCapacidadMotos(int capacidadMotos) {
		this.capacidadMotos = capacidadMotos;
	}
	
	

}
