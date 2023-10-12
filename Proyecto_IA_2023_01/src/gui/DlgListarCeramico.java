package gui;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgListarCeramico extends JDialog implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnCerrar;
	private JButton btnListar;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgListarCeramico dialog = new DlgListarCeramico();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Create the dialog.
	 */
	public DlgListarCeramico() {
		setTitle("Mantenimiento | Listar Cer\u00E1micos");
		setBounds(100, 100, 512, 371);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 476, 266);
		contentPanel.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setEditable(false);
		scrollPane.setViewportView(txtS);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(154, 298, 89, 23);
		contentPanel.add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(253, 298, 89, 23);
		contentPanel.add(btnListar);
		
	}
	public void actionPerformed (ActionEvent e) {
		if (e.getSource()==btnCerrar) {
			actionPerformedBtnCerrar(e);
		}
		if (e.getSource()==btnListar) {
			actionPerformedBtnListar(e);
		}
	}
	protected void actionPerformedBtnListar(ActionEvent e) {
		txtS.setText("");
		listar();
		
	}
	
	
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	
	void listar() {
		imprimir("LISTADO DE CERÁMICOS");
		imprimir("");
		imprimir("Marca           :  " + MiProyecto.modelo0);
		imprimir("Precio    (S/)  :  " + formatear(MiProyecto.precio0));
		imprimir("Ancho     (cm)  :  " + formatear(MiProyecto.ancho0));
		imprimir("Largo     (cm)  :  " + formatear(MiProyecto.largo0));
		imprimir("Espesor   (mm)  :  " + formatear(MiProyecto.espesor0));
		imprimir("Contenido (cm)  :  " + formatear(MiProyecto.contenido0) + " Unidades");
		imprimir("");
		imprimir("Marca           :  " + MiProyecto.modelo1);
		imprimir("Precio    (S/)  :  " + formatear(MiProyecto.precio1));
		imprimir("Ancho     (cm)  :  " + formatear(MiProyecto.ancho1));
		imprimir("Largo     (cm)  :  " + formatear(MiProyecto.largo1));
		imprimir("Espesor   (mm)  :  " + formatear(MiProyecto.espesor1));
		imprimir("Contenido (cm)  :  " + formatear(MiProyecto.contenido1) + " Unidades");
		imprimir("");
		imprimir("Marca           :  " + MiProyecto.modelo2);
		imprimir("Precio    (S/)  :  " + formatear(MiProyecto.precio2));
		imprimir("Ancho     (cm)  :  " + formatear(MiProyecto.ancho2));
		imprimir("Largo     (cm)  :  " + formatear(MiProyecto.largo2));
		imprimir("Espesor   (mm)  :  " + formatear(MiProyecto.espesor2));
		imprimir("Contenido (cm)  :  " + formatear(MiProyecto.contenido2) + " Unidades");
		imprimir("");
		imprimir("Marca           :  " + MiProyecto.modelo3);
		imprimir("Precio    (S/)  :  " + formatear(MiProyecto.precio3));
		imprimir("Ancho     (cm)  :  " + formatear(MiProyecto.ancho3));
		imprimir("Largo     (cm)  :  " + formatear(MiProyecto.largo3));
		imprimir("Espesor   (mm)  :  " + formatear(MiProyecto.espesor3));
		imprimir("Contenido (cm)  :  " + formatear(MiProyecto.contenido3) + " Unidades");
		imprimir("");
		imprimir("Marca           :  " + MiProyecto.modelo4);
		imprimir("Precio    (S/)  :  " + formatear(MiProyecto.precio4));
		imprimir("Ancho     (cm)  :  " + formatear(MiProyecto.ancho4));
		imprimir("Largo     (cm)  :  " + formatear(MiProyecto.largo4));
		imprimir("Espesor   (mm)  :  " + formatear(MiProyecto.espesor4));
		imprimir("Contenido (cm)  :  " + formatear(MiProyecto.contenido4) + " Unidades");
	}
	//  Métodos tipo void (con parámetros)	
	void imprimir(String s) {
		txtS.append(s + " \n ");
	}
	//  Métodos que retornan valor (con parámetros)
	String formatear(double numero) {
		String cadena = "" + Math.round(numero*100), num = "";
		int longitud = cadena.length();
		for (int i=0; i<longitud; i++) {
			num += cadena.charAt(i);
			if (i == longitud-6)
				num += ",";
			if (i == longitud-3)
				num += ".";
		}
		return String.format("%10s", num);
	}	
}
	

