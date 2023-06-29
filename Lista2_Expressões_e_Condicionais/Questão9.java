package Lista2_Expressões_e_Condicionais;

import java.util.Scanner;

/*9. Faça um programa que receba do usuário dois números reais (a e b). Após isso, o programa 
deve exibir na tela o seguinte menu:
Digite 1 para somar.
Digite 2 para subtrair.
Digite 3 para multiplicar.
Digite 4 para dividir.
Digite 5 para sair.
De acordo com a opção do usuário, o programa vai imprimir na tela o resultado de a+b, a-b, a*b 
ou a/b.*/

public class Questão9 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double a, b;
		int menu;
		
		System.out.printf("Digite um número:");
		a = leia.nextDouble();
		
		System.out.printf("Digite outro número:");
		b = leia.nextDouble();
		
		System.out.printf("\nDigite:\n1-somar, 2-subtrair, 3-multiplicar, 4-dividir, 5-sair:");
		menu = leia.nextInt();
		
		switch (menu)
		{
			case 1:
				System.out.printf("\nA soma dos números é: %.2f. ", a + b);
				break;
			case 2:
				System.out.printf("\nA subtração dos números é: %.2f.", a - b);
				break;
			case 3:
				System.out.printf("\nA multiplicação dos números é: %.2f.", a * b);
				break;
			case 4:
				System.out.printf("\nA divisão dos números é: %.2f.", a / b);
				break;
			case 5:
				System.out.printf("\nSair do programa.");
				break;
			default:
				System.out.printf("\nOpção inválida.");
				break;
		}
		System.out.printf("\n\nFim do programa.");

	}

}
