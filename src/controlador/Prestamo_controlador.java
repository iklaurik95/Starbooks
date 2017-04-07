package controlador;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import modelo.Libro;
import modelo.Libro_modelo;
import modelo.Prestamo;
import modelo.Prestamo_modelo;
import modelo.Socio;
import modelo.Socio_modelo;
import vista.Busqueda_prestamo;
import vista.Formulario_prestamo;
import vista.Gestion_prestamo;
import vista.Principal;

public class Prestamo_controlador {
	
	private Prestamo_modelo prestamoModelo;
	private Socio_modelo socioModelo;
	private Libro_modelo libroModelo;
	private Formulario_prestamo formularioPrestamo;
	private Gestion_prestamo gestionPrestamo;
	private Busqueda_prestamo busquedaPrestamo;
	

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
	
	public void realizarPrestamo(int idSocio, String titulo) {
		// TODO Auto-generated method stub
		if(this.socioModelo.select(idSocio) != null){
			Libro libro = this.libroModelo.selectPorTitulo(titulo);
			Prestamo prestamo = new Prestamo();
			prestamo.setId_libro(libro.getId());
			prestamo.setId_socio(idSocio);
			prestamo.setFecha(new Date());
			prestamo.setDevuelto(false);
			this.prestamoModelo.insert(prestamo);
			JOptionPane.showMessageDialog(this.formularioPrestamo, "Prestamo realizado", "Prestamo", JOptionPane.INFORMATION_MESSAGE);
			this.formularioPrestamo.limpiarFormularioPrestamo();
			
		}else{
			JOptionPane.showMessageDialog(this.formularioPrestamo, "IdSocio no existe", "Socio", JOptionPane.ERROR_MESSAGE);
		}
				
	}
	
	public Busqueda_prestamo getBusquedaPrestamo() {
		return busquedaPrestamo;
	}
	public void setBusquedaPrestamo(Busqueda_prestamo busquedaPrestamo) {
		this.busquedaPrestamo = busquedaPrestamo;
	}
	public void abrirBusquedaPrestamo() {
		// TODO Auto-generated method stub
		this.busquedaPrestamo.setVisible(true);
	}
	public void mostrarPrestamoDelSocio(int idSocio) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
