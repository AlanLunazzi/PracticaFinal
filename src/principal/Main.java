package principal;

import vista.VistaMenu;
import modelo.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Agencia agencia = new Agencia();
		Producto prod = new Excursion(1, "Paracaidismo", 30, 20);
		agencia.AgregarProducto(prod);
		
		VistaMenu vista = new VistaMenu(agencia);

	}

}
