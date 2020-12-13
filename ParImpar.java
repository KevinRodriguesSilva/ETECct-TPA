package prjTpa_If_Else;

import java.util.Scanner;

public class ParImpar {
	

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int N;
		
		System.out.println("Digite número inteiro");
		N=in.nextInt();
		
		if (N % 2 == 0) {
			System.out.println("Seu número "+N+" é par");	
		} else {
			System.out.println("Seu número "+N+" é ímpar");
		}
		
	}

}
