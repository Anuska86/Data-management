package id;

public class Cliente {
	
	private String nombre; 
	private int edad; 
	private String dni; 
	
	public Cliente () {
		
	}
	
	// Devolver el nombre
	
	public String getNombre () {
		return nombre; 
		
	}

	// Establecer el nombre en la variable 
	
	public void setNombre(String nombre) {
	this.nombre = nombre;
	}

	
	// Devolver la edad
	
	
	public int getEdad() {
	return edad;
	}

	// Establecer la edad en la variable 
	
	public void setEdad(int edad) {
	this.edad = edad;
	}
	
	// Devolver el dni 
	
	public String getDni() {
	return dni;
	}
	
	// Establecer la variable dni 
	
	public void setDni(String dni) {
	this.dni = dni;
	}
	
	}
