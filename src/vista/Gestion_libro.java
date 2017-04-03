package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Libro_controlador;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gestion_libro extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private Libro_controlador libroControlador;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the dialog.
	 */
	public Gestion_libro(Principal principal,boolean modal) {
		super(principal,modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 434, 1);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 228, 434, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						libroControlador.cerrarGestionLibro();
					}
				});
				btnCancelar.setActionCommand("Cancelar");
				buttonPane.add(btnCancelar);
			}
		}
		{
			JLabel lblGestorDeLibros = new JLabel("GESTOR DE LIBROS");
			lblGestorDeLibros.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
			lblGestorDeLibros.setBounds(125, 24, 207, 14);
			getContentPane().add(lblGestorDeLibros);
		}
		{
			JButton btnAnadirLibro = new JButton("Anadir Libro");
			btnAnadirLibro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					libroControlador.abrirFormularioLibro();
				}
			});
			btnAnadirLibro.setBounds(72, 76, 136, 23);
			getContentPane().add(btnAnadirLibro);
		}
		{
			JButton btnBuscarLibro = new JButton("Buscar Libro");
			btnBuscarLibro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					btnBuscarLibroActionPerformed();
				}
			});
			btnBuscarLibro.setBounds(72, 136, 136, 23);
			getContentPane().add(btnBuscarLibro);
		}
		{
			JButton btnBorrarLibro = new JButton("Borrar Libro");
			btnBorrarLibro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			btnBorrarLibro.setBounds(249, 76, 136, 23);
			getContentPane().add(btnBorrarLibro);
		}
		{
			JButton btnModificarLibro = new JButton("Modificar Libro");
			btnModificarLibro.setBounds(249, 136, 136, 23);
			getContentPane().add(btnModificarLibro);
		}
	}
	
	protected void btnBuscarLibroActionPerformed() {
		// TODO Auto-generated method stub
		libroControlador.abrirBuscarLibro();
	}

	public Libro_controlador getLibroControlador() {
		return libroControlador;
	}

	public void setLibroControlador(Libro_controlador libroControlador) {
		this.libroControlador = libroControlador;
		
	}

}
