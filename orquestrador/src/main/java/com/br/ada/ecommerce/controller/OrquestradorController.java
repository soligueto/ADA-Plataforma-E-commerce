package com.br.ada.ecommerce.controller;

import com.br.ada.ecommerce.dominio.DadosPagamento;
import com.br.ada.ecommerce.dominio.Venda;
import com.br.ada.ecommerce.service.OrquestrarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orquestracao")
public class OrquestradorController {

    @Autowired
    private OrquestrarService orquestrarService;


    @PostMapping
    public void orquestrar(@RequestBody Venda venda) {
        orquestrarService.orquestrar();
    }
}
