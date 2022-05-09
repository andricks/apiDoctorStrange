package com.example.produc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.produc.entites.Citas;
import com.example.produc.entites.Pacientes;
import com.example.produc.entites.Poliza;
import com.example.produc.services.Citas_service;
import com.example.produc.services.Pasiente_service;
import com.example.produc.services.Poliza_service;

@RestController
@RequestMapping("/Doctor")
public class Pasientes_Controller {
	
	
	@Autowired
	Pasiente_service PacientesService;
	@Autowired
	Poliza_service Polizaservice;
	@Autowired
	Citas_service Citaservice;
	

	
	@GetMapping("Pacientes")
	public List<Pacientes> listarPacientes(){
		List<Pacientes> lista = PacientesService.listarPacientes();
		return lista;
	}
	
	@GetMapping("Pacientes/{id}")
	public Pacientes buscarPacientes(@PathVariable Long id) {
		Pacientes paciente = PacientesService.buscarPacientes(id);
		return paciente;
	}
	
	@PostMapping("Pacientes")
	public void crearPacientes(@RequestBody  Pacientes pacientes) {
		PacientesService.crearPacientes(pacientes);
	}
	@DeleteMapping("Pacientes/{id}")
	public void eliminarPacientes(@PathVariable Long id) {
		PacientesService.eliminarPacientes(id);
	}
	@PutMapping("Pacientes/{id}")
		public void editarPacientes(@PathVariable Long id, @RequestBody Pacientes pacientes ) {
			PacientesService.editarPacientes(id, pacientes);
		} 

	@GetMapping("Poliza")
	public List<Poliza> listarPoliza(){
		List<Poliza> lista = Polizaservice.listarPoliza();
		return lista;
		
	}
	@GetMapping("poliza/{id}")
	public Poliza buscarPoliza(@PathVariable Long id) {
		Poliza poliza = Polizaservice.buscarPoliza(id);
		return poliza;
}
	@PostMapping("Poliza/{id}")
	public void craearPoliza(@PathVariable int id, @RequestBody  Poliza poliza) {
		Polizaservice.crearPoliza(id,poliza);
	}
	
	@DeleteMapping("Poliza/{id}")
	public void eliminarPoliza(@PathVariable Long id) {
		Polizaservice.eliminarPoliza(id);
	}
	@PutMapping("Poliza/{id}")
	public void editarPoliza(@PathVariable Long id, @RequestBody Poliza poliza ) {
		Polizaservice.editarPoliza(id, poliza);
	}
	@GetMapping("Citas")
	public List<Citas> listarCitas(){
		List<Citas> lista = Citaservice.listarCitas();
		return lista;
	}

@GetMapping("Citas/{id}")
public Citas buscarCitas(@PathVariable Long id) {
	Citas citas = Citaservice.buscarCitas(id);
	return citas;
}
@PostMapping("Citas/{id}")
public void AgendarCitas(@PathVariable int id, @RequestBody  Citas citas) {
	Citaservice.AgendarCitas(id,citas);
}
@PutMapping("Citas/{id}")
public void estado(@PathVariable Long id,@RequestBody String estado  ) {
	Citaservice.estadoCitas(id, estado);

}
@DeleteMapping("Citas/{id}")
public void eliminarCitas(@PathVariable Long id) {
	Citaservice.eliminarCitas(id);
}
}

	




