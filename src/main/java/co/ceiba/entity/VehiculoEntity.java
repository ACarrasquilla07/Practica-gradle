package co.ceiba.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehiculo")
public class VehiculoEntity {
	@Id
	@Column (name = "placa",nullable = false)
	private String placa;
	@Column(name = "tipo",nullable = false)
	private String tipo;
	@Column (name = "cilindraje",nullable = false)
	private int cilindraje;
}
