package exercicio;
import java.util.Scanner;
public class Idade {

	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		int Dn, Da, idade, i;
		i=1;
		
	
		while (i<=5) {
			System.out.println("\n**Inicio do programa**");

			System.out.println("\nDigite sua data de nascimento: ");
			Dn= in.nextInt();
			
			System.out.println("Digite a data atual: ");
			Da= in.nextInt();
			
			idade= Da- Dn;
			System.out.println("Sua idade é: "+idade);
		
		if (idade>=18) {
			System.out.println("Você é maior de idade");
		}else {
			System.out.println("Você ainda é menor de idade");
			
		}
		System.out.println("**Fim do programa**");
		i++;
		}
		
	}
}
