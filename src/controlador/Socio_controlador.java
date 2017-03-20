package controlador;

import modelo.Socio_modelo;
import vista.Formulario_socio;
import vista.Gestion_socio;
import vista.Principal;

public class Socio_controlador {
	
	private Formulario_socio formularioSocio;
	private Gestion_socio gestionSocios;
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
		return gestionSocios;
	}
	public void setGestionSocio(Gestion_socio gestionSocio) {
		this.gestionSocios = gestionSocios;
	}
	public Principal getPrincipal() {
		return principal;
	}
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}
	
}
