package datos;

public class Cliente {
	
	private String nombre;
	private String telefonoTrabajo; 
	private String prefijoTelefonoTrabajo; 
	private String telefonoCasa; 
	
public Cliente() {
	
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getTelefonoTrabajo() {
	return telefonoTrabajo;
}

public void setTelefonoTrabajo(String telefonoTrabajo) {
	this.telefonoTrabajo = telefonoTrabajo;
}

public String getPrefijoTelefonoTrabajo() {
	return prefijoTelefonoTrabajo;
}

public void setPrefijoTelefonoTrabajo(String prefijoTelefonoTrabajo) {
	this.prefijoTelefonoTrabajo = prefijoTelefonoTrabajo;
}

public String getTelefonoCasa() {
	return telefonoCasa;
}

public void setTelefonoCasa(String telefonoCasa) {
	this.telefonoCasa = telefonoCasa;
}
	
	
	
}