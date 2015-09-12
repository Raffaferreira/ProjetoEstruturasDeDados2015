import java.util.Scanner;

public class Exercicio11B {

	static Scanner leitor = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int media;
		int faltas;
		
		System.out.println("QUAL É A MÉDIA PARA APROVAÇÃO ??");
		media = leitor.nextInt();
		System.out.println("QUAL O NUMERO MÁXIMO DE FALTAS ?");
		faltas = leitor.nextInt();		
		
		System.out.println("Parabéns pela persistência voce tentou " + cadastrarNotasFrequencia(media, faltas) + " Até passar em Estruturas de Dados ! ");
		
	
		leitor.close();
	}
	
	static int cadastrarNotasFrequencia(int mediaAprovacao, int mxmFalta)
	{	
		int nota1, nota2, faltas;
		int mediaAtingida;
		int tentativas = 1;
		
		System.out.println("DIGITE A PRIMEIRA NOTA ??");
		nota1 = leitor.nextInt();	
		System.out.println("DIGITE A SEGUNDA NOTA ??");
		nota2 = leitor.nextInt();
		System.out.println("DIGITE O NÚMERO DE FALTAS...!");
		faltas = leitor.nextInt();
		
		mediaAtingida = (nota1 + nota2) / 2;
		
		if( (mediaAtingida < mediaAprovacao) || (faltas > mxmFalta))
		{
			tentativas++;
			cadastrarNotasFrequencia(mediaAprovacao, mxmFalta);
		}
	
		return tentativas;
	}

	
	
}
