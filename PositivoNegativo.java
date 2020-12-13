package prjTpa_If_Else;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		double N;
		
		System.out.println("Digite número inteiro");
		N=in.nextInt();
		if (N>0) {
			System.out.println("O número "+N+" é positivo");	
		} else {
			System.out.println("O número "+N+" é negativo");
		}
		
	}

}

