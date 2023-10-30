package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel lblUsuario;
	private JTextField txtUsuario;
	private JButton btnIngresar;
	private JPasswordField jpassClave;
	private JLabel lblLogin;
	private JLabel lblUser;
	private JLabel lblContrasena;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 189);
		lblUsuario = new JPanel();
		lblUsuario.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(lblUsuario);
		lblUsuario.setLayout(null);
		
		lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(76, 11, 46, 14);
		lblUsuario.add(lblLogin);
		
		lblUser = new JLabel("USUARIO:");
		lblUser.setBounds(33, 66, 71, 14);
		lblUsuario.add(lblUser);
		
		lblContrasena = new JLabel("CONTRASE\u00D1A:");
		lblContrasena.setBounds(33, 91, 95, 14);
		lblUsuario.add(lblContrasena);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(125, 63, 105, 20);
		lblUsuario.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(this);
		btnIngresar.setBounds(322, 66, 89, 23);
		lblUsuario.add(btnIngresar);
		
		jpassClave = new JPasswordField();
		jpassClave.setBounds(125, 88, 105, 20);
		lblUsuario.add(jpassClave);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource()==btnIngresar) {
			actionPerformedBtnIngresar(arg0);
		}
	}
	protected void actionPerformedBtnIngresar(ActionEvent arg0) {
		char[] clave = jpassClave.getPassword();
		String claveFinal = new String(clave);
		
		if (txtUsuario.getText().equals("Admin") && claveFinal.equals("123")) {
			dispose();
			JOptionPane.showMessageDialog(null, "Bienvenido al sistema","INGRESASTE",
					JOptionPane.INFORMATION_MESSAGE);
			MiProyecto m = new MiProyecto();
			m.setVisible(true);
		
		}else {
			JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos","ERROR",
					JOptionPane.ERROR_MESSAGE);
			txtUsuario.setText("");
			jpassClave.setText("");
			txtUsuario.requestFocus();
			
		}
		
		
		
		
		
		
	}
}
