package RepeticaoJava;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		float media;
		int num,somaMulti3=0,contMulti3=0;
		
		do {
			System.out.println("\nEntre com um numero: ");
			num = leia.nextInt();
			if(num==0) {
				System.out.println("\nVolte Sempre!");
			}
			else {
				if(num%3==0) {
					somaMulti3+=num;
					contMulti3++;
				}
			}
			
		}while(num!=0);
		if(contMulti3==0) {
			System.out.println("Nao e possivel dividir por ZERO!");
		}
		else {
			media = somaMulti3/contMulti3;
			System.out.println("\nMedia dos numeros multiplos de 3: "+media);
		}
	}
}