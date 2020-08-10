package br.zup.discovery.academy.josias.utils;

import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class vetor {

	public vetor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int vetor[] = new int[10]; // quantidade de vetores
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in); // entrada teclado
		Scanner teclado = new Scanner(System.in); // entrada teclado

		try { // operacao

			for (int i = 0; i <= 11; i++) {

				System.out.println(" Digite um numero ");
				vetor[i] = entrada.nextInt();

				if (vetor[i] == 0) { // condicao

					break;
				}

			}
			// excecoes

		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(" voce digitou mais que 10 valores");
		} catch (InputMismatchException ae) {
			System.out.println(" Nao digite valor string");

			// TODO: handle exception

		}
	}
}
