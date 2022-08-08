package ExerciciosJava; 

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] num = new int[3];
		
		System.out.println("\nDigite o Primeiro numero: ");
		num[1] = leia.nextInt();
		
		System.out.println("\nDigite o Segundo numero: ");
		num[2] = leia.nextInt();
		
		System.out.println("\nDigite o Terceiro numero: ");
		num[3] = leia.nextInt();
		
		
		System.out.println(num[3]);

	}

}
