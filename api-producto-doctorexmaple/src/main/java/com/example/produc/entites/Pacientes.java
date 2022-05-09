package com.example.produc.entites;

public class Pacientes {
	private Long idpaciente ;
private String Primer_nombre;
private String Segundo_nombre;
private String apellido;
private String Segundo_apellido;
private String Edad;
public Pacientes(Long idpaciente, String primer_nombre     , String segundo_nombre , String apellido , String segundo_apellido ,
		String edad) {
	super();
	this.idpaciente = idpaciente;
	Primer_nombre = primer_nombre;
	Segundo_nombre = segundo_nombre;
	this.apellido = apellido;
	Segundo_apellido = segundo_apellido;
	Edad = edad;
}
public Long getId() {
	return idpaciente;
}
public void setId(Long id) {
	this.idpaciente = id;
}
public String getPrimer_nombre() {
	return Primer_nombre;
}
public void setPrimer_nombre(String primer_nombre) {
	Primer_nombre = primer_nombre;
}
public String getSegundo_nombre() {
	return Segundo_nombre;
}
public void setSegundo_nombre(String segundo_nombre) {
	Segundo_nombre = segundo_nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getSegundo_apellido() {
	return Segundo_apellido;
}
public void setSegundo_apellido(String segundo_apellido) {
	Segundo_apellido = segundo_apellido;
}
public String getEdad() {
	return Edad;
}
public void setEdad(String edad) {
	Edad = edad;
}


}


