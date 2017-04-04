package controlador;

import java.util.ArrayList;

import modelo.Libro;
import modelo.Libro_modelo;
import modelo.Prestamo_modelo;
import modelo.Socio;
import modelo.Socio_modelo;
import vista.Formulario_prestamo;
import vista.Gestion_prestamo;
import vista.Principal;

public class Prestamo_controlador {
	
	private Prestamo_modelo prestamoModelo;
	private Socio_modelo socioModelo;
	private Libro_modelo libroModelo;
	private Formulario_prestamo formularioPrestamo;
	private Gestion_prestamo gestionPrestamo;
	private Principal principal;
	
	
	public Prestamo_modelo getPrestamoModelo() {
		return prestamoModelo;
	}
	public void setPrestamoModelo(Prestamo_modelo prestamoModelo) {
		this.prestamoModelo = prestamoModelo;
	}
	public Formulario_prestamo getFormularioPrestamo() {
		return formularioPrestamo;
	}
	public void setFormularioPrestamo(Formulario_prestamo formularioPrestamo) {
		this.formularioPrestamo = formularioPrestamo;
	}
	public Gestion_prestamo getGestionPrestamo() {
		return gestionPrestamo;
	}
	public void setGestionPrestamo(Gestion_prestamo gestionPrestamo) {
		this.gestionPrestamo = gestionPrestamo;
	}
	public Principal getPrincipal() {
		return principal;
	}
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	
	public Socio_modelo getSocioModelo() {
		return socioModelo;
	}
	public void setSocioModelo(Socio_modelo socioModelo) {
		this.socioModelo = socioModelo;
	}
	public Libro_modelo getLibroModelo() {
		return libroModelo;
	}
	public void setLibroModelo(Libro_modelo libroModelo) {
		this.libroModelo = libroModelo;
	}
	public void abrirGestionPrestamo() {
		// TODO Auto-generated method stub
		this.gestionPrestamo.setVisible(true);
	}
	public void abrirFormularioPrestamo() {
		// TODO Auto-generated method stub
		this.formularioPrestamo.setVisible(true);
	}
	public void rellenarComboBoxDeSocios() {
		// TODO Auto-generated method stub
		ArrayList<Socio> socios = socioModelo.select();
		this.formularioPrestamo.rellenarListaSocios(socios);
	}
	public void rellenarComboBoxDeLibros() {
		// TODO Auto-generated method stub
		ArrayList<Libro> libros = this.libroModelo.select();
		this.formularioPrestamo.rellenarListaLibros(libros);
	}
	
	
	
}
