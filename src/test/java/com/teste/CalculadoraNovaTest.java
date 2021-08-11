package com.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraNovaTest {

	@Test
	public void deveSomarDoisValores() {
		int vA = 1;
		int vB = 2;

		CalculadoraNova calc = new CalculadoraNova();
		int soma = calc.somar(vA, vB);

		assertEquals(3, soma);
	}

	@Test
	public void deveSomarTresValores() {
		int vA = 1;
		int vB = 2;
		int vC = 3;

		CalculadoraNova calc = new CalculadoraNova();
		int soma = calc.somar(vA, vB, vC);

		assertEquals(6, soma);
	}

	@Test
	public void deveSomarCincoValores() {
		int vA = 1;
		int vB = 2;
		int vC = 3;
		int vD = 4;
		int vE = 5;

		CalculadoraNova calc = new CalculadoraNova();
		int soma = calc.somar(vA, vB, vC, vD, vE);

		assertEquals(15, soma);
	}

	@Test
	public void deveSubtrairDoisValores() {
		int vA = -3;
		int vB = 2;

		CalculadoraNova calc = new CalculadoraNova();
		int sub = calc.subtrair(vA, vB);

		assertEquals(1, sub);
	}

	@Test
	public void deveMultiplicarDoisValores() {
		int vA = 2;
		int vB = 5;

		CalculadoraNova calc = new CalculadoraNova();
		int mul = calc.multiplicar(vA, vB);

		assertEquals(10, mul);
	}

}
