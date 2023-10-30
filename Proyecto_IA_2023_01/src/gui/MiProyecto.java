package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class MiProyecto extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivo;
	private JMenuItem mntmSalir;
	private JMenu mnMantenimiento;
	private JMenuItem mntmConsultarCeramico;
	private JMenuItem mntmModificarCeramico;
	private JMenuItem mntmListarCeramicos;
	private JMenu mnVentas;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarReportes;
	private JMenu mnConfigurar;
	private JMenuItem mntmConfigurarDescuentos;
	private JMenuItem mntmConfigurarObsequios;
	private JMenuItem mntmConfigurarcantidadoptima;
	private JMenuItem mntmConfigurarCuotaDiaria;
	
	// Datos m�nimos del primer producto
	public static String modelo0  = "Cinza Plus";
	public static double precio0  = 92.56;
	public static double ancho0   = 62.0;
	public static double largo0   = 62.0;
	public static double espesor0 = 8;
	public static int contenido0  = 6;
	// Datos m�nimos del segundo producto
	public static String modelo1  = "Luxury";
	public static double precio1  = 42.77;
	public static double ancho1   = 60;
	public static double largo1   = 60;
	public static double espesor1 = 8.5;
	public static int contenido1  = 4;
	// Datos m�nimos del tercer producto
	public static String modelo2  = "Austria";
	public static double precio2  = 52.45;
	public static double ancho2   = 45;
	public static double largo2   = 45;
	public static double espesor2 = 6.5;
	public static int contenido2  = 12;
	// Datos m�nimos del cuarto producto
	public static String modelo3  = "Yungay Mix";
	public static double precio3  = 55.89;
	public static double ancho3   = 80;
	public static double largo3   = 120;
	public static double espesor3 = 6.8;
	public static int contenido3  = 9;
	// Datos m�nimos del quinto producto
	public static String modelo4  = "Thal�a";
	public static double precio4  = 45;
	public static double ancho4   = 45;
	public static double largo4   = 11.8;
	public static double espesor4 = 7.2;
	public static int contenido4  = 10;
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	// Obsequio
	public static String tipoObsequio   = "Lapicero";
	public static int obsequioCantidad1 = 2;
	public static int obsequioCantidad2 = 3;
	public static int obsequioCantidad3 = 4;
	// Cantidad �ptima de unidades vendidas por d�a
	public static int cantidadOptima = 10;
	// Cuota diaria
	public static double cuotaDiaria = 30000;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiProyecto frame = new MiProyecto();
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
	public MiProyecto() {
		setTitle("Proyecto_IA_2023_01 =)  :v  :)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 459);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mnArchivo.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmConsultarCeramico = new JMenuItem("Consultar Cer\u00E1mico");
		mntmConsultarCeramico.addActionListener(this); //no te olvides de poner eso si no no pudes ABRIR GAAAAAAAAAAAAAAAA 
		mnMantenimiento.add(mntmConsultarCeramico);
		
		mntmModificarCeramico = new JMenuItem("Modificar Cer\u00E1mico");
		mntmModificarCeramico.addActionListener(this);
		mnMantenimiento.add(mntmModificarCeramico);
		
		mntmListarCeramicos = new JMenuItem("Listar Cer\u00E1micos");
		mntmListarCeramicos.addActionListener(this);
		mnMantenimiento.add(mntmListarCeramicos);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mntmVender.addActionListener(this);
		mnVentas.add(mntmVender);
		
		mntmGenerarReportes = new JMenuItem("Generar Reportes");
		mntmGenerarReportes.addActionListener(this);
		mnVentas.add(mntmGenerarReportes);
		
		mnConfigurar = new JMenu("Configuraci\u00F3n");
		menuBar.add(mnConfigurar);
		
		mntmConfigurarDescuentos = new JMenuItem("Configurar Descuentos");
		mntmConfigurarDescuentos.addActionListener(this);
		mnConfigurar.add(mntmConfigurarDescuentos);
		
		mntmConfigurarObsequios = new JMenuItem("Configurar Obsequios");
		mntmConfigurarObsequios.addActionListener(this);
		mnConfigurar.add(mntmConfigurarObsequios);
		
		mntmConfigurarcantidadoptima = new JMenuItem("Configurar Cantidad \u00D3ptima ");
		mntmConfigurarcantidadoptima.addActionListener(this);
		mnConfigurar.add(mntmConfigurarcantidadoptima);
		
		mntmConfigurarCuotaDiaria = new JMenuItem("Configurar Cuota Diaria");
		mntmConfigurarCuotaDiaria.addActionListener(this);
		mnConfigurar.add(mntmConfigurarCuotaDiaria);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==mntmSalir) {
			actionPerformedMntmSalir(arg0);
		}
		if(arg0.getSource()==mntmConsultarCeramico) {
			actionPerformedMntmConsultarCeramico(arg0);
		}
		if (arg0.getSource()==mntmModificarCeramico) {
			actionPerformedMntmModificarCeramico(arg0);
		}
		if (arg0.getSource()==mntmListarCeramicos) {
			actionPerformedMntmListarCeramicos(arg0);
		}
		if (arg0.getSource()==mntmVender) {
			actionPerformedMntmVender(arg0);
		}
		if (arg0.getSource()==mntmGenerarReportes) {
			actionPerformedMntmGenerarReportes(arg0);
		}
		if (arg0.getSource()==mntmConfigurarDescuentos) {
			actionPerformedMntmConfigurarDescuentos(arg0);
		}
		if (arg0.getSource()==mntmConfigurarObsequios) {
			actionPeformedMntmConfigurarObsequios(arg0);
		}
		if (arg0.getSource()==mntmConfigurarcantidadoptima) {
			actionPerformedMntmConfigurarcantidadoptima(arg0);
		}
		if (arg0.getSource()==mntmConfigurarCuotaDiaria) {
			actionPerformedMntmConfigurarCuotaDiaria(arg0);
		}
		
	}
	protected void actionPerformedMntmSalir(ActionEvent arg0) {
		
		int ok = confirmar("� Desea salir del Sistema ?", "Saliendo del Sistema");
		if (ok == 0)
			System.exit(0);	
	}

	protected void actionPerformedMntmConsultarCeramico(ActionEvent arg0) {
	    DlgConsultarCeramico dcc = new DlgConsultarCeramico();
	    dcc.setLocationRelativeTo(this);
	    dcc.setVisible(true);
	   
	}
	
	protected void actionPerformedMntmModificarCeramico(ActionEvent arg0) {
		DlgModificarCeramico dmc = new DlgModificarCeramico();
		dmc.setLocationRelativeTo(this);
		dmc.setVisible(true);
	}
	
	protected void actionPerformedMntmListarCeramicos(ActionEvent arg0) {		
		DlgListarCeramico dlc =new DlgListarCeramico();
		dlc.setLocationRelativeTo(this);
		dlc.setVisible(true);	
	}
	protected void actionPerformedMntmVender(ActionEvent arg0) {
		DlgVender dv = new DlgVender();
		dv.setLocationRelativeTo(this);
		dv.setVisible(true);		
	}
	protected void actionPerformedMntmGenerarReportes(ActionEvent arg0) {
		DlgGenerarReportes dgr = new DlgGenerarReportes();
		dgr.setLocationRelativeTo(this);
		dgr.setVisible(true);	
	}
	protected void actionPerformedMntmConfigurarDescuentos(ActionEvent arg0) {
		DlgConfigurarDescuentos dcd = new DlgConfigurarDescuentos();
		dcd.setLocationRelativeTo(this);
		dcd.setVisible(true);
	}
	protected void actionPeformedMntmConfigurarObsequios(ActionEvent arg0) {
		DlgConfigurarObsequios dco = new DlgConfigurarObsequios();
		dco.setLocationRelativeTo(this);
		dco.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarcantidadoptima(ActionEvent arg0) {
		DlgConfigurarCantidadOptima dcco = new DlgConfigurarCantidadOptima();
		dcco.setLocationRelativeTo(this);
		dcco.setVisible(true);
	}
	protected void actionPerformedMntmConfigurarCuotaDiaria(ActionEvent arg0) {
		DlgConfigurarCuotaDiaria dccd =new DlgConfigurarCuotaDiaria();
		dccd.setLocationRelativeTo(this);
		dccd.setVisible(true);
	}
	
	
	
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}

	int confirmar(String s1, String s2) {
		return JOptionPane.showConfirmDialog(this, s1, s2, 0, 2, null);
	}
}
