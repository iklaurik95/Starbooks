package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import controlador.Socio_controlador;
import modelo.Socio;

import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Busqueda_socio extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private Socio_controlador socioControlador;
	private JTable tablaSocios;
	/**
	 * Launch the application.
	 */
	
	
	

	/**
	 * Create the dialog.
	 */
	public Busqueda_socio(Gestion_socio padre,boolean modal) {
		super(padre,modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(0, 86, 434, 131);
			contentPanel.add(scrollPane);
			{
				tablaSocios = new JTable();
				scrollPane.setViewportView(tablaSocios);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						socioControlador.cerrarBusquedaSocio();
					}
				});
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
	}

	public Socio_controlador getSocioControlador() {
		return socioControlador;
	}

	public void setSocioControlador(Socio_controlador socioControlador) {
		this.socioControlador = socioControlador;
	}

	public void rellenarTablaSocios(ArrayList<Socio> socios) {
		// TODO Auto-generated method stub
		DefaultTableModel tablaModel = new DefaultTableModel();
		tablaModel.setColumnIdentifiers(new Object[] {"NOMBRE", "APELLIDO","DIRECCION","POBLACION","PROVINCIA","DNI"});
		for(Socio socio : socios){
			tablaModel.addRow(new Object[] {socio.getNombre(),socio.getApellido(),socio.getDireccion(),socio.getPoblacion(),
						socio.getProvincia(),socio.getDni()});
			}
				
		tablaSocios.setModel(tablaModel);
		
		TableRowSorter<DefaultTableModel> modeloOrdenado = new TableRowSorter<DefaultTableModel>(tablaModel);
		tablaSocios.setRowSorter(modeloOrdenado);
	}
	
	
}


