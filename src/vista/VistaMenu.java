package vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

import observer.IObservador;
import modelo.*;
import controlador.Controlador;

public class VistaMenu extends Vista implements IObservador{
	
	protected Agencia agenVista;

	private JMenuBar barra;
	private JMenu menu;
	private Producto prod;
	JComboBox productos;
	public VistaMenu(Agencia agencia){

		this.agenVista = agencia;
		this.agenVista.agregarObservador(this);
		
		productos = new JComboBox();
		configurarComponentes();		
		
		
	}

	

	public void configurarComponentes() {
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
						VistaA�adirProducto vistaExcu = new VistaA�adirProducto(agenVista,true);
						vistaExcu.setVisible(true);
					}
					
					
				}
				
				);
		a�adirPasajeAereo.addActionListener(
				new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						VistaA�adirProducto vistaPas = new VistaA�adirProducto(agenVista, false);
						vistaPas.setVisible(true);
						
					}
					
					
				});
		
		a�adirVenta.addActionListener(
				new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent arg0) {
						//VistaMenu.this.Actualizar(agenVista);
						Vista vistaA�a = new VistaA�adirVenta(agenVista);
					}
					
					
				});
		
		this.setJMenuBar(barra);
		this.configurarVentana();
		this.setTitle("Menu principal");
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		configurarCombo(this.agenVista);
		
		
		this.configurarVentana();

	}


	public void configurarCombo(Agencia agencia){
		
		List<Producto> listProductos = new ArrayList<Producto>();
		this.setLayout(null);
		listProductos = agencia.getProductos();

		productos.removeAllItems();
		for(Producto prod: listProductos){
			productos.addItem(prod.getDescripcion());
			System.out.println(prod.getDescripcion());
		}

		productos.setBounds(10,20,300,100);

		this.add(productos);
	}

	@Override
	public void Actualizar(Agencia agencia) {
		this.agenVista = agencia;
		System.out.println("Soy el menu actualizandome");
		this.configurarCombo(agencia);
		
	}



	@Override
	public void setupInicial() {
		// TODO Auto-generated method stub
		
	}




	

	
	
}
