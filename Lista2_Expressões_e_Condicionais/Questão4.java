package Lista2_Expressões_e_Condicionais;

import java.util.Scanner;

/*4. Faça um programa que recebe do usuário 3 números e exibir o maior deles.*/

public class Questão4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double num1, num2, num3;
		
		System.out.printf("Digite um número:");
		num1 = leia.nextDouble();
		
		System.out.printf("Digite outro número:");
		num2 = leia.nextDouble();
		
		System.out.printf("Digite mais um número:");
		num3 = leia.nextDouble();
		
		if ( num1>num2 && num1>num3 )
		{
			System.out.printf("O número %.2f é o maior deles.", num1);
		}
		else
		{
			if ( num2>num1 && num2>num3 )
			{
				System.out.printf("O número %.2f é o maior deles", num2);
			}
			else
			{
				System.out.printf("O número %.2f é o maior deles", num3);
			}
		}
		System.out.printf("\nFim do programa.");

	}

}
