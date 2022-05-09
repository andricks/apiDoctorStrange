package com.example.produc.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.example.produc.entites.Citas;
import com.example.produc.entites.Pacientes;
import com.example.produc.entites.Poliza;
@Service
public class poliza_service_imple implements Poliza_service {

	private static AtomicLong sequence = new AtomicLong();
	private static List<Poliza> lista = new ArrayList< Poliza>() {{
		add(new  Poliza(sequence.incrementAndGet(),0,"","",""));
		
		add(new  Poliza(sequence.incrementAndGet(),1,"","",""));
		
		add(new  Poliza(sequence.incrementAndGet(),2,"","",""));
	}};
	
	public List<Poliza> listarPoliza() {
		// TODO Auto-generated method stub
		return lista;
	}
	@Override
	public Poliza buscarPoliza(long id) {
		// TODO Auto-generated method stub
		for (Poliza e: lista) {
			if (e.getIdPoliza().equals(id))
				return e;
		}
		return null;
	}
	@Override
	public void crearPoliza(int idCliente ,Poliza poliza) {
		poliza.setIdPoliza(sequence.incrementAndGet());
		poliza.setIdCliente(idCliente);
		lista.add(poliza);

	}
	@Override
	public void eliminarPoliza(long id) {
		for (Poliza e: lista) {
			if (e.getIdPoliza().equals(id))
				lista.remove(e);
		}
		
	}
	@Override
	public void editarPoliza(long id, Poliza poliza) {
		// TODO Auto-generated method stub
		int index = (int) id-1;	
		poliza.setIdPoliza(id);
		lista.set(index, poliza);
	}
	
	
	
	
	
}
