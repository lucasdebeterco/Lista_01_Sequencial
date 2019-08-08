import java.util.Scanner;

public class Exercicios {
	static Scanner entrada = new Scanner(System.in);

	public static void ex1() {
		System.out.println("Olá Mundo");
	}

	public static void ex2() {
		System.out.println("Digite um número: ");
		int num1 = entrada.nextInt();
		System.out.println("O número informado foi " + num1);
	}

	public static void ex3() {
		System.out.println("Digite dois números: ");
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		System.out.println("A soma dos números é: " + (num1 + num2));
	}

	public static void ex4() {
		System.out.println("Digite 4 notas: ");
		float nota1 = entrada.nextFloat();
		float nota2 = entrada.nextFloat();
		float nota3 = entrada.nextFloat();
		float nota4 = entrada.nextFloat();
		System.out.println("A média das notas é " + (nota1 + nota2 + nota3 + nota4) / 4);
	}

	public static void ex5() {
		System.out.println("Digite uma medida em metros: ");
		float medida = entrada.nextFloat();
		System.out.println("A medida em centímetros é: " + medida * 100);
	}

	public static void ex6() {
		System.out.println("Digite o raio de um cículo: ");
		float raio = entrada.nextFloat();
		System.out.println("A área do círculo é: " + 3.14 * (raio * raio));
	}

	public static void ex7() {
		System.out.println("Digite a bese e altura de um quadrado: ");
		float base = entrada.nextFloat();
		float altura = entrada.nextFloat();
		System.out.println("A área do quadrado é: "+base*altura);
	}
	
	public static void ex8() {
		System.out.println("Quanto você ganha por hora? ");
		float salarioHora = entrada.nextFloat();
		System.out.println("Quantos horas trabalha por mês?");
		float horasMes = entrada.nextFloat();
		System.out.println("Seu salário no mês será: "+salarioHora*horasMes);
	}
	
	public static void ex9() {
		System.out.print("Digite a temperatura em Farenheit: ");
		float temp = entrada.nextFloat();
		System.out.println("A temperatura em Celsius é: "+(temp-32)/1.8);
	}
	
	public static void ex10() {
		System.out.println("Digite dois números inteiros e um real: ");
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		float num3 = entrada.nextFloat();
		System.out.println("O produto do dobro do primeiro com metade do segundo é: " + (num1*2)*(num2/2) );
		System.out.println("A soma do triplo do primeiro com o terceiro é: " + (num1*3)+num3);
		System.out.print("O terceiro elevado ao cubo é: " + num3*num3*num3);
	}
	
	public static void ex11() {
		System.out.println("Digite a sua altura: ");
		float altura = entrada.nextFloat();
		System.out.println("O seu peso ideal é "+((72.7*altura)-58)+" kilos");
	}
	
	public static void ex12() {
		System.out.println("Digite a sua altura: ");
		float altura = entrada.nextFloat();
		System.out.println("Informe seu sexo (1 - Homem / 2 - Mulher): ");
		int sexo = entrada.nextInt();
		if (sexo == 1) {
			System.out.println("O seu peso ideal é "+((72.7*altura)-58)+" kilos.");
		}
		else if(sexo == 2) {
			System.out.println("O seu peso ideal é "+((62.1*altura)-44.7)+" kilos.");
		}
		else
			System.out.println("Digite uma opção de sexo válida.");
	}
	
	public static void ex13() {
		System.out.println("Digite o peso total dos peixes: ");
		float peso = entrada.nextFloat();
		if (peso>50) {
			float excesso = peso-50;
			System.out.println("O peso foi excedido em "+excesso+" kilos");
			float multa = excesso*4;
			System.out.println("A multa é de "+multa+" reais.");
		}
		else 
			System.out.println("Não houve excesso de peso, Boa Pesca!");
	}
	
	public static void ex14() {
		System.out.println("Ganhos por hora: ");
		float salarioHora = entrada.nextFloat();
		System.out.println("Número de horas trabalhadas no mês: ");
		float horasMes = entrada.nextFloat();
		
		float salarioBruto = salarioHora*horasMes;
		float salarioLiquido = (float) (salarioBruto*0.76);
		System.out.println("Salario Bruto: "+salarioBruto);
		System.out.println("Pago ao sindicato: "+salarioBruto*0.05);
		System.out.println("Pago ao INSS: "+salarioBruto*0.08);
		System.out.println("Salário líquido: "+salarioLiquido);	
	}
	
	public static void ex15() {
		System.out.println("Quantos metros quadrados serão pintados?");
		float metros = entrada.nextFloat();
		float litros = metros/3;
		
		int latas = (int) ((litros/18)+1);
		System.out.println("Número de latas nescessárias: "+latas);
		System.out.println("Preço total: "+(latas*80)+" reais");
	}
	
	public static void ex16() {
		System.out.println("Quantos metros quadrados serão pintados?");
		double metros = entrada.nextDouble();
		double litros = metros/6;
		
		double latas = Math.round(litros/18);
		System.out.println("Número de latas de 18 litros nescessárias: "+latas); 
		System.out.println("Preço comprando latas de 18 litros: "+(latas*80)+" reais");
		
		double galoes = Math.round(litros/3.6);
		System.out.println("Número de galões nescessários: "+galoes);
		System.out.println("Preço comprando galões de 3,6 litros: "+(galoes*25)+" reais");
	}
	
}
