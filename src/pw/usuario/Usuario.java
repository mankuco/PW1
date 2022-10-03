package pw.usuario;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Usuario {
	private String nombre;
	private String apellidos;
	private String email;
	private Date fechaNacimiento;
	private Date fechaInscripcion;
	
	public Usuario(String nombre, String apellidos, String email, Date fechaNacimiento, Date fechaInscripcion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaInscripcion = fechaInscripcion;
	}
	
	public Usuario() {
		super();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Date getFechaInscripcion() {
		return fechaInscripcion;
	}
	public void setFechaInscripcion(Date fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}
	
	public long CalcularAntiguedad() throws ParseException {

		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		LocalDate fecha = LocalDate.parse((CharSequence) this.fechaNacimiento, format);

		LocalDate hoy = LocalDate.now();

		long antiguedad = ChronoUnit.YEARS.between(fecha, hoy);

		return antiguedad;
	}


	@Override
	public String toString() {
		return "Usuario [Nombre=" + nombre + ", Apellidos=" + apellidos + ", Email=" + email + ", Fecha Nacimiento="
				+ fechaNacimiento + ", Fecha Inscripcion=" + fechaInscripcion + "]";
	}
}
	
	
