package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DlgModificarCeramico extends JDialog implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtLargo;
	private JTextField txtEspesor;
	private JTextField txtContenido;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblLargo;
	private JLabel lblEspesor;
	private JLabel lblContenido;
	private JComboBox <String> cboMarca;
	private JButton btnCerrar;
	private JButton btnGrabar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgModificarCeramico dialog = new DlgModificarCeramico();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the dialog.
	 */
	public DlgModificarCeramico() {
		setResizable(false);
		setTitle("Mantenimiento | Consultar Cer\u00E1mico");
		setBounds(100, 100, 496, 255);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 23, 102, 14);
		contentPanel.add(lblModelo);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(10, 52, 102, 14);
		contentPanel.add(lblPrecio);
		
		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(10, 83, 102, 14);
		contentPanel.add(lblAncho);
		
		lblLargo = new JLabel("Largo (cm)");
		lblLargo.setBounds(10, 115, 102, 14);
		contentPanel.add(lblLargo);
		
		lblEspesor = new JLabel("Espesor (mm)");
		lblEspesor.setBounds(10, 146, 102, 14);
		contentPanel.add(lblEspesor);
		
		lblContenido = new JLabel("Contenido");
		lblContenido.setBounds(10, 182, 102, 14);
		contentPanel.add(lblContenido);
		
		cboMarca = new JComboBox<String>();
		cboMarca.addActionListener(this);
		cboMarca.setModel(new DefaultComboBoxModel <String>
				 		 (new String[] {"Cinza Plus", "Luxury", "Austria", "Yungay Mix", "Thalia"}));
		cboMarca.setBounds(141, 19, 197, 22);
		contentPanel.add(cboMarca);
		
		txtPrecio = new JTextField(MiProyecto.precio0 + "");
		txtPrecio.setBounds(141, 49, 197, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField(MiProyecto.ancho0 + "");
		txtAncho.setColumns(10);
		txtAncho.setBounds(141, 80, 197, 20);
		contentPanel.add(txtAncho);
		
		txtLargo = new JTextField(MiProyecto.largo0 + "");
		txtLargo.setColumns(10);
		txtLargo.setBounds(141, 112, 197, 20);
		contentPanel.add(txtLargo);
		
		txtEspesor = new JTextField(MiProyecto.espesor0 + "");
		txtEspesor.setColumns(10);
		txtEspesor.setBounds(141, 143, 197, 20);
		contentPanel.add(txtEspesor);
		
		txtContenido = new JTextField(MiProyecto.contenido0 + "");
		txtContenido.setColumns(10);
		txtContenido.setBounds(141, 179, 197, 20);
		contentPanel.add(txtContenido);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(381, 48, 89, 23);
		contentPanel.add(btnCerrar);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(381, 19, 89, 23);
		contentPanel.add(btnGrabar);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if(e.getSource()==cboMarca) {
			actionPerformedCboMarca(e);
		}
		if (e.getSource()==btnGrabar) {
			actionPerformedBtnGrabar(e);
		}
	}

	protected void actionPerformedCboMarca(ActionEvent e) {
		switch (cboMarca.getSelectedIndex()) {
			case 0:
				txtPrecio.setText(MiProyecto.precio0 + "");
				txtAncho.setText(MiProyecto.ancho0 + "");
				txtLargo.setText(MiProyecto.largo0 + "");
				txtEspesor.setText(MiProyecto.espesor0 + "");
				txtContenido.setText(MiProyecto.contenido0 + "");
				break;
				
			case 1:
				txtPrecio.setText(MiProyecto.precio1 + "");
				txtAncho.setText(MiProyecto.ancho1 + "");
				txtLargo.setText(MiProyecto.largo1 + "");
				txtEspesor.setText(MiProyecto.espesor1 + "");
				txtContenido.setText(MiProyecto.contenido1 + "");
				break;
				
			case 2:
				txtPrecio.setText(MiProyecto.precio2 + "");
				txtAncho.setText(MiProyecto.ancho2 + "");
				txtLargo.setText(MiProyecto.largo2+ "");
				txtEspesor.setText(MiProyecto.espesor2 + "");
				txtContenido.setText(MiProyecto.contenido2 + "");
				break;
		
			case 3:
				txtPrecio.setText(MiProyecto.precio3 + "");
				txtAncho.setText(MiProyecto.ancho3 + "");
				txtLargo.setText(MiProyecto.largo3 + "");
				txtEspesor.setText(MiProyecto.espesor3 + "");
				txtContenido.setText(MiProyecto.contenido3 + "");
				break;
			
			default : 
				txtPrecio.setText(MiProyecto.precio4 + "");
				txtAncho.setText(MiProyecto.ancho4 + "");
				txtLargo.setText(MiProyecto.largo4 + "");
				txtEspesor.setText(MiProyecto.espesor4 + "");
				txtContenido.setText(MiProyecto.contenido4 + "");
		}
		
		
		
	}
	protected void actionPerformedBtnGrabar(ActionEvent e) {

		try {
			double precio = leerReal(txtPrecio);
			double ancho = leerReal (txtAncho);
			double largo = leerReal (txtLargo);
			double espesor = leerReal (txtEspesor);
			int contenido = Integer.parseInt(txtContenido.getText());

			
//	        double precio    = 0; //= leerReal(txtPrecio);
//	        double ancho     = 0;
//	        double largo     = 0;
//	        double espesor   = 0;
//	        int    contenido = 0; // Cambiado a leerEntero
	        
	        
	        int selectedMarca = cboMarca.getSelectedIndex();

	        if(!soloDecimal(txtPrecio.getText())) {	        	
	        	validacion("PRECIO",txtPrecio);
	        }
	        else if(!soloDecimal(txtAncho.getText())) {	        	
	        	validacion("ANCHO",txtAncho);
	        }
	        else if(!soloDecimal(txtLargo.getText())) {	        	
	        	validacion("LARGO",txtLargo);
	        }
	        else if(!soloDecimal(txtEspesor.getText())) {	        	
	        	validacion("ESPESOR",txtEspesor);
	        }
	        else if(!soloEntero(txtContenido.getText())) {	        	
	        	validacion("CONTENIDO",txtContenido);
	        }
	        else {	        	
	        	switch (selectedMarca) {
		            case 0:
		                MiProyecto.precio0 = precio;
		                MiProyecto.ancho0 = ancho;
		                MiProyecto.largo0 = largo;
		                MiProyecto.espesor0 = espesor;
		                MiProyecto.contenido0 = contenido;
		                break;
		            case 1:
		                MiProyecto.precio1 = precio;
		                MiProyecto.ancho1 = ancho;
		                MiProyecto.largo1 = largo;
		                MiProyecto.espesor1 = espesor;
		                MiProyecto.contenido1 = contenido;
		                break;
		            case 2:
		                MiProyecto.precio2 = precio;
		                MiProyecto.ancho2 = ancho;
		                MiProyecto.largo2 = largo;
		                MiProyecto.espesor2 = espesor;
		                MiProyecto.contenido2 = contenido;
		                break;
		            case 3:
		                MiProyecto.precio3 = precio;
		                MiProyecto.ancho3 = ancho;
		                MiProyecto.largo3 = largo;
		                MiProyecto.espesor3 = espesor;
		                MiProyecto.contenido3 = contenido;
		                break;
		            default:
		                MiProyecto.precio4 = precio;
		                MiProyecto.ancho4 = ancho;
		                MiProyecto.largo4 = largo;
		                MiProyecto.espesor4 = espesor;
		                MiProyecto.contenido4 = contenido;
		        }

	        	mensaje("Datos guardados con �xito", "Datos modificados", 1);
	        }	        	       
	    } 
		catch (Exception x) 
		{
	    	mensaje(x.getMessage(), "Error", 0);
	    }
	}

	
	

	protected void actionPerformedBtnCerrar(ActionEvent e) {
		
		dispose();
		
	}
	
	//  M�todos tipo void (con par�metros)
	void validacion(String s, JTextField txt) {
		mensaje("Ingrese " + s + " correcto", "Error", 0);
		txt.setText("");
		txt.requestFocus();		
	}
	void mensaje(String s1, String s2, int i) {
		JOptionPane.showMessageDialog(this, s1, s2, i);
	}
	//  M�todos que retornan valor (con par�metros)
	String leerCadena(JTextField txt) {
		return txt.getText();
	}
	double leerReal(JTextField txt) {
		return Double.parseDouble(txt.getText());
	}
	
	boolean soloDecimal(String valor) {
		return valor.matches("^[0-9999]+(\\.[0-9]+){0,3}$");		
	}
	
	boolean soloEntero(String valor) {
		return valor.matches("^[0-9999]{1,3}$");		
	}
	
}
