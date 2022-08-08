package OlaMundo;

import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
		
		String nome = "Pedro Henrique";
		int idade = 20,op;
		double altura = 1.70,n1,n2,n3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nVamos Apresentar os dados do Pedro");
		System.out.println("\nNome do Participante: "+nome);
		System.out.println("\nIdade do Participante: "+idade+" Anos");
		System.out.println("\nAltura do Participante: "+altura);

		System.out.println("\nEntre com a Primeira Nota: ");
		n1 = leia.nextDouble();
		System.out.println("\nEntre com a Segunda Nota: ");
		n2 = leia.nextDouble();
		System.out.println("\nEntre com a Terceira Nota: ");
		n3 = leia.nextDouble();
		
		media = (n1+n2+n3)/3;
		System.out.println("\nMedia Aritmetica: "+media);//sem o arredondamento
		System.out.printf("\nMedia Aritmetica: %.1f",media);//com o arrendontamento
		
		if(media>=7 && media<=10) {//sem ; em estruturas
			System.out.println("\nAlune Aprovade!!");
		}
		else if(media>=5 && media<7){
			System.out.println("\nAlune de Exame!");
		}
		else {
			System.out.println("\nAlune Reprovade :(");
		}
		
		System.out.println("\nLista de Filmes:");
		System.out.println("\n1 - A Procura da Felicidade");
		System.out.println("\n2 - Os Vingadores");
		System.out.println("\n3 - Prenda-me Se For Capaz");
		System.out.println("\n4 - A Ilha do Medo");
		System.out.println("\nDigita sua Opcao: ");
		op = leia.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("\nA Procura da Felicidade");
			break;
		case 2:
			System.out.println("\nOs Vingadores");
			break;
		case 3:
			System.out.println("\nPrenda-me Se For Capaz");
			break;
		case 4:
			System.out.println("\nA Ilha do Medo");
			break;
			default:
				System.out.println("\nOpcao Invalida!!");
		}
		n1 = Math.sqrt(n2);
		n2 = Math.pow(n3, 3);
	}

}
