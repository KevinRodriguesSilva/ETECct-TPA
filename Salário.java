package prjApostila36;
import java.util.Scanner;
public class Salário {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double S;
		
		System.out.print("Digite seu salário: ");
		S=in.nextDouble();
		
		if (S>954) {
			System.out.print("Seu salário está acima do salário mínimo atual, que é de R$954,00");
		} else {
			System.out.print("Seu salário está  abaixo do salário mínimo atual, que é de R$954,00");
		}
		

	}

}
