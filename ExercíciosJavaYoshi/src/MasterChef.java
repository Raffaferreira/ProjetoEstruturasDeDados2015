import java.util.Scanner;


public class MasterChef {

	public static void main(String[] args) {
		//EXERCICIO 04
		
		Scanner leitor = new Scanner(System.in);

		System.out.println("Quantos ingredientes a receita ter� ?");
		int indice = leitor.nextInt();
		int[] ingredientes = new int[indice];
		
		int indice1 = 0;
		while(indice1 < ingredientes.length)
		{
			indice--;
			System.out.println("Qual o pre�o de cada ingrediente ?");
			int pre�o = leitor.nextInt();
			ingredientes[indice] = pre�o;
			indice1++;
		}
		
		int indice2 = 0;
		float soma = 0;
		while (indice2 < ingredientes.length)
		{
			indice2++;
			soma = soma + ingredientes[indice];
			indice++;
		}
		System.out.println("O custo total dos ingredientes somados, da receita s�o: " + soma);
		
		System.out.println("Digite Procurar, para encontrar o ingrediente ou aperte X para sair...!");
		String nomeExit = leitor.nextLine();
		
		switch (nomeExit) 
		{
		case "X":	
			System.out.println("Programa terminado...!");
			break;
		case "Procurar":
			for(int i = 0; i < ingredientes[indice]; i++)
			{
				if( nomeExit.equals(ingredientes[indice]))
				{
					System.out.println("Nome do ingrediente encontrado ");
				}
				else
				{
					System.out.println("N�o encontrado...");
				}
				indice++;
			}
			break;
		}
		
		
		leitor.close();
	}

}
