package Lista2_Expressões_e_Condicionais;

import java.util.Scanner;

/*3. Faça um programa que recebe do usuário um número e verificar se ele está entre 0 e 10, 
inclusive.
*/

public class Questão3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double num;
		
		System.out.printf("Digite um número entre 0 e 10:");
		num = leia.nextDouble();
		
		if ( num>=0 && num<=10 )
		{
			System.out.printf("O número %.2f está entre 0 e 10.", num);
		}
		else
		{
			System.out.printf("O número %.2f não está entre 0 e 10.", num);
		}
		
		System.out.printf("\nFim do programa.");
	}

}
