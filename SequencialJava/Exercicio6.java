package SequencialJava;

import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double x1,x2,y1,y2,d;
		
		System.out.println("\nEntre com o valor de x1: ");
		x1 = leia.nextDouble();
		System.out.println("\nEntre com o valor de x2: ");
		x2 = leia.nextDouble();
		System.out.println("\nEntre com o valor de y1: ");
		y1 = leia.nextDouble();
		System.out.println("\nEntre com o valor de y2: ");
		y2 = leia.nextDouble();
		
		d = Math.sqrt((Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2)));
		
		System.out.printf("\nDistancia entre os dois pontos: %.1f",d);
	}

}
