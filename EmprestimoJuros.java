package prjLista;

import java.util.Scanner;

public class EmprestimoJuros {
	
	public static void main(String[] args) {
		double E, P, Vt;
		int QM;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite valor do empréstimo: ");
		E= in.nextInt();
		
		System.out.println("Digite a quantidade de meses que o valor será parcelado: ");
		QM= in.nextInt();
	
		P= E/QM+(E*2.5/100);
		
		System.out.println("O valor das parcelas é: "+P);
		
		Vt=E+(E+2.5/100*QM);

		System.out.println("O valor total que deve ser pago é : "+Vt);
		
	}
}
