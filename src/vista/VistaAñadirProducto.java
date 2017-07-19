package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import observer.IObservador;
import modelo.*;

public class VistaAñadirProducto extends Vista implements IObservador {


	public Agencia agenVistaProducto;
	final protected boolean esExcursion;
	public VistaAñadirProducto(Agencia agenVista, boolean excu) {
		this.esExcursion = excu;
		this.setearVentana();
		this.agenVistaProducto = agenVista;
		this.agenVistaProducto.agregarObservador(this);
	}
	public void setearVentana() {
		this.setLayout(null);
		
		JTextField label = new JTextField();

		if(esExcursion == true){
			label.setText("Añadir excursion");
			label.setBounds(150,10,200,30);
			label.setEditable(false);
					}
		else if(esExcursion == false){
			label.setText("Añadir pasaje aereo");
			label.setBounds(150,10,200,30);
			label.setEditable(false);
		}
		


		JButton boton = new JButton();
		JTextField codigo = new JTextField();
		JTextField precioBase = new JTextField();
		JTextField descripcion = new JTextField();
		JTextField campoEspecial = new JTextField();
		
		codigo.setText("Ingrese el codigo");
		codigo.setEditable(false);
		codigo.setBounds(10,40,100,30);
		JTextField codigoIngreso = new JTextField();
		codigoIngreso.setBounds(210,40,100,30);
		
		precioBase.setText("Ingrese el precio base");
		precioBase.setBounds(10,90,200,30);
		precioBase.setEditable(false);
		JTextField precioBaseIngreso = new JTextField();
		precioBaseIngreso.setBounds(210,90,100,30);
		
		descripcion.setText("Ingrese una descripcion");
		descripcion.setBounds(10,140,200,30);
		descripcion.setEditable(false);
		JTextField descripcionIngreso = new JTextField();
		descripcionIngreso.setBounds(210,140,100,30);

		if(esExcursion == true){
			campoEspecial.setText("Ingrese porcentaje");
			campoEspecial.setBounds(10,190,200,30);
			campoEspecial.setEditable(false);
		}
		else if(esExcursion == false){
			campoEspecial.setText("Ingrese taza");
			campoEspecial.setBounds(10,190,200,30);
			campoEspecial.setEditable(false);
		}
		
		JTextField campoEspecialIngreso = new JTextField();
		campoEspecialIngreso.setBounds(210,190,100,30);
		
		
		boton.setText("Agregar Producto");
		boton.setBounds(140, 250, 300, 100);
		boton.addActionListener(
				new ActionListener(){

					@Override
					public void actionPerformed(ActionEvent e) {
						int valCodigo = Integer.parseInt(codigoIngreso.getText());
						int valPreBase = Integer.parseInt(precioBaseIngreso.getText());
						String valDescripcion = descripcionIngreso.getText();
						int valcampoEsp = Integer.parseInt(campoEspecialIngreso.getText());
						Producto prod;
						if(esExcursion == true){
							prod = new Excursion(valCodigo, valDescripcion, valPreBase, valcampoEsp);
						}
						else{
							prod = new PasajeAereo(valCodigo, valDescripcion, valPreBase, valcampoEsp);
						}
						
						agenVistaProducto.AgregarProducto(prod);
						agenVistaProducto.actualizarObservadores(agenVistaProducto);
						
						
						
						boton.setEnabled(false);
						VistaAñadirProducto.this.dispose();
					}
					
				}
				);
		
		
		
		this.add(label);
		label.setBorder(null);
		this.add(codigo);
		codigo.setBorder(null);
		this.add(codigoIngreso);
		codigoIngreso.setBorder(null);
		this.add(precioBase);
		precioBase.setBorder(null);
		this.add(precioBaseIngreso);
		precioBaseIngreso.setBorder(null);
		this.add(descripcion);
		descripcion.setBorder(null);
		this.add(descripcionIngreso);
		descripcionIngreso.setBorder(null);
		this.add(campoEspecial);
		campoEspecial.setBorder(null);
		this.add(campoEspecialIngreso);
		campoEspecialIngreso.setBorder(null);
		
		this.add(boton);
		this.setTitle("Añadir producto");
		
		
	}

	@Override
	public void setupInicial() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Actualizar(Agencia agencia) {
		// TODO Auto-generated method stub
		//this.agenVistaProducto = agencia;
		System.out.println("El agregar producto actualizo la agencia");
		
	}

}
