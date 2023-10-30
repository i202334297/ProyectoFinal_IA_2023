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

public class DlgConfigurarObsequios extends JDialog implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtTipodeObsequio;
	private JTextField txtUnidades1;
	private JTextField txtUnidades2;
	private JTextField txtUnidades3;
	private JLabel lblTipodeobsequio;
	private JLabel lbl1a5unidades;
	private JLabel lbl6a10unidades;
	private JLabel lbl11amasunidades;
	private JButton btnAceptar;
	private JButton btnCancelar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgConfigurarObsequios dialog = new DlgConfigurarObsequios();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgConfigurarObsequios() {
		setTitle("Configurar | Configurar Obsequios");
		setBounds(100, 100, 450, 152);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
			lblTipodeobsequio = new JLabel("Tipo de obsequio");
			lblTipodeobsequio.setBounds(10, 11, 110, 14);
			contentPanel.add(lblTipodeobsequio);
	
			lbl1a5unidades = new JLabel("1 a 5 unidades");
			lbl1a5unidades.setBounds(10, 36, 110, 14);
			contentPanel.add(lbl1a5unidades);
		
			lbl6a10unidades = new JLabel("6 a 10 unidades");
			lbl6a10unidades.setBounds(10, 61, 110, 14);
			contentPanel.add(lbl6a10unidades);
	
			lbl11amasunidades = new JLabel("11 a m\u00E1s unidades");
			lbl11amasunidades.setBounds(10, 86, 110, 14);
			contentPanel.add(lbl11amasunidades);
			
			txtTipodeObsequio = new JTextField();
			txtTipodeObsequio.setBounds(146, 8, 86, 20);
			contentPanel.add(txtTipodeObsequio);
			txtTipodeObsequio.setColumns(10);
		
			txtUnidades1 = new JTextField();
			txtUnidades1.setColumns(10);
			txtUnidades1.setBounds(146, 33, 86, 20);
			contentPanel.add(txtUnidades1);
	
			txtUnidades2 = new JTextField();
			txtUnidades2.setColumns(10);
			txtUnidades2.setBounds(146, 58, 86, 20);
			contentPanel.add(txtUnidades2);
		
			txtUnidades3 = new JTextField();
			txtUnidades3.setColumns(10);
			txtUnidades3.setBounds(146, 83, 86, 20);
			contentPanel.add(txtUnidades3);
		
			btnAceptar = new JButton("Aceptar");
			btnAceptar.addActionListener(this);
			btnAceptar.setBounds(335, 7, 89, 23);
			contentPanel.add(btnAceptar);
	
			btnCancelar = new JButton("Cancelar");
			btnCancelar.addActionListener(this);
			btnCancelar.setBounds(335, 32, 89, 23);
			contentPanel.add(btnCancelar);
	}
		public void actionPerformed(ActionEvent e) {
			
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
			
			dispose ();
			
		}
}