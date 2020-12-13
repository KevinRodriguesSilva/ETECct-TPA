package prjLista;

import java.util.Scanner;

public class ProdutoDesconto {

	public static void main(String[] args) {
		double P, Pd;
		int D;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto em: ");
		P= in.nextInt();
		
		System.out.println("Digite o valor do desconto: ");
		D= in.nextInt();
		
		
		Pd= P-P*D/100;
		
		System.out.println("O valor do produto com seu desconto é de: R$"+Pd);
		

	}

}
