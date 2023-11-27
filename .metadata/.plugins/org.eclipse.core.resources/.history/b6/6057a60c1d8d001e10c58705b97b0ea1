package gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;

public class DlgGenerarReportes extends JDialog implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JLabel lblTipodeReporte;
	private JComboBox <String> cboTipoReporte;
	private JButton btnCerrar;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgGenerarReportes dialog = new DlgGenerarReportes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgGenerarReportes() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(DlgGenerarReportes.class.getResource("/imagen/DlgReportes.png")));
		setTitle("Ventas | Generar Reportes");
		setBounds(100, 100, 685, 335);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblTipodeReporte = new JLabel("Tipo de Reporte");
		lblTipodeReporte.setBounds(10, 21, 107, 14);
		contentPanel.add(lblTipodeReporte);
		
		cboTipoReporte = new JComboBox<String>();
		cboTipoReporte.addActionListener(this);
		cboTipoReporte.setModel(new DefaultComboBoxModel <String> 
							   (new String[] {"Ventas por modelo", 
									   "Comparaci\u00F3n de precios con el precio promedio", 
									   "Comparaci\u00F3n de cajas vendidas con la cantidad \u00F3ptima", 
									   "Estad\u00EDstica sobre el precio"}));
		cboTipoReporte.setBounds(143, 17, 343, 22);
		contentPanel.add(cboTipoReporte);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(570, 17, 89, 23);
		contentPanel.add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 48, 649, 237);
		contentPanel.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		ventasPorModelo();
	}
	public void actionPerformed (ActionEvent e) {
		if (e.getSource()==cboTipoReporte)
			actionPerformedCboTipoReporte(e);
		if (e.getSource()==btnCerrar){
			actionPerformedBtnCerrar(e);
		}
	}
	protected void actionPerformedCboTipoReporte(ActionEvent e) {
		txtS.setText("");
		switch (cboTipoReporte.getSelectedIndex()) {
			case 0:
				ventasPorModelo();
				break;
			case 1:
				comparacionDePrecios();
				break;
			case 2:
				comparacionCajasVendidas();
				break;
			case 3:
				estadisticasPrecio();
		}
	}
	protected void actionPerformedBtnCerrar(ActionEvent e) {
		dispose();
	}
	void ventasPorModelo() {
		
		imprimir("");
		imprimir("VENTAS POR MODELO");
		imprimir("");
		imprimir("Modelo                     : " + MiProyecto.modelo0);
		imprimir("Cantidad de ventas         : " + DlgVender.cantidadVentasM0);
		imprimir("Cantidad de cajas vendidas : " + DlgVender.cajasVendidasM0);
		imprimir("Importe total vendido      : " + "S/." +DF(DlgVender.impPAcumuladoM0));
		imprimir("Aporte a la cuota diaria   : " + DF((DlgVender.impPAcumuladoM0/MiProyecto.cuotaDiaria)*100)+ "%");
		imprimir("");
		imprimir("Modelo                     : " + MiProyecto.modelo1);
		imprimir("Cantidad de ventas         : " + DlgVender.cantidadVentasM1);
		imprimir("Cantidad de cajas vendidas : " + DlgVender.cajasVendidasM1);
		imprimir("Importe total vendido      : " + "S/." +DF(DlgVender.impPAcumuladoM1));
		imprimir("Aporte a la cuota diaria   : " + DF((DlgVender.impPAcumuladoM1/MiProyecto.cuotaDiaria)*100)+ "%");
		imprimir("");
		imprimir("Modelo                     : " + MiProyecto.modelo2);
		imprimir("Cantidad de ventas         : " + DlgVender.cantidadVentasM2);
		imprimir("Cantidad de cajas vendidas : " + DlgVender.cajasVendidasM2);
		imprimir("Importe total vendido      : " + "S/." +DF(DlgVender.impPAcumuladoM2));
		imprimir("Aporte a la cuota diaria   : " + DF((DlgVender.impPAcumuladoM2/MiProyecto.cuotaDiaria)*100)+ "%");
		imprimir("");
		imprimir("Modelo                     : " + MiProyecto.modelo3);
		imprimir("Cantidad de ventas         : " + DlgVender.cantidadVentasM3);
		imprimir("Cantidad de cajas vendidas : " + DlgVender.cajasVendidasM3);
		imprimir("Importe total vendido      : " + "S/." +DF(DlgVender.impPAcumuladoM3));
		imprimir("Aporte a la cuota diaria   : " + DF((DlgVender.impPAcumuladoM3/MiProyecto.cuotaDiaria)*100)+ "%");
		imprimir("");
		imprimir("Modelo                     : " + MiProyecto.modelo4);
		imprimir("Cantidad de ventas         : " + DlgVender.cantidadVentasM4);
		imprimir("Cantidad de cajas vendidas : " + DlgVender.cajasVendidasM4);
		imprimir("Importe total vendido      : " + "S/." +DF(DlgVender.impPAcumuladoM4));
		imprimir("Aporte a la cuota diaria   : " + DF((DlgVender.impPAcumuladoM4/MiProyecto.cuotaDiaria)*100)+ "%");	
	
	}
	void comparacionDePrecios() {
		
		double  PrecioPromedio = 0;
		double  TotalVenta = 0;
		double  PrecCom0=0;
		double  PrecCom1=0;
		double  PrecCom2=0;
		double  PrecCom3=0;
		double  PrecCom4=0;
		
		for(int i=1;i<=DlgVender.numeroVentas;i++) 
		{
			if(i==1) {
				TotalVenta += MiProyecto.precio0;
			}
			else if(i==2) {
				TotalVenta += MiProyecto.precio1;
			}
			else if(i==3) {
				TotalVenta += MiProyecto.precio2;
			}
			else if(i==4) {
				TotalVenta += MiProyecto.precio3;
			}
			else if(i==5) {
				TotalVenta += MiProyecto.precio4;
			}
		}
		
		PrecioPromedio = TotalVenta / DlgVender.numeroVentas;
		
		PrecCom0 = (MiProyecto.precio0 - PrecioPromedio);
		PrecCom1 = (MiProyecto.precio1 - PrecioPromedio);
		PrecCom2 = (MiProyecto.precio2 - PrecioPromedio);
		PrecCom3 = (MiProyecto.precio3 - PrecioPromedio);
		PrecCom4 = (MiProyecto.precio4 - PrecioPromedio);			
		
		imprimir("Total Ventas "+DlgVender.numeroVentas);
		
		imprimir("");
		imprimir("COMPARACION DE PRECIOS CON EL PRECIO PROMEDIO");
		imprimir("");
		
		for(int i=0;i<DlgVender.numeroVentas;i++) 
		{
			if(i==0) {
				imprimir("Modelo           : " + MiProyecto.modelo0);
				imprimir("Precio           : " + MiProyecto.precio0);
				imprimir("Precio Promedio  : " + DF(PrecioPromedio));
				imprimir("Comparacion      : " + ((MiProyecto.precio0 > PrecioPromedio) ? DF(PrecCom0) + " mas que el promedio" 
												: ((PrecCom0 > 0) ? DF(PrecCom0) : DF(PrecCom0 * -1) ) + " menos que el promedio")) ;	
				imprimir("");
			}
			else if(i == 1) {
				imprimir("Modelo           : " + MiProyecto.modelo1);
				imprimir("Precio           : " + MiProyecto.precio1);
				imprimir("Precio Promedio  : " + DF(PrecioPromedio));
				imprimir("Comparacion      : "  + ((MiProyecto.precio1 > PrecioPromedio) ? DF(PrecCom1) + " mas que el promedio" 
												: ((PrecCom1 > 0) ? DF(PrecCom1) : DF(PrecCom1 * -1)) + " menos que el promedio")) ;		
				imprimir("");
			}
			else if(i == 2) {
				imprimir("Modelo           : " + MiProyecto.modelo2);
				imprimir("Precio           : " + MiProyecto.precio2);
				imprimir("Precio Promedio  : " + DF(PrecioPromedio));
				imprimir("Comparacion      : "  + ((MiProyecto.precio2 > PrecioPromedio) ? DF(PrecCom2) + " mas que el promedio" 
												: ((PrecCom2 > 0) ? DF(PrecCom2) : DF(PrecCom2 * -1)) + " menos que el promedio")) ;		
				imprimir("");
			}
			else if(i == 3) {
				imprimir("Modelo           : " + MiProyecto.modelo3);
				imprimir("Precio           : " + MiProyecto.precio3);
				imprimir("Precio Promedio  : " + DF(PrecioPromedio));
				imprimir("Comparacion      : "  + ((MiProyecto.precio3 > PrecioPromedio) ? DF(PrecCom3) + " mas que el promedio" 
												: ((PrecCom3 > 0) ? DF(PrecCom3) : DF(PrecCom3 * -1)) + " menos que el promedio")) ;		
				imprimir("");
			}
			else if(i == 4) {
				imprimir("Modelo           : " + MiProyecto.modelo4);
				imprimir("Precio           : " + MiProyecto.precio4);
				imprimir("Precio Promedio  : " + DF(PrecioPromedio));
				imprimir("Comparacion      : "  + ((MiProyecto.precio4 > PrecioPromedio) ? DF(PrecCom4) + " mas que el promedio" 
												: ((PrecCom4 > 0) ? DF(PrecCom4) : DF(PrecCom4 * -1)) + " menos que el promedio")) ;		
				imprimir("");
			}
		}				
	}
	void comparacionCajasVendidas() {
		imprimir("COMPARACIÓN DE CAJAS VENDIDAS CON LA CANTIDAD ÓPTIMA");
		imprimir("");
		imprimir("Modelo                     : " + MiProyecto.modelo0);
		imprimir("Cantidad de cajas vendidas : " + DlgVender.cajasVendidasM0);
		imprimir("Cantidad óptima            : " + MiProyecto.cantidadOptima);
		
		if (DlgVender.cajasVendidasM0 > MiProyecto.cantidadOptima) {
		    int diferencia = DlgVender.cajasVendidasM0 - MiProyecto.cantidadOptima;
		    imprimir("Cantidad óptima            : " + diferencia + " más que la cantidad óptima");
		} else if (DlgVender.cajasVendidasM0 < MiProyecto.cantidadOptima) {
		    int diferencia = MiProyecto.cantidadOptima - DlgVender.cajasVendidasM0;
		    imprimir("Cantidad óptima            : " + diferencia + " menos que la cantidad óptima");
		} else {
			imprimir("Cantidad óptima            : igual que la cantidad óptima");
			}
		
		imprimir("");
		imprimir("Modelo                     : " + MiProyecto.modelo1);
		imprimir("Cantidad de cajas vendidas : " + DlgVender.cajasVendidasM1);
		imprimir("Cantidad óptima            : " + MiProyecto.cantidadOptima);
		
		if (DlgVender.cajasVendidasM1 > MiProyecto.cantidadOptima) {
		    int diferencia = DlgVender.cajasVendidasM1 - MiProyecto.cantidadOptima;
		    imprimir("Cantidad óptima            : " + diferencia + " más que la cantidad óptima");
		} else if (DlgVender.cajasVendidasM1 < MiProyecto.cantidadOptima) {
		    int diferencia = MiProyecto.cantidadOptima - DlgVender.cajasVendidasM1;
		    imprimir("Cantidad óptima            : " + diferencia + " menos que la cantidad óptima");
		} else {
			imprimir("Cantidad óptima            : igual que la cantidad óptima");
			}
		
		imprimir("");
		imprimir("Modelo                     : " + MiProyecto.modelo2);
		imprimir("Cantidad de cajas vendidas : " + DlgVender.cajasVendidasM2);
		imprimir("Cantidad óptima            : " + MiProyecto.cantidadOptima);
		
		if (DlgVender.cajasVendidasM2 > MiProyecto.cantidadOptima) {
		    int diferencia = DlgVender.cajasVendidasM2 - MiProyecto.cantidadOptima;
		    imprimir("Cantidad óptima            : " + diferencia + " más que la cantidad óptima");
		} else if (DlgVender.cajasVendidasM2 < MiProyecto.cantidadOptima) {
		    int diferencia = MiProyecto.cantidadOptima - DlgVender.cajasVendidasM2;
		    imprimir("Cantidad óptima            : " + diferencia + " menos que la cantidad óptima");
		} else {
			imprimir("Cantidad óptima            : igual que la cantidad óptima");
			}
		
		imprimir("");
		imprimir("Modelo                     : " + MiProyecto.modelo3);
		imprimir("Cantidad de cajas vendidas : " + DlgVender.cajasVendidasM3);
		imprimir("Cantidad óptima            : " + MiProyecto.cantidadOptima);
		
		if (DlgVender.cajasVendidasM3 > MiProyecto.cantidadOptima) {
		    int diferencia = DlgVender.cajasVendidasM3 - MiProyecto.cantidadOptima;
		    imprimir("Cantidad óptima            : " + diferencia + " más que la cantidad óptima");
		} else if (DlgVender.cajasVendidasM3 < MiProyecto.cantidadOptima) {
		    int diferencia = MiProyecto.cantidadOptima - DlgVender.cajasVendidasM3;
		    imprimir("Cantidad óptima            : " + diferencia + " menos que la cantidad óptima");
		} else {
			imprimir("Cantidad óptima            : igual que la cantidad óptima");
			}
		
		imprimir("");
		imprimir("Modelo                     : " + MiProyecto.modelo4);
		imprimir("Cantidad de cajas vendidas : " + DlgVender.cajasVendidasM4);
		imprimir("Cantidad óptima            : " + MiProyecto.cantidadOptima);
		
		if (DlgVender.cajasVendidasM4 > MiProyecto.cantidadOptima) {
		    int diferencia = DlgVender.cajasVendidasM4 - MiProyecto.cantidadOptima;
		    imprimir("Cantidad óptima            : " + diferencia + " más que la cantidad óptima");
		} else if (DlgVender.cajasVendidasM4 < MiProyecto.cantidadOptima) {
		    int diferencia = MiProyecto.cantidadOptima - DlgVender.cajasVendidasM4;
		    imprimir("Cantidad óptima            : " + diferencia + " menos que la cantidad óptima");
		} else {
			imprimir("Cantidad óptima            : igual que la cantidad óptima");
			}		
	}
	void estadisticasPrecio() {
		
		double  PrecioPromedio = 0;
		double  TotalVenta = 0;
		double  PrecioMayor = 0;
		double  PrecioMenor= 0;
		double  Precio = 0;
		
		for(int i=1;i<=DlgVender.numeroVentas;i++) 
		{
			if(i==1) {
				TotalVenta = TotalVenta + MiProyecto.precio0;
				Precio = MiProyecto.precio0;
				PrecioMenor = Precio;
			}
			else if(i==2) {
				TotalVenta += MiProyecto.precio1;
				Precio = MiProyecto.precio1;
			}
			else if(i==3) {
				TotalVenta += MiProyecto.precio2;
				Precio = MiProyecto.precio2;
			}
			else if(i==4) {
				TotalVenta += MiProyecto.precio3;
				Precio = MiProyecto.precio3;
			}
			else if(i==5) {
				TotalVenta += MiProyecto.precio4;
				Precio = MiProyecto.precio4;
			}
				

			if(Precio >= PrecioMayor) {
				PrecioMayor = Precio;				
			}
			
			if(i > 1 && Precio < PrecioMenor) {
				PrecioMenor = Precio;
			}					
		}
		
		PrecioPromedio = TotalVenta / DlgVender.numeroVentas;
		imprimir("");
		imprimir("ESTADÍSTICA SOBRE EL PRECIO");
		imprimir("Precio Promedio    : " + DF(PrecioPromedio));
		imprimir("Precio mayor       : " + DF(PrecioMayor));
		imprimir("Precio menor       : " + DF(PrecioMenor));
	}
	
	public void imprimir (String s) {
		txtS.append(s +"\n");
	}
	String DF(double p) {
		return String.format("%.2f",p).replace(",",".");
	}

 
}
