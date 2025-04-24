package ar.edu.unq.poo2.tp4.supermercado;

import java.util.List;
import java.util.ArrayList;

public class Supermercado {

	
	//Atributos
	private String nombre;
	private String direccion;
	private List<Producto> productos = new ArrayList<Producto>();
	
	//Constructor
	
	public Supermercado(String nombre, String direccion) {
		
		this.nombre    = nombre;
		this.direccion = direccion;
	}
	
	//Metodos
	
	public int getCantidadDeProductos() {
		return (int) this.productos.stream().count();
	}

	public void agregarProducto(Producto nuevoProducto) {
		this.productos.add(nuevoProducto);		
	}

	public double getPrecioTotal() {
		return this.productos.stream().mapToDouble(p -> p.getPrecio()).sum();
	}
	
	
	//Getters and Setters
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public List<Producto> getProductos(){
		return this.productos;
	}

	
}
