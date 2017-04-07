package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestamo {
		
	
	Date fecha;
	boolean devuelto;
	private int id_socio;
	private int id_libro;
	private Libro libro;
	private Socio socio;

	
	public Prestamo() {
		super();
		// TODO Auto-generated constructor stub
	}

		
	public void mostrarInfo() {
	
		Libro_modelo lm = new Libro_modelo("Biblioteca");
		Socio_modelo sm = new Socio_modelo("Biblioteca");
		
		
		
		System.out.println("Nombre de libro: " + libro.getTitulo());
		System.out.println("Nombre de socio: " + socio.getNombre());
		System.out.println("Fecha: " + this.fecha);
		System.out.println("Ha sido devuelto?: " + (this.devuelto?"Si":"No"));
		System.out.println("------------------------------");
	}
		
	
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public boolean isDevuelto() {
		return devuelto;
	}

	public void setDevuelto(boolean devuelto) {
		this.devuelto = devuelto;
	}
	
	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	public int getId_socio() {
		return id_socio;
	}

	public void setId_socio(int id_socio) {
		this.id_socio = id_socio;
	}

	public int getId_libro() {
		return id_libro;
	}

	public void setId_libro(int id_libro) {
		this.id_libro = id_libro;
	}
}