package com.example.produc.services;

import java.util.List;


import com.example.produc.entites.Poliza;

public interface Poliza_service {
	public List<Poliza> listarPoliza();
	public Poliza buscarPoliza(long id);
	public void crearPoliza(int idCliente,Poliza poliza);
	public void eliminarPoliza(long id);
	public void editarPoliza(long id,Poliza poliza);
}
