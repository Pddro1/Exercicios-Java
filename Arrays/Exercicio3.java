package Arrays;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int i,j,contNum=0;
		
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.println("\nEntre com um numero: ");
				matriz[i][j] = leia.nextInt();
				if(matriz[i][j]>=10) {
					contNum++;
				}
			}
		}
		System.out.println("\nQauntidade de numeros maiores que 10: "+contNum);

	}

}
