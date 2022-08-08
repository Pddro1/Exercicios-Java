package SequencialJava;

import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		double n1,n2,n3,mp;
		
		System.out.println("\nNome do Alune: ");
		nome = leia.next();
		System.out.println("\nNota do 1 Bimestre: ");
		n1 = leia.nextDouble();
		System.out.println("\nNota do 2 Bimestre: ");
		n2 = leia.nextDouble();
		System.out.println("\nNota do 3 Bimestre: ");
		n3 = leia.nextDouble();
		
		mp = (n1*2+n2*3+n3*5)/10;
		
		System.out.println("\nMedia do Aluno: "+mp);
		
		if(mp>=7) {
			System.out.println("\nAlune Aprovade!!");
		}
		else {
			System.out.println("\nAlune Reprovade :(");
		}
	}

}
