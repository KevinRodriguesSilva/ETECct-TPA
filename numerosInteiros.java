package prjLista;

import java.util.Scanner;

public class numerosInteiros {

	public static void main(String[] args) {
		int A, B, C, R;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero");
		A= in.nextInt();
		
		A= A*A;
		
		System.out.println("Digite o segundo n�mero");
		B= in.nextInt();
		
		B= B*B;
		
		System.out.println("Digite o segundo n�mero");
		C= in.nextInt();
		
		C= C*C;
		
		R= A+B+C;
		
		System.out.println("A soma dos tr�s n�meros elevados ao quadrado �:"+R);
	

	}

}
