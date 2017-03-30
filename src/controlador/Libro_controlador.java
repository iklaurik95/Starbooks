package controlador;

import java.util.ArrayList;

import modelo.Libro;
import modelo.Libro_modelo;
import vista.Busqueda_libro;
import vista.Formulario_libro;
import vista.Gestion_libro;
import vista.Main;
import vista.Principal;

public class Libro_controlador {
	private Formulario_libro formularioLibro;
	private Gestion_libro gestionLibro;
	private Principal principal;
	private Libro_modelo libroModelo;
	private Busqueda_libro busquedaLibro;
			
	public Formulario_libro getFormularioLibro() {
		return formularioLibro;
	}
	public void setFormularioLibro(Formulario_libro formularioLibro) {
		this.formularioLibro = formularioLibro;
	}
	public Gestion_libro getGestionLibro() {
		return gestionLibro;
	}
	public void setGestionLibro(Gestion_libro gestionLibro) {
		this.gestionLibro = gestionLibro;
	}
	public Principal getPrincipal() {
		return principal;
	}
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	public Libro_modelo getLibroModelo() {
		return libroModelo;
	}
	public void setLibroModelo(Libro_modelo libroModelo) {
		this.libroModelo = libroModelo;
	}
	public void abrirGestionLibro() {
		// TODO Auto-generated method stub
		this.gestionLibro.setVisible(true);
	}
	public void abrirFormularioLibro() {
		// TODO Auto-generated method stub
		this.formularioLibro.setVisible(true);
	}
	public void cerrarFormularioLibro() {
		// TODO Auto-generated method stub
		this.formularioLibro.limpiarFormularioLibro();
		this.formularioLibro.dispose();
	}
	public void guardarFormularioLibro(String titulo, String autor, int numPag) {
		// TODO Auto-generated method stub
		Libro libro = new Libro(0,titulo,autor,numPag);
		
		this.libroModelo.insert(libro);
	
	}
	public void cerrarGestionLibro() {
		// TODO Auto-generated method stub
		this.gestionLibro.dispose();
	}
	public Busqueda_libro getBusquedaLibro() {
		return busquedaLibro;
	}
	public void setBusquedaLibro(Busqueda_libro busquedaLibro) {
		this.busquedaLibro = busquedaLibro;
	}
	public void abrirBuscarLibro() {
		// TODO Auto-generated method stub
		ArrayList<Libro> libros = libroModelo.select();
		this.busquedaLibro.rellenarCombobox(libros);
		
		this.busquedaLibro.setVisible(true);
		
	}
	
	
}
