import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int escolha;

		System.out.print("Digite o número do exercício (1-16) ou 0 para sair: ");
		escolha = entrada.nextInt();

		while (escolha != 0) {
			switch (escolha) {
			case 1:
				Exercicios.ex1();
				break;
			case 2:
				Exercicios.ex2();
				break;
			case 3:
				Exercicios.ex3();
				break;
			case 4:
				Exercicios.ex4();
				break;
			case 5:
				Exercicios.ex5();
				break;
			case 6:
				Exercicios.ex6();
				break;
			case 7:
				Exercicios.ex7();
				break;
			case 8:
				Exercicios.ex8();
				break;
			case 9:
				Exercicios.ex9();
				break;
			case 10:
				Exercicios.ex10();
				break;
			case 11:
				Exercicios.ex11();
				break;
			case 12:
				Exercicios.ex12();
				break;
			case 13:
				Exercicios.ex13();
				break;
			case 14:
				Exercicios.ex14();
				break;
			case 15:
				Exercicios.ex15();

				break;
			case 16:
				Exercicios.ex16();
				break;
			}
			System.out.print("Digite o número do exercício (1-16) ou 0 para sair: ");
			escolha = entrada.nextInt();
		}
		System.out.println("Saindo do programa...");
		entrada.close();
	}
}
