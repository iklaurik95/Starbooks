package controlador;

import java.util.ArrayList;
import java.util.Iterator;

import javax.security.auth.callback.TextOutputCallback;

import modelo.Socio;
import modelo.Socio_modelo;
import vista.Borrado_socio;
import vista.Busqueda_socio;
import vista.Formulario_socio;
import vista.Gestion_socio;
import vista.Principal;

public class Socio_controlador {
	
	private Formulario_socio formularioSocio;
	private Gestion_socio gestionSocio;
	private Principal principal;
	private Socio_modelo socioModelo;
	private Borrado_socio  borradoSocio;
	private Busqueda_socio busquedaSocio;
	
	public Busqueda_socio getBusquedaSocio() {
		return busquedaSocio;
	}
	public void setBusquedaSocio(Busqueda_socio busquedaSocio) {
		this.busquedaSocio = busquedaSocio;
	}
	public Socio_modelo getSocioModelo() {
		return socioModelo;
	}
	public void setSocioModelo(Socio_modelo socioModelo) {
		this.socioModelo = socioModelo;
	}
	public Formulario_socio getFormularioSocio() {
		return formularioSocio;
	}
	public void setFormularioSocio(Formulario_socio formularioSocio) {
		this.formularioSocio = formularioSocio;
	}
	public Gestion_socio getGestionSocio() {
		return gestionSocio;
	}
	public void setGestionSocio(Gestion_socio gestionSocio) {
		this.gestionSocio = gestionSocio;
	}
	public Borrado_socio getBorradoSocio() {
		return borradoSocio;
	}
	public void setBorradoSocio(Borrado_socio borradoSocio) {
		this.borradoSocio = borradoSocio;
	}
	public Principal getPrincipal() {
		return principal;
	}
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	public void abrirFormularioSocio() {
		this.formularioSocio.setVisible(true);
	}
	public void abrirGestionSocio() {
		this.gestionSocio.setVisible(true);
	}
	public void cerrarFormularioSocio() {
		// TODO Auto-generated method stub
		this.formularioSocio.limpiarFormularioSocio();
		this.formularioSocio.dispose();
		
	}
		
	public void guardarFormularioSocio(String nombre, String apellido, String dni, String direccion,
			String poblacion,String provincia) {
		// TODO Auto-generated method stub
		Socio socio = new Socio(0,nombre,apellido,dni,direccion,poblacion,provincia);
		
		this.socioModelo.insert(socio);
	}
	public void cerrarGestionSocio() {
		// TODO Auto-generated method stub
		this.gestionSocio.dispose();
	}
	public void rellenarFormulario(int idSocio) {
		// TODO Auto-generated method stub
		Socio socio = socioModelo.select(idSocio);
		this.borradoSocio.rellenarDatosFormulario(socio);
	}
	public void abrirEliminarSocio() {
		// TODO Auto-generated method stub
		ArrayList<Socio> socios = socioModelo.select();
		borradoSocio.rellenarListaSocios(socios);
		this.borradoSocio.setVisible(true);
	}
	public void abrirBorradoSocio() {
		// TODO Auto-generated method stub
		this.borradoSocio.setVisible(true);
	}
	public void abrirBusquedaSocio() {
		// TODO Auto-generated method stub
		
		ArrayList<Socio> socios = socioModelo.select();
		busquedaSocio.rellenarTablaSocios(socios);
		
		this.busquedaSocio.setVisible(true);
	}
	public void cerrarBusquedaSocio() {
		// TODO Auto-generated method stub
		this.busquedaSocio.dispose();
	}
	
}
