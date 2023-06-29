package Lista2_Expressões_e_Condicionais;

import java.util.Scanner;

/*8. A prefeitura de Cafundodojudas abriu uma linha de credito para os funcionários. O valor máximo 
da prestação não poderá ultrapassar 30% do salário bruto. Fazer um algoritmo onde o usuário 
informa seu salário bruto e o valor da prestação e o programa exibe na tela se o empréstimo 
pode ou não ser concedido.
*/

public class Questão8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float salarioB, valorP;
		
		System.out.printf("Digite o sálario bruto de um funcionário:");
		salarioB = leia.nextFloat();
		
		System.out.printf("Digite o valor de prestação de um funcionário:");
		valorP = leia.nextFloat();
		
		if ( valorP <= salarioB * 0.30 )
		{
			System.out.printf("\nO empréstimo pode ser concedido.");
		}
		else
		{
			System.out.printf("\nO empréstimo não pode ser concedido.");
		}
		System.out.printf("\n\nFim do programa.");

	}

}
