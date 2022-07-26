package com.diegok2.hrworkers.controller;

import com.diegok2.hrworkers.model.entity.Worker;
import com.diegok2.hrworkers.model.repository.WorkerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {

    private static Logger logger = LoggerFactory.getLogger(WorkerController.class);

    @Autowired
    private Environment env;

    @Autowired
    private WorkerRepository workerRepository;


    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        List<Worker> lista = workerRepository.findAll();
        return ResponseEntity.ok(lista);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id){
        logger.info("PORT = " + env.getProperty("local.server.port")); //Mostrar no console da aplicação

        Worker lista = workerRepository.findById(id).get();
        return ResponseEntity.ok(lista);
    }




}
