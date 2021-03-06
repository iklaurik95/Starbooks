package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Libro_modelo extends Conector {

	public Libro_modelo(String biblioteca) {
		super(biblioteca);
	}

	public ArrayList<Libro> select() {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		try {
			Statement st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from libros");
			while (rs.next()) {
				libros.add(new Libro(rs.getInt("id"), rs.getString("titulo"), rs.getString("autor"),
						rs.getInt("num_pag")));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return libros;
	}

	public Libro select(int id) {
		try {
			Statement st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from libros where id='" + id + "'");
			rs.next();
			Libro libro = new Libro(id, rs.getString("titulo"), rs.getString("autor"),
					rs.getInt("num_pag"));
			return libro;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return null;
	}
	
	public ArrayList<Libro> selectMenorCienPag(){
		ArrayList<Libro> libros = new ArrayList<Libro>();
		try {
			Statement st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from libros where num_pag<100");
			while (rs.next()) {
				Libro libro = new Libro(rs.getInt("id"), rs.getString("titulo"), rs.getString("autor"),
										rs.getInt("num_pag"));
				libros.add(libro);
			}
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return libros;
	}
	
	public ArrayList<Libro> selectEntreCienYQuinientosPag(){
		ArrayList<Libro> libros = new ArrayList<Libro>();
		try {
			Statement st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from libros where num_pag<500 and num_pag>100");
			while (rs.next()) {
				Libro libro = new Libro(rs.getInt("id"), rs.getString("titulo"), rs.getString("autor"),
										rs.getInt("num_pag"));
				libros.add(libro);
			}
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
			return libros;
	}
	
	public ArrayList<Libro> selectMayorQuinientosPag(){
		ArrayList<Libro> libros = new ArrayList<>();
		try {
			Statement st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from libros where num_pag>500");
			while (rs.next()) {
				Libro libro = new Libro(rs.getInt("id"), rs.getString("titulo"), rs.getString("autor"),rs.getInt("num_pag"));
				
				libros.add(libro);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
			return libros;
	}

	public ArrayList<Libro> select(String autor) {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		try {
			Statement st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from libros where autor='" + autor + "'");
			while (rs.next()) {
				Libro libro = new Libro(rs.getInt("id"), rs.getString("titulo"), autor,
										rs.getInt("num_pag"));
				libros.add(libro);
			}
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return libros;

	}
	
	public Libro selectPorTitulo(String titulo) {
		
		try {
			Statement st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM libros WHERE titulo='" + titulo + "'");
			while(rs.next()) {
				Libro libro = new Libro();
				libro.setId(rs.getInt("id"));
				libro.setTitulo(rs.getString("titulo"));
				libro.setAutor(rs.getString("autor"));
				libro.setNum_pag(rs.getInt("num_pag"));
		
				return libro;
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void insert(Libro libro) {
		try {
			PreparedStatement ps = this.conexion
					.prepareStatement("insert into libros (titulo, autor, num_pag) values(?,?,?)");

			ps.setString(1, libro.getTitulo());
			ps.setString(2, libro.getAutor()); 
			ps.setInt(3, libro.getNum_pag());

			ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int update(Libro libro) {
		PreparedStatement ps;
		try {
			ps = this.conexion.prepareStatement("update libros set titulo=?, autor=?, num_pag=? where id=?");
			// set
			ps.setString(1, libro.getTitulo());
			ps.setString(2, libro.getAutor());
			ps.setInt(3, libro.getNum_pag());
			// where
			ps.setInt(4, libro.getId());

			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public void delete(int id_libro) {
		try {
			Statement st = this.conexion.createStatement();
			st.execute("delete from libros where id=" + id_libro);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public ArrayList<String> selectAutores() {
		// TODO Auto-generated method stub
		try {
			Statement st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT DISTINCT autor FROM libros");
			
			ArrayList<String> autores = new ArrayList<String>();
			while(rs.next()){
				autores.add(rs.getString("autor"));
			}
			return autores;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
			
}
