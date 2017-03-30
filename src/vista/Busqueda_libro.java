package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Libro_controlador;
import modelo.Libro;

import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Busqueda_libro extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textoAutor;
	private JTextField textoNumPag;
	private Libro_controlador libroControlador;
	private JComboBox comboBoxTitulo;

	/**
	 * Launch the application.
	 */
	
	

	/**
	 * Create the dialog.
	 */
	public Busqueda_libro(Gestion_libro padre,boolean modal) {
		super(padre,modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPanel.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panelTitulo = new JPanel();
		tabbedPane.addTab("Titulo", null, panelTitulo, null);
		panelTitulo.setLayout(null);
		
		comboBoxTitulo = new JComboBox();
		comboBoxTitulo.setBounds(121, 11, 164, 20);
		panelTitulo.add(comboBoxTitulo);
		
		textoAutor = new JTextField();
		textoAutor.setEnabled(false);
		textoAutor.setEditable(false);
		textoAutor.setBounds(121, 65, 164, 20);
		panelTitulo.add(textoAutor);
		textoAutor.setColumns(10);
		
		textoNumPag = new JTextField();
		textoNumPag.setEnabled(false);
		textoNumPag.setEditable(false);
		textoNumPag.setText("");
		textoNumPag.setBounds(121, 120, 164, 20);
		panelTitulo.add(textoNumPag);
		textoNumPag.setColumns(10);
		
		JLabel lblEligeTitulo = new JLabel("Elige titulo:");
		lblEligeTitulo.setBounds(20, 14, 91, 14);
		panelTitulo.add(lblEligeTitulo);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setBounds(20, 68, 46, 14);
		panelTitulo.add(lblAutor);
		
		JLabel lblNumpag = new JLabel("NumPag:");
		lblNumpag.setBounds(20, 123, 46, 14);
		panelTitulo.add(lblNumpag);
		
		JPanel panelAutor = new JPanel();
		tabbedPane.addTab("Autor", null, panelAutor, null);
		panelAutor.setLayout(null);
		
		JPanel panelNumPag = new JPanel();
		tabbedPane.addTab("NumPag", null, panelNumPag, null);
		panelNumPag.setLayout(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
	
	public Libro_controlador getLibroControlador() {
		return libroControlador;
	}

	public void setLibroControlador(Libro_controlador libroControlador) {
		this.libroControlador = libroControlador;
	}

	public void rellenarCombobox(ArrayList<Libro> libros) {
		// TODO Auto-generated method stub
		for(Libro libro : libros){
			this.comboBoxTitulo.addItem(libro.getId() + ": " + libro.getTitulo());
		}
		this.comboBoxTitulo.setSelectedIndex(-1);
	    
	}
	
	
}