import java.util.Scanner;

public class BoletimMitico {
	
	
	public static void main(String[] args) 
	{
		// EXERCICIO 10
		Scanner leitura = new Scanner(System.in);
		
		double nota = 0;
		//double pctFaltas = 0;
		//double notasSomadas = 0;
		
		while( nota != -1 )
		{
			
			
			System.out.println("Digite o valor da nota...!");
			nota = leitura.nextDouble();
			
			System.out.println("Digite a notas j� Acumuladas/Somadas..!");
			double notasSomadas = leitura.nextDouble();
			double notasSomadas1 = notasSomadas;
			notasSomadas = notasSomadas1 + notasSomadas;
			
			System.out.println("Digite o valor do saldo atual...!!");
			double pctFaltas = leitura.nextDouble();
			
			cadastrarNota(nota ,pctFaltas, notasSomadas);
		}
				
		System.out.println("=====Programa terminado====");
		leitura.close();
	}
	
	static double cadastrarNota(double notas, double porcentFalta, double notasAcumuladas)
	{
		calcularFrequencia(notas, porcentFalta);
		
		notasAcumuladas = notas + notasAcumuladas;
		
		return notasAcumuladas;
	}

	static double calcularFrequencia(double notaCalculo, double frequencia)
	{
		double mediaFrequencia = 100 - frequencia;
		
		if(mediaFrequencia >= 90)
		{
			notaCalculo += 1;
		}
		if ( mediaFrequencia >= 0 && mediaFrequencia <= 30 )
		{
			notaCalculo -= 3;
		}
		if (mediaFrequencia >= 30 && mediaFrequencia <= 90)
		{
			System.out.println("Nota continuou a mesma, sem mudan�as 'NOTA' ==> " + notaCalculo);
		}
		return notaCalculo;
	}
	
}
