package gui;


import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DlgConfigurarCuotaDiaria extends JDialog implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCuota;
	private JLabel lblCuota;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgConfigurarCuotaDiaria dialog = new DlgConfigurarCuotaDiaria();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgConfigurarCuotaDiaria() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgConfigurarCuotaDiaria.class.getResource("/imagen/DlgCuota.png")));
		setTitle("Configurar | Configurar Cuota Diaria ");
		setBounds(100, 100, 450, 114);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblCuota = new JLabel("Cuota diaria esperada (S/.)");
		lblCuota.setBounds(10, 11, 169, 19);
		contentPanel.add(lblCuota);
		
		txtCuota = new JTextField(MiProyecto.cuotaDiaria + "");
		txtCuota.setBounds(189, 10, 86, 20);
		contentPanel.add(txtCuota);
		txtCuota.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(335, 9, 89, 23);
		contentPanel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(335, 43, 89, 23);
		contentPanel.add(btnCancelar);
		
		txtCuota.addKeyListener(new NumericKeyListener());
	}
	
    private class NumericKeyListener implements KeyListener {
    	public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                // Llama al método que realiza el cálculo cuando se presiona Enter
            	actionPerformedBtnAceptar(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));
            } 		
    	}
    	
    	
    	public void keyReleased(KeyEvent e) {
    		validarCampos();
    	}
    	
    	public void keyTyped(KeyEvent e) {
    		
    		Character c = e.getKeyChar();
    		JTextField textField = (JTextField) e.getSource();

    		if (!Character.isDigit(c) && !c.equals('.')) {e.consume();}
    		else if (c == '.' && textField.getText().contains(".")) {e.consume();}
    		
    		
    	}
    	public void validarCampos() {

    		JTextField elementos[] = { txtCuota };
    		String valor;
    		for (int i = 0; i < elementos.length; i++) {
    			valor = elementos[i].getText().trim();
    			if (valor.length() == 0) {
    				btnAceptar.setEnabled(false);
    				return;
    			}
    		}
    		btnAceptar.setEnabled(true);
    	}
    }
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
		if(e.getSource()==btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) {
			double cuota = leerReal(txtCuota);
			MiProyecto.cuotaDiaria = cuota;
			
			mensaje("Cuota guardada con Éxito", "Guardar Cuota", 1);
			dispose();
	}
	double leerReal(JTextField txt) {
		return Double.parseDouble(txt.getText());
	}
	void mensaje(String s1, String s2, int i) {
		JOptionPane.showMessageDialog(this, s1, s2, i);
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}

}
