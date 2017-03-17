package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStarbooks = new JLabel("STARBOOKS");
		lblStarbooks.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		lblStarbooks.setBounds(34, 21, 155, 22);
		contentPane.add(lblStarbooks);
		
		JLabel lblImagen = new JLabel("New label");
		lblImagen.setIcon(new ImageIcon("C:\\Users\\ikaslea\\Documents\\starbooks.jpg"));
		lblImagen.setBounds(199, 11, 225, 239);
		contentPane.add(lblImagen);
		
		JButton btnSocios = new JButton("Socios");
		btnSocios.setBounds(49, 69, 89, 23);
		contentPane.add(btnSocios);
		
		JButton btnPrestamos = new JButton("Prestamos");
		btnPrestamos.setBounds(49, 129, 89, 23);
		contentPane.add(btnPrestamos);
		
		JButton btnLibros = new JButton("Libros");
		btnLibros.setBounds(49, 191, 89, 23);
		contentPane.add(btnLibros);
	}
}
