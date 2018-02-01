package co.ceiba.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parqueadero")
public class ParqueaderoEntity {
	@Id
	@Column(name = "parqueadero_id",nullable = false)
	private int parqueaderoId;
	
	@Column(name = "cupo_carros",nullable = false)
	private int capacidadCarros;
	
	@Column(name = "cupo_motos",nullable = false)
	private int capacidadMotos;
}
