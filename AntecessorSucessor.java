package prjLista;

import java.util.Scanner;

public class AntecessorSucessor {
	
	public static void main(String[] args) {
		double N, Ant, Sucs;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um número");
		N= in.nextInt();
		
		Ant= N-1.5;
		
		Sucs= N+1.5;
		
		System.out.println("O antecessor de " +N+ " é: " +Ant);
		System.out.println("O Sucessor de "+N+ " é: " +Sucs);
		
	}	
		

}
