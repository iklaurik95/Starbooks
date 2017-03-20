package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Libro_controlador;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario_libro extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textoTitulo;
	private JTextField textoAutor;
	private JTextField textoNumPag;
	private Libro_controlador libroControlador;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 */
	public Formulario_libro(Gestion_libro padre, boolean modal) {
		super(padre,modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		textoTitulo = new JTextField();
		textoTitulo.setBounds(186, 48, 86, 20);
		contentPanel.add(textoTitulo);
		textoTitulo.setColumns(10);
		
		textoAutor = new JTextField();
		textoAutor.setBounds(186, 96, 86, 20);
		contentPanel.add(textoAutor);
		textoAutor.setColumns(10);
		
		textoNumPag = new JTextField();
		textoNumPag.setBounds(186, 150, 86, 20);
		contentPanel.add(textoNumPag);
		textoNumPag.setColumns(10);
		
		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setBounds(77, 51, 46, 14);
		contentPanel.add(lblTitulo);
		
		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setBounds(77, 99, 46, 14);
		contentPanel.add(lblAutor);
		
		JLabel lblNumPag = new JLabel("Num. Pag.");
		lblNumPag.setBounds(77, 153, 79, 14);
		contentPanel.add(lblNumPag);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnGuardar = new JButton("Guardar");
				btnGuardar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						libroControlador.guardarFormularioLibro(textoTitulo.getText(),textoAutor.getText(),Integer.parseInt(textoNumPag.getText()));
						libroControlador.cerrarFormularioLibro();
					}
				});
				btnGuardar.setActionCommand("Guardar");
				buttonPane.add(btnGuardar);
				getRootPane().setDefaultButton(btnGuardar);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						libroControlador.cerrarFormularioLibro();
					}
				});
				btnCancelar.setActionCommand("Cancelar");
				buttonPane.add(btnCancelar);
			}
		}
	}
	
	
	public void limpiarFormularioLibro() {
		// TODO Auto-generated method stub
		textoTitulo.setText(null);
		textoAutor.setText(null);
		textoNumPag.setText(null);
	}

	public Libro_controlador getLibroControlador() {
		return libroControlador;
	}

	public void setLibroControlador(Libro_controlador libroControlador) {
		this.libroControlador = libroControlador;
	}
}
