package com.example.ejemploNumeros.service;

import com.example.ejemploNumeros.controller.ResultadoCalculo;

import java.util.List;

public interface NumerosService {
    ResultadoCalculo devolverCalculo (List<Integer> numerosRecibidos);

}
