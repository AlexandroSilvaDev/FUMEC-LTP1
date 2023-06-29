package Lista3_Estrutura_de_Repetição;

import java.util.Scanner;

/*8. Faça um programa que solicita ao usuário um número real positivo. Verifique se o número é
realmente positivo, e em caso contrário solicite ao usuário digitar novamente (este processo pode
se repetir inúmeras vezes e é chamado de consistência, pois garante que o número será válido
após a entrada de dados).*/

public class Questão8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double num;
		
		do
		{
			System.out.printf("Digite um número real positivo:");
			num = leia.nextDouble();
			
		}while ( num < 0 );

	}

}
