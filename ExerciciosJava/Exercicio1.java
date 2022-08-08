package ExerciciosJava;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num=0,maiorn=0;
		
		do {
			
			System.out.println("\nDigite um numero: ");
			num = leia.nextInt();
				
			if(maiorn<num) {
				maiorn=num;
				}
				
		}while(num!=0); 
				
			System.out.println("\nMaior Numero: "+maiorn);
		
		
		
	
	}
	
}
	


