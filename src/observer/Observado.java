package observer;

import java.util.ArrayList;
import java.util.List;

import modelo.Agencia;

public class Observado {


	List<IObservador> observadores = new ArrayList<IObservador>();
	
	public void agregarObservador(IObservador obs){
		System.out.println("Soy " + obs.toString() +"Registrandome");
		this.observadores.add(obs);
	}
	
	public void actualizarObservadores(Agencia agencia){
		for(IObservador i: this.observadores){
			i.Actualizar(agencia);
			System.out.println("Actualizado "+ i.toString());
		}
	}

}
