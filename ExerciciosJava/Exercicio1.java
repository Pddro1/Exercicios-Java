package ExerciciosJava;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num,maiorn=0;
		
		System.out.println("\nDigite o Primeiro Numero: ");
		num = leia.nextInt();
		System.out.println("\nDigite o Segundo Numero: ");
		num = leia.nextInt();		
		System.out.println("\nDigite o Terceiro Numero: ");
		num = leia.nextInt();
		
		if(num>maiorn) {
			maiorn=num;
		}
		
		System.out.println("\nMaior Numero: "+maiorn);
	}
	
}

	


