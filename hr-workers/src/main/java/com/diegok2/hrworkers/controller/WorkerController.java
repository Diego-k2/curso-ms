package com.diegok2.hrworkers.controller;

import com.diegok2.hrworkers.model.entity.Worker;
import com.diegok2.hrworkers.model.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {

    @Autowired
    private WorkerRepository workerRepository;


    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        List<Worker> lista = workerRepository.findAll();
        return ResponseEntity.ok(lista);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id){
        Worker lista = workerRepository.findById(id).get();
        return ResponseEntity.ok(lista);
    }




}
