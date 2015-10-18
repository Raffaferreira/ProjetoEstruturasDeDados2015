package Objetos;

public class ProgramaEspelho {

	public static void main(String[] args) 
	{
		//EXERCICIO 13
		
		Espelho espelho1 = new Espelho();
		espelho1.setEspelhoRetrovisor(espelho1);
		espelho1.setCorFundo("Azul");
		
		System.out.println(espelho1.getEspelhoRetrovisor().getEspelhoRetrovisor().getEspelhoRetrovisor().getCorFundo());
		
	}

}
