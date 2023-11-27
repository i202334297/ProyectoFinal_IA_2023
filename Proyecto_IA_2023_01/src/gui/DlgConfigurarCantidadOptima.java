package gui;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class DlgConfigurarCantidadOptima extends JDialog implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtCantidad;
	private JLabel lblCantidad;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgConfigurarCantidadOptima dialog = new DlgConfigurarCantidadOptima();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

			/**
	 * Create the dialog.
	 */
	public DlgConfigurarCantidadOptima() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgConfigurarCantidadOptima.class.getResource("/imagen/DlgCantidad.png")));
		setTitle("Configurar | Configurar Cantidad \u00D3ptima");
		setBounds(100, 100, 450, 132);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblCantidad = new JLabel("Cantidad \u00F3ptima de cer\u00E1micos vendidos");
		lblCantidad.setBounds(10, 15, 232, 28);
		contentPanel.add(lblCantidad);
		
		
		txtCantidad = new JTextField(MiProyecto.cantidadOptima + "");
		txtCantidad.setBounds(243, 19, 56, 20);
		contentPanel.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(335, 18, 89, 23);
		contentPanel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(335, 52, 89, 23);
		contentPanel.add(btnCancelar);
		
		txtCantidad.addKeyListener(new NumericKeyListener());
	}
	private class NumericKeyListener implements KeyListener {
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();
            if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
                e.consume();
            }
        }
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                // Llama al método que realiza el cálculo cuando se presiona Enter
            	actionPerformedBtnAceptar(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null));
            } 
        }
        public void keyReleased(KeyEvent e) {
        	validarCampos();
        }
    	public void validarCampos() {

    		JTextField elementos[] = { txtCantidad };
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
		int cantObtima = leerEntero(txtCantidad); 
		
		MiProyecto.cantidadOptima = cantObtima;	
		mensaje("Cantidad optima guardada con Éxito", "Guardar Cantidad Optima", 1);
		dispose();
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
		dispose();
	}
	void mensaje(String s1, String s2, int i) {
		JOptionPane.showMessageDialog(this, s1, s2, i);
	}
	int leerEntero(JTextField txt) {
		return Integer.parseInt(txt.getText());
	}
}

