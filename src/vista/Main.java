package vista;

import controlador.Libro_controlador;
import controlador.Socio_controlador;
import modelo.Libro_modelo;
import modelo.Socio_modelo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Controladores
		Socio_controlador socioControlador = new Socio_controlador();
		Libro_controlador libroControlador = new Libro_controlador();
		
		//Modelos
		Socio_modelo socioModelo = new Socio_modelo("biblioteca");
		Libro_modelo libroModelo = new Libro_modelo("biblioteca");
		
		//Ventanas		
		Principal principal = new Principal();
		Gestion_socio gestionSocio = new Gestion_socio(principal,true);
		Formulario_socio formularioSocio = new Formulario_socio(gestionSocio,true);
		Borrado_socio borradoSocio = new Borrado_socio(gestionSocio,true);
		Busqueda_socio busquedaSocio = new Busqueda_socio(gestionSocio,true);
		Gestion_libro gestionLibro = new Gestion_libro(principal,true);
		Formulario_libro formularioLibro = new Formulario_libro(gestionLibro,true);
		Busqueda_libro busquedaLibro = new Busqueda_libro(gestionLibro,true);
				
		//Definir controladores a las ventanas
		principal.setSocioControlador(socioControlador);
		gestionSocio.setSocioControlador(socioControlador);
		formularioSocio.setSocioControlador(socioControlador);
		borradoSocio.setSocioControlador(socioControlador);
		busquedaSocio.setSocioControlador(socioControlador);
	    principal.setLibroControlador(libroControlador);
	    gestionLibro.setLibroControlador(libroControlador);
	    formularioLibro.setLibroControlador(libroControlador);
	    busquedaLibro.setLibroControlador(libroControlador);
		
		//Definir ventanas y modelos al controlador
		socioControlador.setPrincipal(principal);
		socioControlador.setGestionSocio(gestionSocio);
		socioControlador.setFormularioSocio(formularioSocio);
		socioControlador.setBorradoSocio(borradoSocio);
		socioControlador.setBusquedaSocio(busquedaSocio);
		socioControlador.setSocioModelo(socioModelo);
		libroControlador.setPrincipal(principal);
		libroControlador.setGestionLibro(gestionLibro);
		libroControlador.setFormularioLibro(formularioLibro);
		libroControlador.setLibroModelo(libroModelo);
		libroControlador.setBusquedaLibro(busquedaLibro);
		
		principal.setVisible(true);

	}
}
