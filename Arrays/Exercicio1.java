package Arrays;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int[] num = {1, 0, 5, -2, -5, 7};
		int a,soma=0;
		
		System.out.println("\nModifique o Valor: ");
		num[3] = leia.nextInt();
		
		for(a=0;a<6;a++) {
			System.out.println(""+num[a]);
			soma=num[0]+num[1]+num[5];
			
		}
		System.out.println("\nSoma: "+soma);

	}

}
