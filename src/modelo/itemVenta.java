package modelo;

public class itemVenta {

	public itemVenta(int cantidad, Producto producto) {
		super();
		this.cantidad = cantidad;
		this.producto = producto;
	}

	private int cantidad;
	private Producto producto;
	
	public int calcularSubtotal(){
		return this.cantidad * this.producto.calcularPrecioVenta();
	}
}
