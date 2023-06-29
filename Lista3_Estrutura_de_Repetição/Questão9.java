package Lista3_Estrutura_de_Repetição;

import java.util.Scanner;

/*9. Faça um programa para uma calculadora simples que solicita ao usuário dois operandos como
entrada, seleciona uma das opções da lista (1- soma, 2- produto, 3- divisão, 4- potência) e exibe
o resultado. O algoritmo deve executar repetidamente até que os dois operandos informados
sejam iguais a zero. */

public class Questão9 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int calculadora, num1, num2, resultado=1;
		
		do
		{
			System.out.printf("Digite um número:");
			num1 = leia.nextInt();
			
			System.out.printf("Digite outro número:");
			num2 = leia.nextInt();
			
			System.out.printf("Digite 1- Soma, 2- Multiplicação, 3- Divisão, 4- Potência:");
			calculadora = leia.nextInt();
			
			switch ( calculadora )
			{
				case 1:
					System.out.printf("A soma é: %d.\n", num1 + num2);
					break;
				case 2:
					System.out.printf("A multiplicação é: %d.\n", num1 * num2);
					break;
				case 3:
					System.out.printf("A divisão é: %d.\n", num1/num2);
					break;
				case 4:
					resultado = 1;
					for (int i=num2; i>=1;i--)
					{
						resultado = resultado * num1;
					}
					System.out.printf("A potência é: %d.\n", resultado);
					break;
				default:
					System.out.printf("A opção digitada é inválida.\n");
			}
		}while ( num1 != 0 && num2 != 0 );
	}

}
