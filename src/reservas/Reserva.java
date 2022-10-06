package reservas;

import java.util.Date;

public abstract class Reserva {

	protected int idReserva;
	protected int idUsuario;
	protected Date fechaYhora;
	protected int minutosReserva;
	protected int idPista;
	protected float precioPista;
	protected int descuento;
	protected TipoReserva tipo;
	protected String modalidad;
	
	
	public Reserva(int idReserva, int idUsuario, Date fechaYhora, int minutosReserva, int idPista, float precioPista, int descuento,
			 String modalidad) {
				
		this.idReserva = idReserva;
		this.idUsuario = idUsuario;
		this.fechaYhora = fechaYhora;
		this.minutosReserva = minutosReserva;
		this.idPista = idPista;
		this.precioPista = precioPista;
		this.descuento = descuento;
		this.modalidad = modalidad;
	}


	public Reserva() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public Date getFechaYhora() {
		return fechaYhora;
	}


	public void setFechaYhora(Date fechaYhora) {
		this.fechaYhora = fechaYhora;
	}


	public int getMinutosReserva() {
		return minutosReserva;
	}


	public void setMinutosReserva(int minutosReserva) {
		this.minutosReserva = minutosReserva;
	}


	public int getIdPista() {
		return idPista;
	}


	public void setIdPista(int idPista) {
		this.idPista = idPista;
	}


	public float getPrecioPista() {
		return precioPista;
	}


	public void setPrecioPista(float precioPista) {
		this.precioPista = precioPista;
	}


	public int getDescuento() {
		return descuento;
	}


	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}


	public TipoReserva getTipo() {
		return tipo;
	}


	public void setTipo(TipoReserva tipo) {
		this.tipo = tipo;
	}


	public String getModalidad() {
		return modalidad;
	}


	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	
	public int getIdReserva() {
		return idReserva;
	}


	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}


	@Override
	public String toString() {
		return "Reserva [idReserva=" + idReserva + ", idUsuario=" + idUsuario + ", fechaYhora=" + fechaYhora
				+ ", minutosReserva=" + minutosReserva + ", idPista=" + idPista + ", precioPista=" + precioPista
				+ ", descuento=" + descuento + ", tipo=" + tipo + ", modalidad=" + modalidad + "]";
	}


	
	
	
}

