package reservas;

import java.util.Date;

public class ReservaFamiliar extends Reserva {
	
	protected int NumeroNinos;
	protected int NumeroAdultos;
	
	public ReservaFamiliar(int idReserva, int idUsuario, Date fechaYhora, int minutosReserva, int idPista,
			float precioPista, int descuento, String modalidad, int numeroNinos, int numeroAdultos) {
		super(idReserva, idUsuario, fechaYhora, minutosReserva, idPista, precioPista, descuento, modalidad);
		this.NumeroNinos = numeroNinos;
		this.NumeroAdultos = numeroAdultos;
		this.tipo=TipoReserva.FAMILIAR;
		
	}

	
	
}
