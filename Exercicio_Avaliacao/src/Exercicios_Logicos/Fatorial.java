package Exercicios_Logicos;

import java.util.Scanner;

public class Fatorial {
	// funcao que calcula o fatorial de n
	public static int fatorial(int n) {
		int fat = 1;
		for (int i = 1; i <= n; i++) {
			fat = fat * i;
		}
		return fat;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result, n, i = 1;

		while (i != 0) {
			System.out.println("Insira o valor de n: ");
			n = sc.nextInt();
			if (n < 0) {
				System.out.println("Numero invalido");
				System.exit(1);
			}
			result = fatorial(n);
			System.out.println("O fatorial de n=(" + n +") é = " + result);
			System.out.println("\n");
		}
	}

}
