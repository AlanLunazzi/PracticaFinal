package vista;

import javax.swing.*;

import observer.IObservador;
import modelo.*;

public abstract class Vista extends JFrame implements IObservador{

	protected Agencia agenVista;
	public Vista(){
		agenVista = new Agencia();
		inicializarComponentes();
		configurarVentana();	
		agenVista.agregarObservador(this);
	}
	public abstract void inicializarComponentes();
	public void configurarVentana() {
		this.setSize(500, 500);
		this.setLocation(300, 150);
		this.setResizable(false);
		this.setVisible(true);
		//this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}

	
	
}
