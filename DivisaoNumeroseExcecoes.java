package br.zup.discovery.academy.josias.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoNumeroseExcecoes {

	public DivisaoNumeroseExcecoes() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner numero = new Scanner(System.in);

		try {

			int num1, num2; // variaveis para usuário digitar

			System.out.println(" Digite um numero");
			num1 = numero.nextInt(); // primeiro numero

			System.out.println(" Digite um numero");
			num2 = numero.nextInt(); // segundo numero

			int i = num1 / num2; // operacao

			System.out.println(" o valor da divisão é " + i);
			// exceções

		} catch (ArithmeticException ae) {
			System.out.println(" não pode dividir por zero");
		} catch (InputMismatchException ae) {
			System.out.println("o valor informado nao é numerico");
		}

	}

}
