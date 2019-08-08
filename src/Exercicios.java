import java.util.Scanner;

public class Exercicios {
	static Scanner entrada = new Scanner(System.in);

	public static void ex1() {
		System.out.println("Ol� Mundo");
	}

	public static void ex2() {
		System.out.println("Digite um n�mero: ");
		int num1 = entrada.nextInt();
		System.out.println("O n�mero informado foi " + num1);
	}

	public static void ex3() {
		System.out.println("Digite dois n�meros: ");
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		System.out.println("A soma dos n�meros �: " + (num1 + num2));
	}

	public static void ex4() {
		System.out.println("Digite 4 notas: ");
		float nota1 = entrada.nextFloat();
		float nota2 = entrada.nextFloat();
		float nota3 = entrada.nextFloat();
		float nota4 = entrada.nextFloat();
		System.out.println("A m�dia das notas � " + (nota1 + nota2 + nota3 + nota4) / 4);
	}

	public static void ex5() {
		System.out.println("Digite uma medida em metros: ");
		float medida = entrada.nextFloat();
		System.out.println("A medida em cent�metros �: " + medida * 100);
	}

	public static void ex6() {
		System.out.println("Digite o raio de um c�culo: ");
		float raio = entrada.nextFloat();
		System.out.println("A �rea do c�rculo �: " + 3.14 * (raio * raio));
	}

	public static void ex7() {
		System.out.println("Digite a bese e altura de um quadrado: ");
		float base = entrada.nextFloat();
		float altura = entrada.nextFloat();
		System.out.println("A �rea do quadrado �: "+base*altura);
	}
	
	public static void ex8() {
		System.out.println("Quanto voc� ganha por hora? ");
		float salarioHora = entrada.nextFloat();
		System.out.println("Quantos horas trabalha por m�s?");
		float horasMes = entrada.nextFloat();
		System.out.println("Seu sal�rio no m�s ser�: "+salarioHora*horasMes);
	}
	
	public static void ex9() {
		System.out.print("Digite a temperatura em Farenheit: ");
		float temp = entrada.nextFloat();
		System.out.println("A temperatura em Celsius �: "+(temp-32)/1.8);
	}
	
	public static void ex10() {
		System.out.println("Digite dois n�meros inteiros e um real: ");
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		float num3 = entrada.nextFloat();
		System.out.println("O produto do dobro do primeiro com metade do segundo �: " + (num1*2)*(num2/2) );
		System.out.println("A soma do triplo do primeiro com o terceiro �: " + (num1*3)+num3);
		System.out.print("O terceiro elevado ao cubo �: " + num3*num3*num3);
	}
	
	public static void ex11() {
		System.out.println("Digite a sua altura: ");
		float altura = entrada.nextFloat();
		System.out.println("O seu peso ideal � "+((72.7*altura)-58)+" kilos");
	}
	
	public static void ex12() {
		System.out.println("Digite a sua altura: ");
		float altura = entrada.nextFloat();
		System.out.println("Informe seu sexo (1 - Homem / 2 - Mulher): ");
		int sexo = entrada.nextInt();
		if (sexo == 1) {
			System.out.println("O seu peso ideal � "+((72.7*altura)-58)+" kilos.");
		}
		else if(sexo == 2) {
			System.out.println("O seu peso ideal � "+((62.1*altura)-44.7)+" kilos.");
		}
		else
			System.out.println("Digite uma op��o de sexo v�lida.");
	}
	
	public static void ex13() {
		System.out.println("Digite o peso total dos peixes: ");
		float peso = entrada.nextFloat();
		if (peso>50) {
			float excesso = peso-50;
			System.out.println("O peso foi excedido em "+excesso+" kilos");
			float multa = excesso*4;
			System.out.println("A multa � de "+multa+" reais.");
		}
		else 
			System.out.println("N�o houve excesso de peso, Boa Pesca!");
	}
	
	public static void ex14() {
		System.out.println("Ganhos por hora: ");
		float salarioHora = entrada.nextFloat();
		System.out.println("N�mero de horas trabalhadas no m�s: ");
		float horasMes = entrada.nextFloat();
		
		float salarioBruto = salarioHora*horasMes;
		float salarioLiquido = (float) (salarioBruto*0.76);
		System.out.println("Salario Bruto: "+salarioBruto);
		System.out.println("Pago ao sindicato: "+salarioBruto*0.05);
		System.out.println("Pago ao INSS: "+salarioBruto*0.08);
		System.out.println("Sal�rio l�quido: "+salarioLiquido);	
	}
	
	public static void ex15() {
		System.out.println("Quantos metros quadrados ser�o pintados?");
		float metros = entrada.nextFloat();
		float litros = metros/3;
		
		int latas = (int) ((litros/18)+1);
		System.out.println("N�mero de latas nescess�rias: "+latas);
		System.out.println("Pre�o total: "+(latas*80)+" reais");
	}
	
	public static void ex16() {
		System.out.println("Quantos metros quadrados ser�o pintados?");
		double metros = entrada.nextDouble();
		double litros = metros/6;
		
		double latas = Math.round(litros/18);
		System.out.println("N�mero de latas de 18 litros nescess�rias: "+latas); 
		System.out.println("Pre�o comprando latas de 18 litros: "+(latas*80)+" reais");
		
		double galoes = Math.round(litros/3.6);
		System.out.println("N�mero de gal�es nescess�rios: "+galoes);
		System.out.println("Pre�o comprando gal�es de 3,6 litros: "+(galoes*25)+" reais");
	}
	
}
