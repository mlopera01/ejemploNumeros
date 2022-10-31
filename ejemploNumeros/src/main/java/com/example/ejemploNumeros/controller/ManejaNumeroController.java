package com.example.ejemploNumeros.controller;

import com.example.ejemploNumeros.service.NumerosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "/validar-numeros" )

public class ManejaNumeroController {
    private final NumerosService numerosService;

    public ManejaNumeroController(@Autowired NumerosService x) {
        this.numerosService = x;
    }
    @PostMapping
    public ResponseEntity<ResultadoCalculo> solucion (@RequestBody List<Integer> numerosRecibidos) {
        return ResponseEntity.ok(numerosService.devolverCalculo(numerosRecibidos));
    }
}
