package modelo;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Prestamo_modelo extends Conector {

	public Prestamo_modelo(String biblioteca) {
		super(biblioteca);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Prestamo> select() {
		ArrayList<Prestamo> prestamos_socio = new ArrayList<Prestamo>();
		try {
			Statement st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from prestamos");
			while (rs.next()) {
				Libro libro = new Libro();
				libro.setId(rs.getInt("idLibro"));
				libro.setAutor(rs.getString("autor"));
				libro.setNum_pag(rs.getInt("num_pag"));
				libro.setTitulo(rs.getString("titulo"));
				
				Socio socio = new Socio();
				socio.setId(rs.getInt("idSocio"));
				socio.setNombre(rs.getString("nombre"));
				socio.setApellido(rs.getString("apelllido"));
				socio.setDireccion(rs.getString("direccion"));
				socio.setPoblacion(rs.getString("poblacion"));
				socio.setProvincia(rs.getString("provincia"));
				
				Prestamo prestamo = new Prestamo();
				prestamo.setLibro(libro);
				prestamo.setFecha(rs.getDate("fecha"));
				prestamo.setDevuelto(rs.getBoolean("devuelto"));
				
				prestamos_socio.add(prestamo);
			}
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prestamos_socio;

	}


	public Prestamo select(int id_libro, int id_socio, java.util.Date fecha) {
		try {
			SimpleDateFormat eus_format = new SimpleDateFormat("yyyy-MM-dd");
			Statement st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from prestamos " + "where id_libro='" + id_libro + "' and "
					+ "id_socio='" + id_socio + "' and " + "fecha='" + eus_format.format(fecha) + "'");
			rs.next();
			//Prestamo prestamo = new Prestamo(id_libro, id_socio, fecha, rs.getBoolean("devuelto"));
			//return prestamo;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<Prestamo> prestamosDeSocio(int id_socio) {
		ArrayList<Prestamo> prestamos_socio = new ArrayList<Prestamo>();

		try {

			Statement st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT libros.*,prestamos.* FROM `prestamos` JOIN libros ON prestamos.id_libro=libros.id WHERE id_socio =" + id_socio);
			while (rs.next()) {
				
				Libro libro = new Libro();
				
				
				
			}
			return prestamos_socio;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void insert(Prestamo prestamo) {
		try {
			PreparedStatement ps;
			ps = this.conexion.prepareStatement("insert into " + "prestamos (id_libro,id_socio,fecha,devuelto)" + " values(?,?,?,?)");

			ps.setInt(1, prestamo.getId_libro()); 
			ps.setInt(2, prestamo.getId_socio()); 
			java.sql.Date fecha_sql = new java.sql.Date(prestamo.getFecha().getTime());
			ps.setDate(3, fecha_sql); 
			ps.setBoolean(4, false);
			
			ps.execute();
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}