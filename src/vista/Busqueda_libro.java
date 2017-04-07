package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;

public class Busqueda_libro extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textoAutor;
	private JTextField textoNumPag;
	private Libro_controlador libroControlador;
	private JComboBox comboBoxTitulo;
	private JComboBox comboBoxAutor;
	private JList listaLibros;
	private JRadioButton radioButtonMenor100;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JList listaLibrosNumPag;
	

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
		comboBoxTitulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBoxTituloActionPerdormed();
			}
		});
		comboBoxTitulo.setBounds(121, 11, 276, 20);
		panelTitulo.add(comboBoxTitulo);
		
		textoAutor = new JTextField();
		textoAutor.setEnabled(false);
		textoAutor.setEditable(false);
		textoAutor.setBounds(121, 65, 276, 20);
		panelTitulo.add(textoAutor);
		textoAutor.setColumns(10);
		
		textoNumPag = new JTextField();
		textoNumPag.setEnabled(false);
		textoNumPag.setEditable(false);
		textoNumPag.setText("");
		textoNumPag.setBounds(121, 120, 276, 20);
		panelTitulo.add(textoNumPag);
		textoNumPag.setColumns(10);
		
		JLabel lblAutor = new JLabel("Autor:");
		lblAutor.setBounds(20, 68, 46, 14);
		panelTitulo.add(lblAutor);
		
		JLabel lblNumpag = new JLabel("NumPag:");
		lblNumpag.setBounds(20, 123, 91, 14);
		panelTitulo.add(lblNumpag);
		
		JPanel panelNumPag = new JPanel();
		tabbedPane.addTab("NumPag", null, panelNumPag, null);
		
		radioButtonMenor100 = new JRadioButton("<100");
		radioButtonMenor100.setBounds(39, 23, 109, 23);
		buttonGroup.add(radioButtonMenor100);
		radioButtonMenor100.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radioButtonMenor100ActionPerformed();
			}
		});
		panelNumPag.setLayout(null);
		panelNumPag.add(radioButtonMenor100);
		
		JRadioButton radioButtonEntre100y500 = new JRadioButton("100-500");
		radioButtonEntre100y500.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				radioButtonEntre100y500ActionPerformed();
			}
		});
		radioButtonEntre100y500.setBounds(39, 79, 109, 23);
		buttonGroup.add(radioButtonEntre100y500);
		panelNumPag.add(radioButtonEntre100y500);
		
		JRadioButton radioButtonMayor500 = new JRadioButton(">500");
		radioButtonMayor500.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				radioButtonMayor500ActionPerformed();
			}
		});
		radioButtonMayor500.setBounds(39, 140, 109, 23);
		buttonGroup.add(radioButtonMayor500);
		panelNumPag.add(radioButtonMayor500);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(168, 23, 209, 170);
		panelNumPag.add(scrollPane);
		
		listaLibrosNumPag = new JList();
		scrollPane.setViewportView(listaLibrosNumPag);
		
		JPanel panelAutor = new JPanel();
		tabbedPane.addTab("Autor", null, panelAutor, null);
		
		comboBoxAutor = new JComboBox();
		comboBoxAutor.setBounds(149, 11, 210, 20);
		comboBoxAutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBoxAutoresActionPerformed();
			}
		});
		panelAutor.setLayout(null);
		panelAutor.add(comboBoxAutor);
		
		JLabel lblEligeElAutor = new JLabel("Autor:");
		lblEligeElAutor.setBounds(83, 14, 56, 14);
		panelAutor.add(lblEligeElAutor);
		
		listaLibros = new JList();
		listaLibros.setBounds(105, 42, 254, 141);
		panelAutor.add(listaLibros);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}

	protected void radioButtonMayor500ActionPerformed() {
		// TODO Auto-generated method stub
		libroControlador.buscarNumPagMayorQuinientos();
	}

	protected void radioButtonEntre100y500ActionPerformed() {
		// TODO Auto-generated method stub
		libroControlador.buscarNumPagEntreCienYQuinientos();
	}

	protected void radioButtonMenor100ActionPerformed() {
		// TODO Auto-generated method stub
		libroControlador.buscarNumPagMenorCien();
	}

	protected void comboBoxAutoresActionPerformed() {
		// TODO Auto-generated method stub
		libroControlador.buscarPorAutor(this.comboBoxAutor.getSelectedItem().toString());
		
	}

	protected void comboBoxTituloActionPerdormed() {
		// TODO Auto-generated method stub
				
		String item = this.comboBoxTitulo.getSelectedItem().toString();
		String [] partes = item.split(":");
		
		int idLibro = Integer.parseInt(partes[0]); //posicion id
			
		this.libroControlador.buscarPorTitulo(idLibro);
	
	}
	
	public Libro_controlador getLibroControlador() {
		return libroControlador;
	}

	public void setLibroControlador(Libro_controlador libroControlador) {
		this.libroControlador = libroControlador;
	}

	public void rellenarComboboxLibros(ArrayList<Libro> libros) {
		// TODO Auto-generated method stub
		DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel<String>();		
		for(Libro libro : libros){
			defaultComboBoxModel.addElement(libro.getId() + ": " + libro.getTitulo());
		}
		defaultComboBoxModel.setSelectedItem("Elige un titulo");
		
		this.comboBoxTitulo.setModel(defaultComboBoxModel);
	}

	public void rellenarPestañaTitulo(Libro libro) {
		// TODO Auto-generated method stub
		this.textoAutor.setText(libro.getAutor());
		this.textoNumPag.setText(String.valueOf(libro.getNum_pag()));
	}



	public void rellenarComboboxAutores(ArrayList<String> autores) {
		// TODO Auto-generated method stub
		DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel<String>();
		for(String autor: autores){
			defaultComboBoxModel.addElement(autor);
		}
		
		defaultComboBoxModel.setSelectedItem("Elige un autor");
		
		this.comboBoxAutor.setModel(defaultComboBoxModel);
	}

	public void rellenarListaAutores(ArrayList<Libro> libros) {
		// TODO Auto-generated method stub
		DefaultListModel defaultListModel = new DefaultListModel();
		for(Libro libro: libros){
			defaultListModel.addElement(libro.getTitulo() + " - " + libro.getNum_pag());
		}
		
		this.listaLibros.setModel(defaultListModel);
	}

	public void rellenarListaLibrosNumPag(ArrayList<Libro> libros) {
		// TODO Auto-generated method stub
		DefaultListModel defaultListModel= new DefaultListModel();
		for(Libro libro:libros){
			defaultListModel.addElement(libro.getTitulo() + " - " + libro.getAutor() + " - " + libro.getNum_pag());
		}
		
		this.listaLibrosNumPag.setModel(defaultListModel);
	}
	
	
}
