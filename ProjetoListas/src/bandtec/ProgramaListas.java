package bandtec;

public class ProgramaListas {

	public static void main(String[] args) 
	{
		No no1 = new No("Kate Parry");
		No no2 = new No("Ke$ha");
		No no3 = new No("Demy Lovato");
		No no4 = new No("Madonna");
		No no5 = new No("Christina Aguilera");
		No no6 = new No("Maroon 5");
		
		no1.setProximo(no2);
		no2.setProximo(no3);
		no3.setProximo(no4);
		no4.setProximo(no5);
		no5.setProximo(no6);
		
		Lista listaCantoras = new Lista();
		listaCantoras.setPrimeiro(no1);
		
		System.out.println("O TAMANHO DA LISTA � : "+ listaCantoras.getTamanho());
		
		if(listaCantoras.BuscarConteudo("Kate Parry") != null)
		{
			System.out.println("ACHOU...ESTE VALOR EST� DENTRO DA LISTA");
		}
		
		if(listaCantoras.BuscarConteudo("Demy Lovato") != null)
		{
			System.out.println("ACHOU...ESTE VALOR EST� DENTRO DA LISTA");
		}
		
		System.out.println("Est� na posi��o : " + listaCantoras.getIndice("Demy Lovato"));
		System.out.println("Est� na posi��o : " + listaCantoras.getIndice("Ke$ha"));
		System.out.println("Est� na posi��o : " + listaCantoras.getIndice("Kate Parry"));
		
		listaCantoras.Excluir("Madonna");
		listaCantoras.getTamanho();
		
	}
}
