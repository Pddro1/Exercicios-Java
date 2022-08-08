package SequencialJava;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int a,b,c;
		double d;
		
		System.out.println("\nA = ");
		a = leia.nextInt();
		System.out.println("\nB = ");
		b = leia.nextInt();
		System.out.println("\nC = ");
		c = leia.nextInt();
		
		d = (Math.pow((a+b), 2) + Math.pow((b+c), 2))/2;
		System.out.println("\nValor de D: "+d);

	}

}
