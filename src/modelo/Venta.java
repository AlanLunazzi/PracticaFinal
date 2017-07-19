package modelo;

import java.util.ArrayList;
import java.util.List;

public class Venta {

	private int numeroVenta;
	private List<itemVenta> items;
	public Venta(int numeroVenta) {
		super();
		this.numeroVenta = numeroVenta;
		this.items = new ArrayList<itemVenta>();
	}
	
	public void agregarItem(itemVenta item){
		this.items.add(item);
	}
	
	public int calcularTotal(){
		int total = 0;
		for(itemVenta it: this.items){
			total+= it.calcularSubtotal();
		}
		return total;
	}
	
	
	
}
