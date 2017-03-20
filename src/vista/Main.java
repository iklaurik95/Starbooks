package vista;

import controlador.Socio_controlador;
import modelo.Socio_modelo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Controladores
		Socio_controlador socioControlador = new Socio_controlador();
		
		//Modelos
		Socio_modelo socioModelo = new Socio_modelo("biblioteca");
		
		//Ventanas		
		Principal principal = new Principal();
		Gestion_socio gestionSocio = new Gestion_socio(principal,true);
		Formulario_socio formularioSocio = new Formulario_socio(gestionSocio,true);
		
		//Definir controladores a las ventanas
		principal.setSocioControlador(socioControlador);
		gestionSocio.setSocioControlador(socioControlador);
		formularioSocio.setSocioControlador(socioControlador);
		
		//Definir ventanas y modelos al controlador
		socioControlador.setPrincipal(principal);
		socioControlador.setGestionSocio(gestionSocio);
		socioControlador.setFormularioSocio(formularioSocio);
		socioControlador.setSocioModelo(socioModelo);
		
		principal.setVisible(true);
	}
}
