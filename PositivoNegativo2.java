package prjApostila36;
import java.util.Scanner;
public class PositivoNegativo2 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		double N;
		
		System.out.print("Digite o número: ");
		N=in.nextDouble();
		
		if(N==0) {
			System.out.print(N+" É um número nulo");
		}else {
		if(N>0){
			System.out.print(N+" É número positivo");
		}else {
			System.out.print(N+" É um número negativo");
		}

		}
	}

}
