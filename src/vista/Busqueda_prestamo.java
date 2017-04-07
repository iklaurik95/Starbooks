package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Prestamo_controlador;

import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Busqueda_prestamo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private JTextField textFieldIdSocio;
	private Prestamo_controlador prestamoControlador;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the dialog.
	 */
	public Busqueda_prestamo(Gestion_prestamo padre,boolean modal) {
		super(padre,modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 414, 229);
		contentPanel.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Socios", null, panel, null);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 60, 349, 130);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblIdsocio = new JLabel("IdSocio:");
		lblIdsocio.setBounds(93, 23, 65, 14);
		panel.add(lblIdsocio);
		
		textFieldIdSocio = new JTextField();
		textFieldIdSocio.setBounds(171, 20, 113, 20);
		panel.add(textFieldIdSocio);
		textFieldIdSocio.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				okActionPerformed();
				
			}
		});
		btnOk.setBounds(313, 19, 55, 23);
		panel.add(btnOk);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
	
	public void okActionPerformed() {
		// TODO Auto-generated method stub
		this.prestamoControlador.mostrarPrestamoDelSocio(Integer.parseInt(textFieldIdSocio.getText()));
	}

	public Prestamo_controlador getPrestamoControlador() {
		return prestamoControlador;
	}

	public void setPrestamoControlador(Prestamo_controlador prestamoControlador) {
		this.prestamoControlador = prestamoControlador;
	}
}
