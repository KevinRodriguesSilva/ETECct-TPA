package prjTpa_If_Else;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		double N;
		
		System.out.println("Digite n�mero inteiro");
		N=in.nextInt();
		if (N>0) {
			System.out.println("O n�mero "+N+" � positivo");	
		} else {
			System.out.println("O n�mero "+N+" � negativo");
		}
		
	}

}

