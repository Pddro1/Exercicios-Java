package Arrays;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float[][] m1 = new float[2][2];
		float[][] m2 = new float[2][2];
		float[][] m3 = new float[2][2];
		int i,j,num,op;
		
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				System.out.println("\nEntre com o valor da matriz 1:");
				m1[i][j] = leia.nextFloat();
				System.out.println("\nEntre com o valor da matriz 2: ");
				m2[i][j] = leia.nextFloat();
			}
		}
		do {
			System.out.println("\n\t\tMenu de Matrizes");
			System.out.println("\n1- Somar as duas matrizes");
			System.out.println("\n2- Subtrair a primeira matrzi da segunda");
			System.out.println("\n3- Adcionar uma constante nas duas matrizes");
			System.out.println("\n4- Imprimir as matrizes");
			System.out.println("\n0- Sair do programa");
			System.out.println("\nDigite a sua opcao: ");
			op = leia.nextInt();
			
			switch(op) {
			
			case 1:
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						m3[i][j] = m1[i][j] + m2[i][j];
						System.out.println("\nSoma: "+m3[i][j]);
					}
				}
				break;
			case 2:
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						m3[i][j] = m1[i][j] - m2[i][j];
						System.out.println("\nDiferença: "+m3[i][j]);
					}
				}
				break;
			case 3:
				System.out.println("\nLeia um Numero: ");
				num = leia.nextInt();
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						m1[i][j] += num;
						m2[i][j] += num;
						System.out.println("\nMatriz1 mais o numero: "+m1[i][j]);
						System.out.println("\nMatriz2 mais o numero: "+m2[i][j]);
					}
				}
				break;
			case 4:
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						System.out.println("\nMatriz1: "+m1[i][j]);
						System.out.println("\nMatriz2: "+m2[i][j]);
					}
				}
				break;
			case 0:
				System.out.println("\nMuito obrigado por utilizar nosso programa!!");
				break;
				default:
					System.out.println("\nOpcao Invalida!");
					
			}
		}while(op!=0);

	}

}