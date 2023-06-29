package Lista2_Expressões_e_Condicionais;

import java.util.Scanner;

/*5. Faça um programa que verifica se a letra digitada pelo usuário é vogal ou consoante.
*/

public class Questão5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		char letra;
		
		System.out.printf("Digite uma letra:");
		letra = leia.next().charAt(0);
		
		if (letra == 'a' || letra == 'A' || letra == 'e' || letra == 'E' || letra == 'i' 
		   || letra == 'I' || letra == 'o' || letra == 'O' || letra == 'u' || letra == 'U')
		{
			System.out.printf("A letra %c é uma vogal.", letra);
		}
		else
		{
			System.out.printf("A letra %c é uma consoante", letra);	
		}
		
		System.out.printf("\nFim do programa.");
		
	}

}
