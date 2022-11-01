package com.example.ejemploNumeros;

import com.example.ejemploNumeros.controller.ResultadoCalculo;
import com.example.ejemploNumeros.service.NumerosService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EjemploNumerosApplicationTests {
	@Autowired
	private NumerosService numeroService;

	@Test
	void testVerificarSiEsNumeroMenor() {
		//List<Integer> li = new List<Integer> ();
		//li.add(3);
		List<Integer> li = Arrays.asList(3,0,-1,50);
		ResultadoCalculo rc = new ResultadoCalculo ();
		rc = numeroService.devolverCalculo(li);
		assertEquals(-1,rc.getNumeroMenor());
	}

	@Test
	void testVerificarSiEsMayor() {
		List<Integer> li = Arrays.asList(3,0,-1,50);
		ResultadoCalculo rc = new ResultadoCalculo ();
		rc = numeroService.devolverCalculo(li);
		assertEquals(50,rc.getNumeroMayor());
	}
	@Test
	void testVerificarSumaPositivos() {
		List<Integer> li = Arrays.asList(3,0,-1,50);
		ResultadoCalculo rc = new ResultadoCalculo ();
		rc = numeroService.devolverCalculo(li);
		assertEquals(53,rc.getSumaPositivos());
	}

	@Test
	void testVerificarSumaNegativos() {
		List<Integer> li = Arrays.asList(3,0,-1,50);
		ResultadoCalculo rc = new ResultadoCalculo ();
		rc = numeroService.devolverCalculo(li);
		assertEquals(-1,rc.getSumaNegativos());
	}

	@Test
	void testVerificarSumaTotales() {
		List<Integer> li = Arrays.asList(3,0,-1,50);
		ResultadoCalculo rc = new ResultadoCalculo ();
		rc = numeroService.devolverCalculo(li);
		assertEquals(52,rc.getSumaNumeros());
	}


}
