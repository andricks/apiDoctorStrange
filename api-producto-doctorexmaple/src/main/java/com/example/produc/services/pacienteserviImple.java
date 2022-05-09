package com.example.produc.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.example.produc.entites.Pacientes;
@Service
public class pacienteserviImple implements Pasiente_service {
	
	private static AtomicLong sequence = new AtomicLong();

	private static List< Pacientes> lista = new ArrayList< Pacientes>() {{
		add(new  Pacientes(sequence.incrementAndGet(),"Carlo","Saul","Contreras","Ramirez","30"));
		add(new  Pacientes(sequence.incrementAndGet(),"Emy","Guissel","Sandoval","Aguilar","25"));
		add(new  Pacientes(sequence.incrementAndGet(),"Emanuel","Enrique","Sanchez","Osorio","40"));
	}};
	
	public List<Pacientes> listarPacientes() {
		// TODO Auto-generated method stub
		return lista;
	}
	@Override
	public Pacientes buscarPacientes(long idpaciente) {
		for (Pacientes e: lista) {
			if (e.getId().equals(idpaciente))
				return e;
		}
		return null;

	}
	@Override
	public void crearPacientes(Pacientes pacientes) {
		
		pacientes.setId(sequence.incrementAndGet());
		lista.add(pacientes);

	}
	@Override
	public void eliminarPacientes(long id) {
		for (Pacientes e: lista) {
			if (e.getId().equals(id))
				lista.remove(e);
		}

	}
	@Override
	public void editarPacientes(long id,Pacientes pacientes) {
		int index = (int) id-1;	
		pacientes.setId(id);
		lista.set(index, pacientes);

	}

}
