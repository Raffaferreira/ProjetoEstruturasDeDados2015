
public class ProgramaRepeticoesWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double[] notas = new double[4];
		int indice = 0;
		double notaX = 2;
		while(indice<notas.length)
		{
			notas[indice] = notaX;
			notaX += 2.5;
			indice++;
		}
		
		indice = 0;
		while(indice < notas.length)
		{
			System.out.println(notas[indice]);
			indice++;
		}
		
		
		double pesquisa = 3.5;
		boolean  achou = false;
		indice = 0;
		while(indice < notas.length)
		{
			if(notas[indice] == pesquisa)
			{
				achou = true;
			}
			indice++;
		}
		System.out.println(achou?"achou o "+pesquisa:"Não achou o "+pesquisa);

	}

}
