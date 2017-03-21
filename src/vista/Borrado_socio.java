package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Socio_controlador;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Borrado_socio extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textoId;
	private JTextField textoNombre;
	private JTextField textoApellido;
	private JTextField textoDireccion;
	private JTextField textoPoblacion;
	private JTextField textoProvincia;
	private JTextField textoDni;
	private Socio_controlador socioControlador;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the dialog.
	 */
	public Borrado_socio(Gestion_socio padre,boolean modal) {
		super(padre,modal);
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
				JButton btnGuardar = new JButton("Guardar");
				btnGuardar.setActionCommand("Guardar");
				buttonPane.add(btnGuardar);
				getRootPane().setDefaultButton(btnGuardar);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.setActionCommand("Cancelar");
				buttonPane.add(btnCancelar);
			}
		}
		
		JComboBox listaSocio = new JComboBox();
		listaSocio.setBounds(254, 22, 121, 20);
		getContentPane().add(listaSocio);
		
		JLabel lblSeleccionaUnLibro = new JLabel("Selecciona un socio:");
		lblSeleccionaUnLibro.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblSeleccionaUnLibro.setBounds(91, 24, 155, 14);
		getContentPane().add(lblSeleccionaUnLibro);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(30, 76, 73, 14);
		getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(30, 101, 73, 14);
		getContentPane().add(lblApellido);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(30, 126, 73, 14);
		getContentPane().add(lblDireccion);
		
		JLabel lblPoblacion = new JLabel("Poblacion:");
		lblPoblacion.setBounds(30, 151, 73, 14);
		getContentPane().add(lblPoblacion);
		
		JLabel lblProvincia = new JLabel("Provincia:");
		lblProvincia.setBounds(30, 176, 73, 14);
		getContentPane().add(lblProvincia);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setBounds(30, 201, 46, 14);
		getContentPane().add(lblDni);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setBounds(30, 51, 46, 14);
		getContentPane().add(lblId);
		
		textoId = new JTextField();
		textoId.setEditable(false);
		textoId.setEnabled(false);
		textoId.setBounds(113, 50, 115, 20);
		getContentPane().add(textoId);
		textoId.setColumns(10);
		
		textoNombre = new JTextField();
		textoNombre.setEnabled(false);
		textoNombre.setEditable(false);
		textoNombre.setBounds(113, 73, 115, 20);
		getContentPane().add(textoNombre);
		textoNombre.setColumns(10);
		
		textoApellido = new JTextField();
		textoApellido.setEnabled(false);
		textoApellido.setEditable(false);
		textoApellido.setBounds(113, 98, 115, 20);
		getContentPane().add(textoApellido);
		textoApellido.setColumns(10);
		
		textoDireccion = new JTextField();
		textoDireccion.setEnabled(false);
		textoDireccion.setEditable(false);
		textoDireccion.setBounds(113, 123, 115, 20);
		getContentPane().add(textoDireccion);
		textoDireccion.setColumns(10);
		
		textoPoblacion = new JTextField();
		textoPoblacion.setEnabled(false);
		textoPoblacion.setEditable(false);
		textoPoblacion.setBounds(113, 148, 115, 20);
		getContentPane().add(textoPoblacion);
		textoPoblacion.setColumns(10);
		
		textoProvincia = new JTextField();
		textoProvincia.setEnabled(false);
		textoProvincia.setEditable(false);
		textoProvincia.setBounds(113, 173, 115, 20);
		getContentPane().add(textoProvincia);
		textoProvincia.setColumns(10);
		
		textoDni = new JTextField();
		textoDni.setEnabled(false);
		textoDni.setEditable(false);
		textoDni.setBounds(113, 197, 115, 20);
		getContentPane().add(textoDni);
		textoDni.setColumns(10);
	}
	
	public Socio_controlador getSocioControlador() {
		return socioControlador;
	}

	public void setSocioControlador(Socio_controlador socioControlador) {
		this.socioControlador = socioControlador;
	}
}
