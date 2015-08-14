import java.util.Scanner;

public class BoletimMitico {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double[] notas = new double[4];
		
		int indice = 0;
		while(indice < notas.length)
		{
			System.out.println("Digite a "+ indice +"nota");
			notas[indice] = leitor.nextDouble();
			indice++;
		}
		
		indice = 0;
		while(indice < notas.length)
		{
			if (notas[indice] >= 7)
			{
				System.out.println("Aluno aprovado");
			}
			else
			{
				System.out.println("Aluno reprovado");
			}
			indice++;
		}
		
		
		
		
		
	}

}
