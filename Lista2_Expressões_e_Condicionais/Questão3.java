package Lista2_Express�es_e_Condicionais;

import java.util.Scanner;

/*3. Fa�a um programa que recebe do usu�rio um n�mero e verificar se ele est� entre 0 e 10, 
inclusive.
*/

public class Quest�o3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double num;
		
		System.out.printf("Digite um n�mero entre 0 e 10:");
		num = leia.nextDouble();
		
		if ( num>=0 && num<=10 )
		{
			System.out.printf("O n�mero %.2f est� entre 0 e 10.", num);
		}
		else
		{
			System.out.printf("O n�mero %.2f n�o est� entre 0 e 10.", num);
		}
		
		System.out.printf("\nFim do programa.");
	}

}
