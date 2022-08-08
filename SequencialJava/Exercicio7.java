package SequencialJava;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double a,b,c,d,e,f,x,y;
		
		System.out.println("\nA: ");
		a = leia.nextDouble();
		System.out.println("\nB: ");
		b = leia.nextDouble();
		System.out.println("\nC: ");
		c = leia.nextDouble();
		System.out.println("\nD: ");
		d = leia.nextDouble();
		System.out.println("\nE: ");
		e = leia.nextDouble();
		System.out.println("\nF: ");
		f = leia.nextDouble();
		
		x = c+e - b+f/a+e - b+d;
		y = a+f - c+d/a+e - b+d;
		
		System.out.println("\nResultado de X: "+x);
		System.out.println("\nResultado de Y: "+y);

	}

}
