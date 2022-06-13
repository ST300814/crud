package com.back.tarea.backendtareas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.back.tarea.backendtareas.model.Tarea;

@Service
public class TareaService {
	
	@Autowired
	private TareaRepository tareaRepository;

	public void guardar (Tarea tarea) {
		tareaRepository.save(tarea);
	}
	
	public List<Tarea> obtenerTodas(){
		return tareaRepository.findAll();
		
	}
			
	public Tarea obtenerTarea(Integer id) {
		return tareaRepository.getById(id);
		
	}
	
	public void actualizar (Tarea tarea) {
		tareaRepository.save(tarea);		
		
	}
	
	public void eliminar (Integer id) {
		tareaRepository.deleteById(id);
	}
}
