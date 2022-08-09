package RepeticaoJava;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num,x,contPar=0,contImpar=0;
		
		for(x=0;x<10;x++) {
			
			System.out.println("\nEntre com um numero: ");
			num = leia.nextInt();
			
			if(num %2==0) {
				contPar++;
		}
			else {
				contImpar++;
			}
		}
		System.out.println("\nQuantidade de numeros pares: "+contPar);
		System.out.println("\nQuantidade de numeros impares: "+contImpar);
	}
}
