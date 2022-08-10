package Arrays;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float[][] m1 = new float[2][2];
		float[][] m2 = new float[2][2];
		float[][] m3 = new float[2][2];
		float[][] m4 = new float[2][2];
		int i,j;
		
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				System.out.println("\nNumero Matriz 1: ");
				m1[i][j] = leia.nextFloat();
				System.out.println("\nNumero Matriz 2: ");
				m2[i][j] = leia.nextFloat();
				
				m3[i][j] = m1[i][j] + m2[i][j];
				m4[i][j] = m1[i][j] - m2[i][j];
			}
		}
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				System.out.println("\nValor da Matriz 3: "+m3[i][j]);
				System.out.println("\nValor da Matriz 4: "+m4[i][j]);
			}
		}
	}

}
