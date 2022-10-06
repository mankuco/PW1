package reservas;

import java.util.Date;

public class ReservaAdultos extends Reserva {
	
	protected int NumeroAdultos;

	
	
	public ReservaAdultos(
			int idReserva, 
			int idUsuario,
			Date fechaYhora, 
			int minutosReserva, 
			int idPista,
			float precioPista,
			int descuento,
			String modalidad, 
			int numeroAdultos) {
		super(idReserva, idUsuario, fechaYhora, minutosReserva, idPista, precioPista, descuento, modalidad);
		this.NumeroAdultos = numeroAdultos;
		this.tipo=TipoReserva.ADULTOS;
	}



	public int getNumeroAdultos() {
		return NumeroAdultos;
	}



	public void setNumeroAdultos(int numeroAdultos) {
		NumeroAdultos = numeroAdultos;
	}



	@Override
	public String toString() {
		return "ReservaAdultos [NumeroAdultos=" + NumeroAdultos + ", idReserva=" + idReserva + ", idUsuario="
				+ idUsuario + ", fechaYhora=" + fechaYhora + ", minutosReserva=" + minutosReserva + ", idPista="
				+ idPista + ", precioPista=" + precioPista + ", descuento=" + descuento + ", tipo=" + tipo
				+ ", modalidad=" + modalidad + "]";
	}

	
	
	
	
}
