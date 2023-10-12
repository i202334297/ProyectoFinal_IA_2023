package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DlgConfigurarDescuentos extends JDialog implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtPdescuento;
	private JTextField txtSdescuento;
	private JTextField txtTdescuento;
	private JTextField txtCdescuento;
	private JLabel lblPorcentaje1;
	private JLabel lblPorcentaje2;
	private JLabel lblPorcentaje3;
	private JLabel lblPorcentaje4;
	private JButton btnAceptar;
	private JButton btnCancelar;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgConfigurarDescuentos dialog = new DlgConfigurarDescuentos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgConfigurarDescuentos() {
		setTitle("Configurar | Configurar descuentos");
		setBounds(100, 100, 450, 175);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblPdescuento = new JLabel("1 a 5 unidades");
			lblPdescuento.setBounds(10, 22, 103, 14);
			contentPanel.add(lblPdescuento);
		}
		{
			JLabel lblSdescuento = new JLabel("6 a 10 unidades");
			lblSdescuento.setBounds(10, 51, 103, 14);
			contentPanel.add(lblSdescuento);
		}
		{
			JLabel lblTdescuento = new JLabel("11 a 15 unidades");
			lblTdescuento.setBounds(10, 77, 103, 14);
			contentPanel.add(lblTdescuento);
		}
		{
			JLabel lblCdescuento = new JLabel("M\u00E1s de 15 unidades");
			lblCdescuento.setBounds(10, 107, 115, 14);
			contentPanel.add(lblCdescuento);
		}
		
		txtPdescuento = new JTextField();
		txtPdescuento.setBounds(135, 19, 86, 20);
		contentPanel.add(txtPdescuento);
		txtPdescuento.setColumns(10);
		
		txtSdescuento = new JTextField();
		txtSdescuento.setColumns(10);
		txtSdescuento.setBounds(135, 48, 86, 20);
		contentPanel.add(txtSdescuento);
		
		txtTdescuento = new JTextField();
		txtTdescuento.setColumns(10);
		txtTdescuento.setBounds(135, 74, 86, 20);
		contentPanel.add(txtTdescuento);
		
		txtCdescuento = new JTextField();
		txtCdescuento.setColumns(10);
		txtCdescuento.setBounds(135, 104, 86, 20);
		contentPanel.add(txtCdescuento);
		
		lblPorcentaje1 = new JLabel("%");
		lblPorcentaje1.setBounds(231, 22, 46, 14);
		contentPanel.add(lblPorcentaje1);
		
		lblPorcentaje2 = new JLabel("%");
		lblPorcentaje2.setBounds(231, 51, 46, 14);
		contentPanel.add(lblPorcentaje2);
		
		lblPorcentaje3 = new JLabel("%");
		lblPorcentaje3.setBounds(231, 77, 46, 14);
		contentPanel.add(lblPorcentaje3);
		
		lblPorcentaje4 = new JLabel("%");
		lblPorcentaje4.setBounds(231, 107, 46, 14);
		contentPanel.add(lblPorcentaje4);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(335, 18, 89, 23);
		contentPanel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(335, 47, 89, 23);
		contentPanel.add(btnCancelar);
	}
	public void actionPerformed (ActionEvent e) {
		if (e.getSource()==btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
		if (e.getSource()==btnCancelar) {
		actionPerformedBtnCancelar(e);
		}
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
		
	}
}
