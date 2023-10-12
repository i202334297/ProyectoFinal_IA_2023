package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class DlgVender extends JDialog implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblCantidad;
	private JComboBox<String>cboMarca;
	private JButton btnVender;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgVender dialog = new DlgVender();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgVender() {
		setTitle("Ventas | Vender");
		setBounds(100, 100, 521, 317);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 11, 72, 14);
		contentPanel.add(lblModelo);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(10, 36, 72, 14);
		contentPanel.add(lblPrecio);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 61, 72, 14);
		contentPanel.add(lblCantidad);
		
		cboMarca = new JComboBox<String>();
		cboMarca.setModel(new DefaultComboBoxModel<String>(new String[] {"Cinza Plus", "Luxury", "Austria", "Yungay Mix", "Thalia"}));
		cboMarca.setBounds(92, 7, 196, 22);
		contentPanel.add(cboMarca);
	
		txtPrecio = new JTextField();
		txtPrecio.setBounds(92, 33, 196, 20);
		txtPrecio.addActionListener(this);
		contentPanel.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(92, 58, 196, 20);
		contentPanel.add(txtCantidad);
		
		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		btnVender.setBounds(406, 7, 89, 23);
		contentPanel.add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(406, 32, 89, 23);
		contentPanel.add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 88, 485, 179);
		contentPanel.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed (ActionEvent arg0) {
		if (arg0.getSource()==btnVender) {
			actionPerformedBtnVender(arg0);
		}
		if (arg0.getSource()==btnCerrar) {
			actionPerformedBtnCerrar(arg0);
		}
		if (arg0.getSource()==cboMarca) {
			actionPerformedCboMarca(arg0);
		}

	}
	protected void actionPerformedBtnVender (ActionEvent arg0) {
		
		mensaje("Datos guardados con �xito", "Datos modificados", 1);
		
	}
	protected void actionPerformedCboMarca (ActionEvent arg0) {
		int muestraprecio = cboMarca.getSelectedIndex();
		
		switch (muestraprecio) {
			case 0:
				txtPrecio.setText(String.valueOf(MiProyecto.precio0 + " "));
				break;
			case 1:
				txtPrecio.setText(String.valueOf(MiProyecto.precio1 + " "));
				break;
			case 2:
				txtPrecio.setText(String.valueOf(MiProyecto.precio2 + " "));
				break;
			case 3:
				txtPrecio.setText(String.valueOf(MiProyecto.precio3 + ""));
				break;
			default:
				txtPrecio.setText((MiProyecto.precio4 + ""));
		
		}
		txtS.setText("");
		txtPrecio.setText("");
		txtCantidad.setText("");
		txtCantidad.requestFocus();

		
		
	}
	
	
	protected void actionPerformedBtnCerrar (ActionEvent arg0) {
		
		dispose();
	}
	void mensaje(String s1, String s2, int i) {
		JOptionPane.showMessageDialog(this, s1, s2, i);
	}
}
