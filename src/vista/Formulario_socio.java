package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Socio_controlador;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario_socio extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textoNombre;
	private JTextField textoApellido;
	private JTextField textoDni;
	private JTextField textoDireccion;
	private JTextField textoPoblacion;
	private JTextField textoProvincia;
	private Socio_controlador socioControlador;

	/**
	 * Launch the application.
	 */
	
	
	/**
	 * Create the dialog.
	 */
	public Formulario_socio(Gestion_socio padre,boolean modal) {
		super(padre,modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNombre = new JLabel("Nombre");
			lblNombre.setBounds(46, 40, 69, 14);
			contentPanel.add(lblNombre);
		}
		{
			JLabel lblApellido = new JLabel("Apellido");
			lblApellido.setBounds(46, 65, 69, 14);
			contentPanel.add(lblApellido);
		}
		{
			JLabel lblDireccion = new JLabel("Direccion");
			lblDireccion.setBounds(46, 115, 69, 14);
			contentPanel.add(lblDireccion);
		}
		{
			JLabel lblProvincia = new JLabel("Provincia");
			lblProvincia.setBounds(46, 165, 69, 14);
			contentPanel.add(lblProvincia);
		}
		{
			JLabel lblDni = new JLabel("DNI");
			lblDni.setBounds(46, 90, 69, 14);
			contentPanel.add(lblDni);
		}
		{
			JLabel lblPoblacion = new JLabel("Poblacion");
			lblPoblacion.setBounds(46, 140, 69, 14);
			contentPanel.add(lblPoblacion);
		}
		{
			textoNombre = new JTextField();
			textoNombre.setBounds(125, 37, 136, 20);
			contentPanel.add(textoNombre);
			textoNombre.setColumns(10);
		}
		{
			textoApellido = new JTextField();
			textoApellido.setBounds(125, 62, 136, 20);
			contentPanel.add(textoApellido);
			textoApellido.setColumns(10);
		}
		{
			textoDni = new JTextField();
			textoDni.setBounds(125, 87, 136, 20);
			contentPanel.add(textoDni);
			textoDni.setColumns(10);
		}
		{
			textoDireccion = new JTextField();
			textoDireccion.setBounds(125, 112, 188, 20);
			contentPanel.add(textoDireccion);
			textoDireccion.setColumns(10);
		}
		{
			textoPoblacion = new JTextField();
			textoPoblacion.setBounds(125, 137, 136, 20);
			contentPanel.add(textoPoblacion);
			textoPoblacion.setColumns(10);
		}
		{
			textoProvincia = new JTextField();
			textoProvincia.setBounds(125, 162, 136, 20);
			contentPanel.add(textoProvincia);
			textoProvincia.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnGuardar = new JButton("Guardar");
				btnGuardar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						socioControlador.guardarFormularioSocio(textoNombre.getText(),textoApellido.getText(),
						textoDni.getText(),textoDireccion.getText(),textoPoblacion.getText(),textoProvincia.getText());
						
						socioControlador.cerrarFormularioSocio();
					}
				});
				btnGuardar.setActionCommand("Guardar");
				buttonPane.add(btnGuardar);
				getRootPane().setDefaultButton(btnGuardar);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						socioControlador.cerrarFormularioSocio();
					}
				});
				btnCancelar.setActionCommand("Cancelar");
				buttonPane.add(btnCancelar);
			}
		}
	}
	
	public void limpiarFormularioSocio() {
		// TODO Auto-generated method stub
		textoNombre.setText(null);
		textoApellido.setText(null);
		textoDni.setText(null);
		textoDireccion.setText(null);
		textoPoblacion.setText(null);
		textoProvincia.setText(null);
	}

	public Socio_controlador getSocioControlador() {
		return socioControlador;
	}

	public void setSocioControlador(Socio_controlador socioControlador) {
		this.socioControlador = socioControlador;
	}

}
