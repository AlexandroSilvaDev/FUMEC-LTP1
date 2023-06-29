package LTP1;

import java.util.Scanner;

public class RSC8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float opçaoParcelamento, valorParcela; 
		
		System.out.printf("Informe a melhor OPÇÃO de parcelamento:  ");
		opçaoParcelamento = leia.nextFloat();
		
		if (opçaoParcelamento == 1)
		{
			valorParcela = 2000;
		}
		else
		{
			if (opçaoParcelamento == 3)
			{
				valorParcela = 2500 * 1.10f;
			}
			else
			{
				if (opçaoParcelamento == 6)
				{
					valorParcela = 3000 * 1.15f;
				}
				else
				{
					if (opçaoParcelamento == 9)
					{
						valorParcela = 3500 * 1.20f;
					}
					else
					{
						valorParcela = 4000 * 1.25f;
					}
					System.out.printf("Valor da parcela: %.2f.", valorParcela);
				}
			}
		}
	}

}
