package com.example.produc.services;

import java.util.List;

import com.example.produc.entites.Citas;


public interface Citas_service {
	public List<Citas> listarCitas();
	public Citas buscarCitas(long id);
	public void AgendarCitas(long id,Citas citas);
	public void eliminarCitas(long id);
	public void estadoCitas(long id,String Estado);
}
