package reservas;

import java.util.ArrayList;

public class BonoReserva {
	
	private int idBono;
	private int idReserva ;
	
	
	public BonoReserva(int idBono, int idReserva) {
		super();
		this.idBono = idBono;
		this.idReserva = idReserva;
	}



	public int getIdBono() {
		return idBono;
	}



	public void setIdBono(int idBono) {
		this.idBono = idBono;
	}


	public int getIdReserva() {
		return idReserva;
	}


	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}



	@Override
	public String toString() {
		return "BonoReserva [idBono=" + idBono + ", idReserva=" + idReserva + "]";
	}
	
	

	
	
	
	
}
