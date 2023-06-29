package Lista2_Expressões_e_Condicionais;

import java.util.Scanner;

/*1. Faça um programa que solicita ao usuário um número inteiro e exibe este na tela. Se o número 
for negativo, antes de ser exibido, ele deve ser transformado no equivalente positivo. */

public class Questão1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int Num;
		
		System.out.printf("Digite um número inteiro:");
		Num = leia.nextInt();
		
		if ( Num<0 )
		{
			System.out.printf("O número digitado foi: %d", Num*(-1) );
		}
		else
		{
			System.out.printf("O número digitado foi: %d", Num);
		}
		
		System.out.printf("\nFim do programa.");
	}

}
