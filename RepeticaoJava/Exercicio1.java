package RepeticaoJava;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int num;
		
		for(num=1000;num<=1999;num++) {
			if(num%11==5) {
				System.out.println("\nNumero: "+num);
			}
		}

	}

}
