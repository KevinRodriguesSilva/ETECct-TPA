package prjApostila36;
import java.util.Scanner;
public class PositivoNegativo2 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		double N;
		
		System.out.print("Digite o n�mero: ");
		N=in.nextDouble();
		
		if(N==0) {
			System.out.print(N+" � um n�mero nulo");
		}else {
		if(N>0){
			System.out.print(N+" � n�mero positivo");
		}else {
			System.out.print(N+" � um n�mero negativo");
		}

		}
	}

}
