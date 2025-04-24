package ar.edu.unq.poo2.tp4.supermercado;

public class Producto {
	
	//Atributos
	private String nombre;
	private double precio;
	private boolean esPrecioCuidado = false;
	
	//Constructor
	public Producto(String nombre, double precio, boolean esPrecioCuidado){
		
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;	
	}
	
	public Producto(String nombre, double precio){
		
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;	
	}
	
	
	//Metodos
	public void aumentarPrecio(double aumento) {
		this.precio += aumento;
	}
	
	
	
	//Getters and setters
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public boolean esPrecioCuidado() {
		return this.esPrecioCuidado;
	}
	
}
