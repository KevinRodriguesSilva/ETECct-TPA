package prjApostila36;
import java.util.Scanner;
public class Sal�rio {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double S;
		
		System.out.print("Digite seu sal�rio: ");
		S=in.nextDouble();
		
		if (S>954) {
			System.out.print("Seu sal�rio est� acima do sal�rio m�nimo atual, que � de R$954,00");
		} else {
			System.out.print("Seu sal�rio est�  abaixo do sal�rio m�nimo atual, que � de R$954,00");
		}
		

	}

}
