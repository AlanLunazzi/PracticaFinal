package vista;

import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import observer.IObservador;
import modelo.*;

public class VistaAñadirVenta extends Vista implements IObservador{

	JComboBox productos;

	protected Agencia agenVistaVenta;
	public VistaAñadirVenta(Agencia agen){
		this.agenVistaVenta = agen;
		this.agenVistaVenta.agregarObservador(this);
		productos =  new JComboBox();
		configuracionInicial();
	}

	public void configuracionInicial() {
		//this.Actualizar(agenVista);
		
		
		this.setLayout(null);
		
		configurarCombo(this.agenVistaVenta);
		
		
	}

	private void configurarCombo(Agencia agen) {
		// TODO Auto-generated method stub
		
		List<Producto> listProductos = new ArrayList<Producto>();
		listProductos = agen.getProductos();

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
		// TODO Auto-generated method stub
		this.agenVistaVenta = agencia;
		this.configurarCombo(agencia);
		
	}

	@Override
	public void setupInicial() {
		// TODO Auto-generated method stub
		
	}
	
	

}
