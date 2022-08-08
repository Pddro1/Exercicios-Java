package SequencialJava;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int dias,meses,anos;
		
		System.out.println("\nEscreva sua idade em Dias: ");
		dias = leia.nextInt();
		
		anos = dias/365;
		meses = dias % 365 / 30;
		dias = dias % 365 % 30;
		
		System.out.println("\nAnos: "+anos);
		System.out.println("\nMeses: "+meses);
		System.out.println("\nDias: "+dias);

	}

}
