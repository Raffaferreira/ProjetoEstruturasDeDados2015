import java.util.Random;
import java.util.Scanner;

public class Exercicio11 {
	
	static int numeroRandomico(int numRandom)
	{
		Random gerador = new Random();
		int aleatorio = gerador.nextInt(100);
		
		while(aleatorio != numRandom)
		{
			aleatorio = gerador.nextInt(100);
		}
		return numRandom;
	}
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int numero;
		
		System.out.println("DIGITE UM NÚMERO...!");
		numero = leitor.nextInt();		
		
		System.out.println("O numero achado é : " + numeroRandomico(numero));		
		
		
		leitor.close();
	}

}
