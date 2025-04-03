package Empresa;

import java.time.LocalDateTime;

public class ReciboDeHaberes {

	//Atributos
	private String nombre;
	private String direccion;
	private LocalDateTime fechaDeEmision;
	private double sueldoBruto;
	private double sueldoNeto;
	private String desgloce;
	
	//Constructor
	public ReciboDeHaberes(Empleado e, LocalDateTime fechaDeEmision) {
		
		this.nombre 		= e.getNombre();
		this.direccion 		= e.getDireccion();
		this.fechaDeEmision = fechaDeEmision;
		this.sueldoBruto    = e.sueldoBruto();
		this.sueldoNeto     = e.sueldoNeto();
		
		//Una vez inicializados los atributos puedo generar el desgloce
		this.desgloce = this.generarDesgloce(e);
	}


	
	//Metodos
		
	private String generarDesgloce(Empleado e) {
		
		return "EMPLEADO : " + e.getNombre() + "\n" +
				"--------- SUELDO BRUTO --------- \n"  +
				e.infoSueldoBruto() + "\n" +
				"--------- RETENCIONES  --------- \n"  +
				e.infoRetenciones() + "\n";
	}	
		
	//Getters and Setters
	public String getDesgloce() {
		return this.desgloce;
	}
}
