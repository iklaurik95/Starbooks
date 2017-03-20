package controlador;

import javax.security.auth.callback.TextOutputCallback;

import modelo.Socio;
import modelo.Socio_modelo;
import vista.Formulario_socio;
import vista.Gestion_socio;
import vista.Principal;

public class Socio_controlador {
	
	private Formulario_socio formularioSocio;
	private Gestion_socio gestionSocio;
	private Principal principal;
	private Socio_modelo socioModelo;
	
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
	

}
