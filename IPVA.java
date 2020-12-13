package prjLista;

import java.util.Scanner;

public class IPVA {

	public static void main(String[] args) {
		double V, IPVA;
		Scanner in = new Scanner(System.in);
		  
		System.out.println("Digite valor o do seu carro:");
		V= in.nextInt();
		
		IPVA= V*4/100;
		
		System.out.println("O valor do IPVA é: "+IPVA);
		
		
		

	}

}
