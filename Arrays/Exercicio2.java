package Arrays;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int[] num = new int[6];
		int contPar=0,somaPar=0,contImpar=0,somaImpar=0;
		int x;
		
		for(x=0;x<6;x++) {
			System.out.println("\nEntre com um numero: ");
			num[x] = leia.nextInt();
			if(num[x]%2==0) {
				contPar++;
				somaPar+=num[x];
			}
			else {
				contImpar++;
				somaImpar+=num[x];
			}
		}
		System.out.println("\nQuantidade de numeros Pares: "+contPar);
		System.out.println("\nQuantidade de numeros Impares: "+contImpar);
		System.out.println("\nSoma dos numeros Pares: "+somaPar);
		System.out.println("\nSoma dos numeros Impares: "+somaImpar);

	}

}
