import java.util.Scanner;


public class BoletimSimples {

	public static void main(String[] args) {
		
		//EXERCICIO 03
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite seu nome");
		String nome = leitor.nextLine();
		System.out.println("Digite a nota");
		int nota1 = leitor.nextInt();
		System.out.println("Digite a nota");
		int nota2 = leitor.nextInt();
		System.out.println("Digite a nota");
		int nota3 = leitor.nextInt();
		System.out.println("Digite o total de aulas");
		float aulas = leitor.nextFloat();
		System.out.println("Números de aulas dos alunos");
		float faltas = leitor.nextFloat();
		
		float media = (nota1 + nota2 + nota3) / 3 ;
		int frequencia = (int)(aulas - faltas);
		
		System.out.println("Seu nome é " + nome + " sua média foi " + media + " sua frequência foi " + frequencia);
		leitor.close();
	}

}
