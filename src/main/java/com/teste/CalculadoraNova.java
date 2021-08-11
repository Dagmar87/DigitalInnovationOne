package com.teste;

public class CalculadoraNova {

	public int somar(int... vls) {

		int soma = 0;

		for (int vl : vls) {
			soma += vl;
		}

		return soma;

	}

	public int subtrair(int... vls) {

		int sub = 0;

		for (int vl : vls) {
			sub -= vl;
		}

		return sub;

	}

	public int multiplicar(int vA, int vB) {

		int mul = vA * vB;

		return mul;

	}

}
