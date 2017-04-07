package vista;

import controlador.Libro_controlador;
import controlador.Prestamo_controlador;
import controlador.Socio_controlador;
import modelo.Libro_modelo;
import modelo.Prestamo_modelo;
import modelo.Socio_modelo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Controladores
		Socio_controlador socioControlador = new Socio_controlador();
		Libro_controlador libroControlador = new Libro_controlador();
		Prestamo_controlador prestamoControlador = new Prestamo_controlador();
		
		//Modelos
		Socio_modelo socioModelo = new Socio_modelo("biblioteca");
		Libro_modelo libroModelo = new Libro_modelo("biblioteca");
		Prestamo_modelo prestamoModelo = new Prestamo_modelo("biblioteca");
		
		//Ventanas		
		Principal principal = new Principal();
		Gestion_socio gestionSocio = new Gestion_socio(principal,true);
		Formulario_socio formularioSocio = new Formulario_socio(gestionSocio,true);
		Borrado_socio borradoSocio = new Borrado_socio(gestionSocio,true);
		Busqueda_socio busquedaSocio = new Busqueda_socio(gestionSocio,true);
		Gestion_libro gestionLibro = new Gestion_libro(principal,true);
		Formulario_libro formularioLibro = new Formulario_libro(gestionLibro,true);
		Busqueda_libro busquedaLibro = new Busqueda_libro(gestionLibro,true);
		Gestion_prestamo gestionPrestamo = new Gestion_prestamo(principal, true);
		Formulario_prestamo formularioPrestamo = new Formulario_prestamo(gestionPrestamo, true);
		Busqueda_prestamo busquedaPrestamo = new Busqueda_prestamo(gestionPrestamo, true);
		
				
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
	    principal.setPrestamoControlador(prestamoControlador);
	    gestionPrestamo.setPrestamoControlador(prestamoControlador);
	    formularioPrestamo.setPrestamoControlador(prestamoControlador);
	    busquedaPrestamo.setPrestamoControlador(prestamoControlador);
	    
		
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
		prestamoControlador.setFormularioPrestamo(formularioPrestamo);
		prestamoControlador.setGestionPrestamo(gestionPrestamo);
		prestamoControlador.setPrestamoModelo(prestamoModelo);
		prestamoControlador.setPrincipal(principal);
		prestamoControlador.setLibroModelo(libroModelo);
		prestamoControlador.setSocioModelo(socioModelo);
		prestamoControlador.setBusquedaPrestamo(busquedaPrestamo);
		
		//Ventana principal
		principal.setVisible(true);

	}
}
