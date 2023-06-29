package Lista2_Expressões_e_Condicionais;

import java.util.Scanner;

/*7. Faça um programa que receba do usuário seu peso e altura, calcular o IMC (Índice de Massa 
Corporal). Exiba na tela qual a classificação da pessoa de acordo com a seguinte tabela:
IMC CLASSIFICAÇÃO
MENOR QUE 18,5 MAGREZA
ENTRE 18,5 E 24,9 NORMAL
ENTRE 25,0 E 29,9 SOBREPESO
ENTRE 30,0 E 39,9 OBESIDADE
MAIOR QUE 40,0 OBESIDADE GRAVE
Utilize a seguinte fórmula: IMC = peso / altura*2.*/

public class Questão7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double peso, altura, imc;
		
		System.out.printf("Digite o peso(Kg):");
		peso = leia.nextDouble();
		
		System.out.printf("Digite a altura(metros):");
		altura = leia.nextDouble();
		
		imc = (peso / (altura*altura));
		
		if ( imc<18.5 )
		{
			System.out.printf("A pessoa com imc %.2f está associada a classificação magreza.", imc);
		}
		else
		{
			if ( imc>=18.5 && imc<=24.9 )
			{
				System.out.printf("A pessoa com imc %.2f está associada a classificação normal.", imc);
			}
		    else
			{
				if ( imc>=25.0 && imc<=29.9 )
				{
					System.out.printf("A pessoa com imc %.2f está associada a classificação sobrepeso.", imc);
				}
				else
				{
					if ( imc>=30.0 && imc<=39.9 )
					{
						System.out.printf("A pessoa com imc %.2f está associada a classificação obesidade.", imc);
					}
					else
					{
						System.out.printf("A pessoa com imc %.2f está associada a classificação obesidade grave", imc);
					}
				}
			}
		}
		System.out.printf("\nFim do programa.");
	}

}
