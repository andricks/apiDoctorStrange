package com.example.produc.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.example.produc.entites.Citas;
import com.example.produc.entites.Pacientes;

@Service
public class Cita_servi_imple implements Citas_service {
	private static AtomicLong sequence = new AtomicLong();

	private static List< Citas> lista = new ArrayList< Citas>();

	@Override
	public List<Citas> listarCitas() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Citas buscarCitas(long id) {
		
		for (Citas e: lista) {
			if (e.getIdPoliza().equals(id))
				return e;
		}
		return null;
	}

	@Override
	public void AgendarCitas(long id, Citas citas) {
		citas.setIdPoliza(id);
		lista.add(citas);

	}

	@Override
	public void eliminarCitas(long id) {
		for (Citas e: lista) {
			if (e.getIdPoliza().equals(id))
				lista.remove(e);
		}
		
	}

	@Override
	public void estadoCitas(long id, String Estado) {
		for (Citas e: lista) {
			if (e.getIdPoliza().equals(id))
				e.setEstado(Estado);
		}

		
	}
		
	
	
	
	
	
	
	
		
	

	
}
