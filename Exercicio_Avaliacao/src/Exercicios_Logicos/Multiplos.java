package Exercicios_Logicos;

import java.util.Scanner;

public class Multiplos {
	public static int somaMultiplos(int n) {
		int soma = 0;
		for(int i=0;i<n;i++) {
			if(i%3==0 || i%5==0) {
				soma = soma + i;
			}
		}		
		return soma;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Insira o valor X: ");
		int n = s.nextInt();
		System.out.println("Soma dos multiplos até o limite ("+ n + ") => "+somaMultiplos(n));
		System.out.println("Soma dos multiplos até o limite 10 => "+somaMultiplos(10));

	}

}
