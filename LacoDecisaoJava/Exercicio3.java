package ExerciciosJava;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int i=0,inf,juv,adu;
	
		
		System.out.println("\nEscreva sua Idade: ");
		i = leia.nextInt();
		
		if(i>=10 && i<=14) {
			System.out.println("\nInfantil");
		}
		else if(i>=15 && i<=17) {
			System.out.println("\nJuvenil");
		}
		else if(i>=18 && i<=25) {
			System.out.println("\nAdulto");
		}
		else {
			System.out.println("\nIdade Invalida");
		}
		
	}

}
