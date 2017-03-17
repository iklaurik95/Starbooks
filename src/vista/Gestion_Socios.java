package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Gestion_Socios extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Gestion_Socios dialog = new Gestion_Socios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Gestion_Socios() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnAnadirSocio = new JButton("Anadir Socio");
			btnAnadirSocio.setBounds(59, 89, 119, 23);
			contentPanel.add(btnAnadirSocio);
		}
		{
			JButton btnBorrarSocio = new JButton("Borrar Socio");
			btnBorrarSocio.setBounds(238, 89, 119, 23);
			contentPanel.add(btnBorrarSocio);
		}
		{
			JButton btnBuscarSocio = new JButton("Buscar Socio");
			btnBuscarSocio.setBounds(59, 142, 119, 23);
			contentPanel.add(btnBuscarSocio);
		}
		{
			JLabel lblGestorDeSocios = new JLabel("GESTOR DE SOCIOS");
			lblGestorDeSocios.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
			lblGestorDeSocios.setBounds(144, 25, 213, 23);
			contentPanel.add(lblGestorDeSocios);
		}
		{
			JButton btnModificarSocio = new JButton("Modificar Socio");
			btnModificarSocio.setBounds(238, 142, 119, 23);
			contentPanel.add(btnModificarSocio);
		}
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

}
