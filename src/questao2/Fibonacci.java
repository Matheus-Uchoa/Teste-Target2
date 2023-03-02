package questao2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();

		int primeiro = 0;
		int segundo = 1;
		int proximo = 0;

		while (proximo < numero) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
		}

		if (proximo == numero) {
			System.out.println(numero + " pertence à sequência de Fibonacci.");
		} else {
			System.out.println(numero + " não pertence à sequência de Fibonacci.");
		}

		scanner.close();
	}
}
