package recursividade;

public class ProgramaContador {

	static int regredir(int valor, int ate)
	{
		valor--;
		if(valor>ate)
		{
			valor = regredir(valor, ate);
		}
		return valor;
	}
	
	public static void main(String[] args) {
		
		int valorInicial = 10;
		int valorFim = 1;
		System.out.println(regredir(valorInicial, valorFim));
		
	}

}
