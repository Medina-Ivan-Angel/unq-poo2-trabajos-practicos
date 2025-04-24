package ar.edu.unq.poo2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {

	//Atributos
	private List<Integer> numeros = new ArrayList<Integer>();
	
	
	//Metodos
	/*
	   1. La cantidad de pares
	   2. La cantidad de impares
	   3. La cantidad de múltiplos de un cierto número
	 */
	
	public int cantidadDePares() {
		
		return (int) numeros.stream().filter(n -> n % 2 == 0).count();
	}
	
	public int cantidadDeImpares() {
		
		return (int) numeros.stream().filter(n -> n % 2 != 0).count();
	}
	
	public int cantidadDeMultiplosDe(int numero) {
		
		return (int) numeros.stream().filter(n -> n % numero == 0).count();
	}
	
	public void addNumber(int numero) {
		this.numeros.add(numero);
	}
	
	//Getters and Setters
	
	
}
