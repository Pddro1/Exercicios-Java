package RepeticaoJava;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade,genero,fp,contpc=0,contmn=0,contha=0,contbc=0,contpn40=0,contpc18=0,p=1;
		
		while(p<=5) {
			System.out.println("\nEntre com a sua idade: ");
			idade = leia.nextInt();
			System.out.println("\nEntre com o seu genero: \n1-Feminino\n2-Masculino\n3-Binario");
			genero = leia.nextInt();
			System.out.println("\n1-Calma\n2-Nervosa\n3-Agressiva");
			fp = leia.nextInt();
			
			if(fp==1) {
				contpc++;
			}
			if(genero==1 && fp==2) {
				contmn++;
			}
			if(genero==2 && fp==3) {
				contha++;
			}
			if(genero==3 && fp==1) {
				contbc++;
			}
			if(fp==2 && idade>40) {
				contpn40++;
			}
			if(fp==1 && idade<18) {
				contpc18++;
			}
			p++;
		}
		System.out.println("\nNumero de pessoas calmas: "+contpc);
		System.out.println("\nNumero de mulheres nervosas: "+contmn);
		System.out.println("\nNumero de homens agressivos: "+contha);
		System.out.println("\nNumero de binarios calmos: "+contbc);
		System.out.println("\nNumero de pessoas com mais de 40 anos nervosa: "+contpn40);
		System.out.println("\nNumero de pessoas com menos de 18 anos calma: "+contpc18);

	}

}
