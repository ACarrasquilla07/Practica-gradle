package co.ceiba.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="factura")
public class FacturaEntity {
	@Id
	@Column(name = "factura_id",nullable = false)
	private int facturaId;
	@Column(name = "fecha_entrada",nullable=false)
	private Date fechaEntrada;
	@Column(name = "fecha_salida",nullable=true)
	private Date fechaSalida;
	@Column(name = "hora_entrada", nullable=false)
	private String horaEntrada;
	@Column(name = "hora_salida",nullable=true)
	private String horaSalida;
	@Column(name = "total",nullable=true)
	private int total;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vehiculo_fk",referencedColumnName = "placa")
	private VehiculoEntity vehiculo;	
}
