package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DlgConsultarCeramico extends JDialog implements ActionListener{

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
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DlgConsultarCeramico dialog = new DlgConsultarCeramico();
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
	public DlgConsultarCeramico() {
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
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(141, 49, 197, 20);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtAncho = new JTextField(MiProyecto.ancho0 + "");
		txtAncho.setEditable(false);
		txtAncho.setColumns(10);
		txtAncho.setBounds(141, 80, 197, 20);
		contentPanel.add(txtAncho);
		
		txtLargo = new JTextField(MiProyecto.largo0 + "");
		txtLargo.setEditable(false);
		txtLargo.setColumns(10);
		txtLargo.setBounds(141, 112, 197, 20);
		contentPanel.add(txtLargo);
		
		txtEspesor = new JTextField(MiProyecto.espesor0 + "");
		txtEspesor.setEditable(false);
		txtEspesor.setColumns(10);
		txtEspesor.setBounds(141, 143, 197, 20);
		contentPanel.add(txtEspesor);
		
		txtContenido = new JTextField(MiProyecto.contenido0 + "");
		txtContenido.setEditable(false);
		txtContenido.setColumns(10);
		txtContenido.setBounds(141, 179, 197, 20);
		contentPanel.add(txtContenido);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(381, 19, 89, 23);
		contentPanel.add(btnCerrar);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if(e.getSource()==cboMarca) {
			actionPerformedCboMarca(e);
		}
	}

	protected void actionPerformedCboMarca(ActionEvent e) {
		int		marca = cboMarca.getSelectedIndex();
		switch (marca) {
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
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		
		dispose();
		
	}
}
