package com.back.tarea.backendtareas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.back.tarea.backendtareas.model.Tarea;


@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class TareaController {
	
	@Autowired
	private TareaService tareaServices;
	
	
	@GetMapping("api/tarea")
	public List<Tarea> obtenerTareas(){
		List<Tarea> listaTareas = new ArrayList<>();
		
		
		Tarea e = new Tarea();
		e.setId(1);
		e.setNombres("Programa");
		e.setDescripcion("prueba");
		e.setDuracion("10:00");
		e.setEstado("pausado");
		e.setTiempo("5:00:00");
		
		
		Tarea e1 = new Tarea();
		e.setId(1);
		e.setNombres("Programa");
		e.setDescripcion("prueba");
		e.setDuracion("20:00");
		e.setEstado("activo");
		e.setTiempo("10:00:00");
		
		listaTareas.add(e);
		listaTareas.add(e1);
		
		return listaTareas;
	}
	
	@PostMapping("api/tareas")
	public Tarea guardarTarea(@RequestBody Tarea tarea) {
		System.out.println(tarea);
		tareaServices.guardar(tarea);
		return tarea;
	}
	
	@GetMapping("api/tareas")
	public List<Tarea> obtener(){
		return tareaServices.obtenerTodas();
	}

	@GetMapping("api/tareas/{id}")
	public Tarea obtenerTarea(@PathVariable ("id") Integer id) {
		return tareaServices.obtenerTarea(id);
	}
	
	@PutMapping("api/tareas")
	public void actualizarTarea(@RequestBody Tarea tarea) {
	tareaServices.actualizar(tarea);
	}
	
	@DeleteMapping("api/tareas/{id}")
	public void eliminar (@PathVariable ("id") Integer id) {
		tareaServices.eliminar(id);
	}
}
