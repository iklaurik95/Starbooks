package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Prestamo_controlador;
import modelo.Libro;
import modelo.Socio;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Formulario_prestamo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private Prestamo_controlador prestamoControlador;
	private JTextField textFieldIdSocio;
	private JTextField textFieldTitulo;
	
	/**
	 * Launch the application.
	 */
		
	/**
	 * Create the dialog.
	 */
	public Formulario_prestamo(Gestion_prestamo padre,boolean modal) {
		super(padre,modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblSocios = new JLabel("IdSocio");
			lblSocios.setBounds(79, 55, 78, 14);
			contentPanel.add(lblSocios);
		}
		
		JLabel lblLibros = new JLabel("Titulo");
		lblLibros.setBounds(79, 119, 78, 14);
		contentPanel.add(lblLibros);
		
		textFieldIdSocio = new JTextField();
		textFieldIdSocio.setBounds(152, 52, 147, 20);
		contentPanel.add(textFieldIdSocio);
		textFieldIdSocio.setColumns(10);
		
		textFieldTitulo = new JTextField();
		textFieldTitulo.setColumns(10);
		textFieldTitulo.setBounds(152, 116, 147, 20);
		contentPanel.add(textFieldTitulo);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						prestamoControlador.rellenarPrestamo(Integer.parseInt(textFieldIdSocio.getText()) + " " + textFieldTitulo.getText());
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
			
	}
	
	
	public Prestamo_controlador getPrestamoControlador() {
		return prestamoControlador;
	}

	public void setPrestamoControlador(Prestamo_controlador prestamoControlador) {
		this.prestamoControlador = prestamoControlador;
	}
	
}
