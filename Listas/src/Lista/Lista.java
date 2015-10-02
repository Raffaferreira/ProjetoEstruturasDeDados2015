package Lista;
/**
 * Lista encadeada simples de Strings
 * @author aluno
 *
 */
public final class Lista {

	private No primeiro;
	
	private No ultimo;
	
	/**
	 * Calcula o tamanho da lsita
	 * @return o tamanho da lista
	 */
	public int getTamanho()
	{
		if (primeiro == null)
		{
			return 0;
		}
		int tamanho = 1;
		No noAtual = primeiro;
		while ( noAtual.getProximo() != null )
		{
			tamanho++;
			noAtual = noAtual.getProximo();
		}
		return tamanho;
	}
	
	//Metódo para INSERIR um novo nó na lsita
	//1. Faça o primeiro atual ser o proximo do novo nó
	//2. Faça o novo nó ser o primeiro da lista
	public void AdicionarComeço(No novoNo)
	{
		novoNo.setProximo(primeiro);
		primeiro = novoNo;
	}

	public No getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(No primeiro) {
		this.primeiro = primeiro;
	}
	
	
	
}
