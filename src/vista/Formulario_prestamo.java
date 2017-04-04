package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Prestamo_controlador;
import modelo.Socio;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Formulario_prestamo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private Prestamo_controlador prestamoControlador;
	private JComboBox comboBoxLibros;
	private JComboBox comboBoxSocios;

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
			JLabel lblSocios = new JLabel("Socios:");
			lblSocios.setBounds(79, 55, 78, 14);
			contentPanel.add(lblSocios);
		}
		
		comboBoxSocios = new JComboBox();
		comboBoxSocios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rellenarComboBoxSociosActionPerformed();
			}
		});
		comboBoxSocios.setBounds(209, 52, 166, 20);
		contentPanel.add(comboBoxSocios);
		
		JLabel lblLibros = new JLabel("Libros:");
		lblLibros.setBounds(79, 119, 78, 14);
		contentPanel.add(lblLibros);
		
		comboBoxLibros = new JComboBox();
		comboBoxLibros.setBounds(209, 116, 166, 20);
		contentPanel.add(comboBoxLibros);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
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
	
	protected void rellenarComboBoxSociosActionPerformed() {
		// TODO Auto-generated method stub
		prestamoControlador.rellenarComboBoxDeSocios();
	}

	public Prestamo_controlador getPrestamoControlador() {
		return prestamoControlador;
	}

	public void setPrestamoControlador(Prestamo_controlador prestamoControlador) {
		this.prestamoControlador = prestamoControlador;
	}
	
	public void rellenarListaSocios(ArrayList<Socio> socios) {
		// TODO Auto-generated method stub
		DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel();
		for(Socio socio:socios){
			defaultComboBoxModel.addElement(socio.getNombre());
		}
		
		this.comboBoxSocios.setModel(defaultComboBoxModel);
	}
}
