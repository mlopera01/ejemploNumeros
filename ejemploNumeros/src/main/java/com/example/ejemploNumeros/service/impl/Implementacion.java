package com.example.ejemploNumeros.service.impl;

import com.example.ejemploNumeros.controller.ResultadoCalculo;
import com.example.ejemploNumeros.service.NumerosService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Implementacion implements NumerosService {
    @Override
    public ResultadoCalculo devolverCalculo(List<Integer> numerosRecibidos) {
        ResultadoCalculo rc = new ResultadoCalculo();
        if (numerosRecibidos.size()==0) {
            throw new IllegalArgumentException("Arreglo vacío");
        }
        int mayor=0;
        int menor=0;
        int sumaTotal=0;
        int sumaPositivos=0;
        int sumaNegativos=0;
        for (int i=0; i<numerosRecibidos.size();i++){
            if(numerosRecibidos.get(i)>mayor){
                mayor = numerosRecibidos.get(i);
            }
            if(numerosRecibidos.get(i)<menor){
                menor = numerosRecibidos.get(i);
            }
            if(numerosRecibidos.get(i)>=0){
                sumaPositivos=sumaPositivos + numerosRecibidos.get(i);
            } else {
                sumaNegativos=sumaNegativos + numerosRecibidos.get(i);
            }

            sumaTotal = sumaTotal +  numerosRecibidos.get(i);
            rc.setNumeroMayor(mayor);
            rc.setNumeroMenor(menor);
            rc.setSumaNumeros(sumaTotal);
            rc.setSumaNegativos(sumaNegativos);
            rc.setSumaPositivos(sumaPositivos);
        }
        return rc;
    }
}
