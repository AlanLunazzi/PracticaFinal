package modelo;

public class PasajeAereo extends Producto{

	public PasajeAereo(int cod, String descp, int pb, int tasaEmbarque) {
		super();
		this.codigo = cod;
		this.descripcion = descp;
		this.precioBase =  pb;
		this.TasaEmbarque = tasaEmbarque;
		// TODO Auto-generated constructor stub
	}


	protected int TasaEmbarque;

	
	public int calcularPrecioVenta() {
		// TODO Auto-generated method stub
		return this.getPrecioBase() + this.TasaEmbarque;
	}
	
	
	
}
