package LacoDecisaoJava; 

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a,b,c;
		
		System.out.println("\nEntre com o A: ");
		a = leia.nextDouble();
		System.out.println("\nEntre com o B: ");
		b = leia.nextDouble();
		System.out.println("\nEntre com o C: ");
		c = leia.nextDouble();
		
		if(a<b && b<c) {
			System.out.println("\n1-Ordem crescente: "+a+", "+b+", "+c);
		}
		else if (a<c && c<b) {
			System.out.println("\n2-Ordem crescente: "+a+", "+c+", "+b);
		}
		else if(b<a && a<c) {
			System.out.println("\n3-Ordem crescente: "+b+", "+a+", "+c);
		}
		else if(b<c && c<a) {
			System.out.println("\n4-Ordem crescente: "+b+", "+c+", "+a);
		}
		else if(c<a && a<b) {
			System.out.println("\n5-Ordem crescente: "+c+", "+a+", "+b);
		}
		else {
			System.out.println("\n6-Ordem crescente: "+c+", "+b+", "+a);
		}

	}

}
