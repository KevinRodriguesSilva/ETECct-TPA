package prjApostila36;
import java.util.Scanner;
public class Temperatura {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		double F,C;
		
		System.out.print("Digite a tem�ratura em Fahrenheit: ");
		F=in.nextDouble();
		
		C= (F-32)/1.8;
		
		if (C<15){
			System.out.print("A temperatura em graus celsius � de "+C+"�C,caracterizando um clima frio");
		}else { 
			if(C>22){
				System.out.print("A temperatura em graus celsius � de "+C+"�C,caracterizando um clima quente");
		}else {
			System.out.print("A temperatura em graus celsius � de "+C+"�C,caracterizando um cilma ameno");
			

			}

		}
		
	}	
		
}
