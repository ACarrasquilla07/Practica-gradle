package co.ceiba.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import co.ceiba.dominio.Vehiculo;

@Entity
@Table(name="factura")
public class FacturaEntity {
	@Id
	@Column(name = "factura_id")
	private int facturaId;
	@Column(name = "fecha_entrada")
	private Date fechaEntrada;
	@Column(name = "fecha_salida")
	private Date fechaSalida;
	@Column(name = "hora_entrada")
	private String horaEntrada;
	@Column(name = "hora_salida")
	private String horaSalida;
	@Column(name = "total")
	private int total;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vehiculo_fk")
	private Vehiculo vehiculo;
	
	public int getFacturaId() {
		return facturaId;
	}
	public void setFacturaId(int facturaId) {
		this.facturaId = facturaId;
	}
	public Date getFechaEntrada() {
		return fechaEntrada;
	}
	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public String getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public String getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
}
