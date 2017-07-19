package modelo;

public class Excursion extends Producto{

	public Excursion(int cod, String descp, int pb, int porcentaje) {
		super();
		this.codigo = cod;
		this.descripcion = descp;
		this.precioBase =  pb;
		this.porcentaje = porcentaje;
		// TODO Auto-generated constructor stub
	}

	private int porcentaje;

	@Override
	public int calcularPrecioVenta() {
		// TODO Auto-generated method stub
		return this.getPrecioBase() * (this.porcentaje + 100) / 100;
	}
}
