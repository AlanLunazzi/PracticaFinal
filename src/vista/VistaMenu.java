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
	private JMenuItem añadirExcursion;
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
		
		
		JMenuItem añadirExcursion = new JMenuItem("Añadir excursion");
		JMenuItem añadirPasajeAereo = new JMenuItem("Añadir pasaje aereo");
		JMenuItem añadirVenta = new JMenuItem("Añadir venta");
		
		menu.add(añadirExcursion);
		menu.add(añadirPasajeAereo);
		menu.add(añadirVenta);
		
		añadirExcursion.addActionListener(
				new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						VistaAñadirProducto vistaExcu = new VistaAñadirProducto(true);
						vistaExcu.setVisible(true);
					}
					
					
				}
				
				);
		añadirPasajeAereo.addActionListener(
				new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						VistaAñadirProducto vistaPas = new VistaAñadirProducto(false);
						vistaPas.setVisible(true);
						
					}
					
					
				});
		
		añadirVenta.addActionListener(
				new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						JFrame vistaAña = new VistaAñadirVenta();
						vistaAña.setVisible(true);
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
