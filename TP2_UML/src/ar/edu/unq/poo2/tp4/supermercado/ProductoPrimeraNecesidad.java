package ar.edu.unq.poo2.tp4.supermercado;

public class ProductoPrimeraNecesidad extends Producto{


	//Constructor

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado) {
		super(nombre, precio, esPrecioCuidado);
	
	}	
	
	
	//Metodos
	//Getters and Setters
	
	@Override
	public double getPrecio() {
		return super.getPrecio() * 0.9;
	}
	
	
	
}
