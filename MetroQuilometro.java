package prjLista;

import java.util.Scanner;

public class MetroQuilometro {
	
	public static void main(String[] args) {
        double M, Q;
		Scanner in = new Scanner(System.in);
		  
		System.out.println("Digite os metros");
		M= in.nextInt();
		
		Q= M/1000;
		
		System.out.println("O valor em quilômetros de "+M+" é: "+Q);
		
	}
}
