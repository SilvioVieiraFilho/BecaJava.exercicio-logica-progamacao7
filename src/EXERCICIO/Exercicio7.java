package EXERCICIO;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int vetor[] = new int[10];
		boolean erro = true;

		try {

			for (int i = 0; i < vetor.length; i++) {

				System.out.println("digite um numero inteiro");
				vetor[i] = s.nextInt();

			}

			for (int j = 9; j >= 0; j--) {

				System.out.println(vetor[j]);

			}

		} catch (Exception ex) {

			

				System.out.println("Digite um Numero inteiro");

			}

		}
	}

