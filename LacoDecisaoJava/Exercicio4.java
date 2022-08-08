package LacoDecisaoJava;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double num;
		
		
		System.out.println("\nEntre com um numero: ");
		num = leia.nextDouble();
		
		if(num%2==0) {
			num = Math.sqrt(num);
			System.out.println("\nRaiz Quadrada: "+num);
		}
		else if(num%1==0) {
			num = Math.pow(num, 2);
			System.out.println("\nPotencia: "+num);
		}

	}

}
