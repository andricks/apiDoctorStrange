package com.example.produc.entites;

public class Citas {
private Long Poliza ;
private String fecha ;
private String Hora ;
private String Estado ;
private String Observaciones ;
public Citas(Long Poliza, String fecha, String hora, String estado, String observaciones) {
	super();
	this.Poliza = Poliza;
	this.fecha = fecha;
	Hora = hora;
	Estado = estado;
	Observaciones = observaciones;
}
public Long getIdPoliza() {
	return Poliza;
}
public void setIdPoliza(Long idPoliza) {
	this.Poliza = idPoliza;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
public String getHora() {
	return Hora;
}
public void setHora(String hora) {
	Hora = hora;
}
public String getEstado() {
	return Estado;
}
public void setEstado(String estado) {
	Estado = estado;
}
public String getObservaciones() {
	return Observaciones;
}
public void setObservaciones(String observaciones) {
	Observaciones = observaciones;
}


}
