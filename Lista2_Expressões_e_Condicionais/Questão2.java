package Lista2_Expressões_e_Condicionais;

import java.util.Scanner;

/*2. Faça um programa que solicita ao usuário um valor inteiro e exibe uma mensagem informando se 
o número é par ou ímpar.*/

public class Questão2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num;
		
		System.out.printf("Digite um número inteiro:");
		num = leia.nextInt();
		
		if ( num%2 == 0 )
		{
			System.out.printf("O número %d é par.", num);
		}
		else
		{
			System.out.printf("O número %d é ímpar.", num);
		}
		
		System.out.printf("\nFim do programa.");
	}

}
