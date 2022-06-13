package com.back.tarea.backendtareas.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.back.tarea.backendtareas.model.Tarea;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Integer>{
	

}
