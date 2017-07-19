package vista;

import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import modelo.*;

public class VistaAñadirVenta extends Vista {

	
	public VistaAñadirVenta(){
		this.agenVista.agregarObservador(this);
	}

	public void inicializarComponentes() {

		List<Producto> listProductos = new ArrayList<Producto>();
		this.setLayout(null);
		JComboBox productos = new JComboBox();
		listProductos = this.agenVista.getProductos();
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
		this.agenVista = agencia;
		
	}
	
	

}
