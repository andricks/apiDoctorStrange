package com.example.produc.services;

import java.util.List;

import com.example.produc.entites.Pacientes;

public interface Pasiente_service {
	public List<Pacientes> listarPacientes();
	public Pacientes buscarPacientes(long idpaciente);
	public void crearPacientes(Pacientes pacientes);
	public void eliminarPacientes(long id);
	public void editarPacientes(long id,Pacientes pacientes);

}
