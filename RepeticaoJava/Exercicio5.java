package RepeticaoJava;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num,somaNum=0,x;
		
		do {
			
			System.out.println("\nEntre com um numero de 1 a 9: ");
			num = leia.nextInt();
			somaNum+=num;
		
	}while(num!=0);
		
		System.out.println("\nSoma dos Numeros: "+somaNum);

	}

}
