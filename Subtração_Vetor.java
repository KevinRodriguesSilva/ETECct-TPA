package prjVetores;
import java.util.Scanner;
public class Subtração_Vetor {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a [] = new int [TAM];
		int b [] = new int [TAM];
		int c [] = new int [TAM];
		
		for(int i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º número do item A: ");
			a [i] = in.nextInt();
			
			
		}
		for(int i=0; i<TAM; i++) {
		System.out.println("Digite o "+(i+1)+"º número do item B: ");
		b [i] = in.nextInt();
		}
		for(int i=0; i<TAM; i++) {
			c [i] = (a [i] - b[i]);
			System.out.println(+ a [i] +" - "+ b [i]+" = "+ c [i]);
			
		}
		
		
		
		
		
		
		
	}

}
