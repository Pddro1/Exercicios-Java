package SequencialJava;

import java.util.Scanner;
public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double cf,pd,pi,ct;
		System.out.println("\nCusto de Fabrica do Veiculo: ");
		cf = leia.nextDouble();
		
		pd = 0.28*cf;
		pi = 0.45*cf;
		ct = cf+pd+pi;
		
		System.out.printf("\nCusto do Distribuidor: %.2f",pd);
		System.out.println("\nValor dos Impostos: "+pi);
		System.out.println("\nCusto do Consumidor: "+ct);
		
		

	}

}
