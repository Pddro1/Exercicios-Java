package SequencialJava;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade,anos,meses,dias,totaldias;
		
		System.out.println("\nAnos: ");
		anos = leia.nextInt();
		System.out.println("\nMeses: ");
		meses = leia.nextInt();
		System.out.println("\nDias: ");
		dias = leia.nextInt();
		
		totaldias = (anos*365+meses*30+dias);
		System.out.println("\nIdade em Dias: "+totaldias);
		

	}

}
