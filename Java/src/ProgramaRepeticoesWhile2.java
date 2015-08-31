
public class ProgramaRepeticoesWhile2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int vezez = 10;
		while ( vezez > 0)
		{
			vezez--;
			System.out.println("Abacaxi");
			System.out.println("Acerola");
			if (vezez==3 || vezez==7)
			{
				continue;
			}
			System.out.println("Damasco");
			System.out.println("Morango\n");
		}
		
		int contX = 10;
		int contY = 2;
		R1:while (contX>0)
		{
			contX--;
			System.out.println("Laço 1 - "+ contX);
			R2:while(contY>0)
			{
				contY--;
				if(contX==7)
				{
					continue R1;
				}
				if(contX==4)
				{
					break R2;
				}
				System.out.println("Laço 2 - "+ contY);
			}
			contY = 10;	
		}
		
		
		
	}

}
