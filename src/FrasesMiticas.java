import java.util.Scanner;


public class FrasesMiticas {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		Scanner leitor = new Scanner(System.in);
		
		String[] frases = new String[3];
		int indice1 = 0;
		while(indice1 < frases.length)
		{
			System.out.println("Digite a "+ indice1 +" frase no console");
			frases[indice1] = leitor.nextLine();
			indice1++;
		}	
		
		System.out.println("--------------------------------------------------------------------------------------------");
		
		String[] frases2 = new String[3];
		int indice2 = 0;
		while(indice2 < frases2.length)
		{
			frases2[indice2] = frases[indice2];
			System.out.println(frases2[indice2].toUpperCase());
			indice2++;			
		}	
		
		System.out.println("--------------------------------------------------------------------------------------------");
		
		String[] vetor1 = new String[3];
		int indice3 = 0;
		while(indice3 < vetor1.length)
		{
			System.out.println("Frases : " + frases2[indice2].replace("a", "?"));
			indice3++;
		}	
		
	
	}

}
