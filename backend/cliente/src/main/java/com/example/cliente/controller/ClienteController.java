package com.example.cliente.controller;

import com.example.cliente.model.Cliente;
import com.example.cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService service;

    @GetMapping
    private List<Cliente> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    private Cliente findById(@PathVariable String id){
        return service.findByID(id);
    }

    @PostMapping
    private Cliente create (@RequestBody Cliente cliente) {
        return service.save(cliente);
    }
}
