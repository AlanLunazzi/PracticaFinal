package modelo;

import java.util.ArrayList;
import java.util.List;

import observer.Observado;

public class Agencia extends Observado{

	private List<Producto> productos;
	private List<Venta> ventas;
	
	public Agencia(){
		this.productos = new ArrayList<Producto>();
		this.ventas = new ArrayList<Venta>();
		this.actualizarObservadores(this);
	}
	
	public void AgregarVenta(Venta vent){
		ventas.add(vent);
		this.actualizarObservadores(this);
	}
	public void AgregarProducto(Producto prod){
		productos.add(prod);
		;
		System.out.println("Se agrego el producto con descripcion "+prod.descripcion +" Precio base $" +prod.precioBase +" y codigo "+prod.codigo);
		if(prod instanceof Excursion)
			System.out.println("Es una excursion");
		else if(prod instanceof PasajeAereo)
			System.out.println("Es un pasaje aereo");
		this.actualizarObservadores(this);
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
}
