package prjVetores;
import java.util.Scanner;
public class Vetores10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a [] = new int [TAM];
		int b [] = new int [TAM];
		
		
		for(int i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"� n�mero: ");
			a [i] = in.nextInt();
			b [i] = (a [i] * a[i]);
		}
		
			System.out.println("Os quadrados dos n�meros: ");
		for(int i=0; i<TAM; i++) {
			System.out.println("O quadrado do "+(i+1)+"� n�mero �: "+b[i]);
		}
		
			System.out.println("Fim do programa");
		
		
	}

}
