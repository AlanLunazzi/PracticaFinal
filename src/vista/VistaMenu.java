package vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

import observer.IObservador;
import modelo.*;
import controlador.Controlador;

public class VistaMenu extends Vista{

	private JMenuBar barra;
	private JMenu menu;
	private JMenuItem a�adirExcursion;
	private Producto prod;
	JComboBox tipo = new JComboBox();
	
	public VistaMenu(){
		super();
		inicializarComponentes();		
		this.agenVista.agregarObservador(this);
		if(this.agenVista.getProductos().size() == 0){
			prod = new Excursion(1, "Paracaidismo", 30, 20);
			this.agenVista.AgregarProducto(prod);
		}
		
	}

	

	public void inicializarComponentes() {
		// TODO Auto-generated method stub
		JMenuBar barra = new JMenuBar();
		JMenu menu = new JMenu("Menu");
		barra.add(menu);
		
		
		JMenuItem a�adirExcursion = new JMenuItem("A�adir excursion");
		JMenuItem a�adirPasajeAereo = new JMenuItem("A�adir pasaje aereo");
		JMenuItem a�adirVenta = new JMenuItem("A�adir venta");
		
		menu.add(a�adirExcursion);
		menu.add(a�adirPasajeAereo);
		menu.add(a�adirVenta);
		
		a�adirExcursion.addActionListener(
				new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						VistaA�adirProducto vistaExcu = new VistaA�adirProducto(true);
						vistaExcu.setVisible(true);
					}
					
					
				}
				
				);
		a�adirPasajeAereo.addActionListener(
				new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						VistaA�adirProducto vistaPas = new VistaA�adirProducto(false);
						vistaPas.setVisible(true);
						
					}
					
					
				});
		
		a�adirVenta.addActionListener(
				new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						JFrame vistaA�a = new VistaA�adirVenta();
						vistaA�a.setVisible(true);
					}
					
					
				});
		
		this.setJMenuBar(barra);
		this.configurarVentana();
		this.setTitle("Menu principal");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		

	}



	@Override
	public void Actualizar(Agencia agencia) {
		this.agenVista = agencia;
		System.out.println("Soy el menu actualizandome");
		
	}




	

	
	
}
