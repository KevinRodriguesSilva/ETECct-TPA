package exercicio;
import java.util.Scanner;
public class Tabuada {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
			int i, N,T;
			i=0;
			System.out.println("Digite número inteiro");
			N=in.nextInt();
			System.out.println("\nTabuada do "+N);

			
			while (i<=10) {
				
			T=i*N;
			System.out.println(i+" X "+N+"="+T);

				i++;
				}

		}

	}
