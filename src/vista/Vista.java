package vista;

import javax.swing.*;

import observer.IObservador;
import modelo.*;

public abstract class Vista extends JFrame{

	
	public Vista(){
		setupInicial();
		configurarVentana();	
	}
	public abstract void setupInicial();
	public void configurarVentana() {
		this.setSize(500, 500);
		this.setLocation(300, 150);
		this.setResizable(false);
		this.setVisible(true);
		//this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}

	
	
}
