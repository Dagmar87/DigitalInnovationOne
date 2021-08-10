package com.teste;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar("1+1+3");
		assertEquals(1, soma);
		//assertEquals(5, soma); -> maneira correta
	}
	
	@Test
	public void testeSomarComMock(){
		Calculadora calculadora = mock(Calculadora.class);
		when(calculadora.somar("1+2")).thenReturn(10);
		int resultado = calculadora.somar("1+2");
		assertEquals(10, resultado);
	}

}
