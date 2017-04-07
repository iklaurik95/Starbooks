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
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Gestion_prestamo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private Prestamo_controlador prestamoControlador;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the dialog.
	 */
	public Gestion_prestamo(Principal principal,boolean modal) {
		super(principal,modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnRealizarPrestamo = new JButton("Realizar Prestamo");
		btnRealizarPrestamo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prestamoControlador.abrirFormularioPrestamo();
			}
		});
		btnRealizarPrestamo.setBounds(140, 98, 182, 23);
		contentPanel.add(btnRealizarPrestamo);
		
		JLabel lblGestorPrestamos = new JLabel("GESTOR PRESTAMOS");
		lblGestorPrestamos.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblGestorPrestamos.setBounds(140, 21, 182, 23);
		contentPanel.add(lblGestorPrestamos);
		
		JButton btnConsultarPrestamo = new JButton("Consultar Prestamo");
		btnConsultarPrestamo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				prestamoControlador.abrirBusquedaPrestamo();
			}
		});
		btnConsultarPrestamo.setBounds(140, 149, 182, 23);
		contentPanel.add(btnConsultarPrestamo);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
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
		

