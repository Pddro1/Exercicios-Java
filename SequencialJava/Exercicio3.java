package SequencialJava;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int h,m,s;
		
		System.out.println("\nDuracao do Evento: ");
		s = leia.nextInt();
		
		h=s/3600;
		m=s%3600/60;
		s=s%3600%60;
		System.out.println("\nA duracao do evento foi de: "+h+" Hora(s) "+m+" Minuto(s) e "+s+" Segundo(s) ");

	}

}
