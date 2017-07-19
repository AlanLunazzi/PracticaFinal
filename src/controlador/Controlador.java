package controlador;

import modelo.*;
import observer.Observado;

public class Controlador extends Observado{
	private Agencia farm;
	
	
	public Controlador(){
		farm = new Agencia();
	}
	

}
