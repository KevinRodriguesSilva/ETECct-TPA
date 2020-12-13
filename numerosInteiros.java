package prjLista;

import java.util.Scanner;

public class numerosInteiros {

	public static void main(String[] args) {
		int A, B, C, R;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número");
		A= in.nextInt();
		
		A= A*A;
		
		System.out.println("Digite o segundo número");
		B= in.nextInt();
		
		B= B*B;
		
		System.out.println("Digite o segundo número");
		C= in.nextInt();
		
		C= C*C;
		
		R= A+B+C;
		
		System.out.println("A soma dos três números elevados ao quadrado é:"+R);
	

	}

}
