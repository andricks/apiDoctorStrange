package com.example.produc.entites;

public class Poliza {
	private Long idPoliza;
	private int idCliente;
	private String Estado;
	private String Fecha_inicio;
	private String Fecha_fin;
	public Poliza(Long idPoliza, int idCliente, String estado, String fecha_fin,String fecha_inicio) {
		super();
		this.idPoliza = idPoliza;
		this.idCliente = idCliente;
		Estado = estado;
		Fecha_inicio = fecha_inicio;
		Fecha_fin = fecha_fin;
	}
	public Long getIdPoliza() {
		return idPoliza;
	}
	public void setIdPoliza(Long idPoliza) {
		this.idPoliza = idPoliza;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public String getFecha_inicio() {
		return Fecha_inicio;
	}
	public void setFecha_inicio(String fecha_inicio) {
		Fecha_inicio = fecha_inicio;
	}
	public String getFecha_fin() {
		return Fecha_fin;
	}
	public void setFecha_fin(String fecha_fin) {
		Fecha_fin = fecha_fin;
	}
	
	
}
