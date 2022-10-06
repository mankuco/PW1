package reservas;

import java.util.Date;

public class ReservaInfantil extends Reserva  {
	
	protected int NumeroNinos;
	


	public ReservaInfantil(int idReserva, int idUsuario, Date fechaYhora, int minutosReserva, int idPista,
			float precioPista, int descuento, String modalidad, int numeroNinos) {
		super(idReserva, idUsuario, fechaYhora, minutosReserva, idPista, precioPista, descuento, modalidad);
		this.NumeroNinos = numeroNinos;
		this.tipo=TipoReserva.INFANTIL;
	}

	public int getNumeroNinos() {
		return NumeroNinos;
	}

	public void setNumeroNinos(int numeroNinos) {
		NumeroNinos = numeroNinos;
	}

	@Override
	public String toString() {
		return "ReservaInfantil [NumeroNinos=" + NumeroNinos + ", idReserva=" + idReserva + ", idUsuario=" + idUsuario
				+ ", fechaYhora=" + fechaYhora + ", minutosReserva=" + minutosReserva + ", idPista=" + idPista
				+ ", precioPista=" + precioPista + ", descuento=" + descuento + ", tipo=" + tipo + ", modalidad="
				+ modalidad + "]";
	}

	
	
	

}
