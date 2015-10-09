package bandtec;

/**
 * Lista encadeada simples de Strings
 * 
 * @author Bandtec
 */
public class Lista {

	private No primeiro;

	/**
	 * Calcula o tamanho da lista.
	 * 
	 * @return o tamanho da lista.
	 */
	public int getTamanho() {
		if (primeiro == null) {
			return 0;
		}
		int tamanho = 1;
		No noAtual = primeiro;
		while (noAtual.getProximo() != null) {
			tamanho++;
			noAtual = noAtual.getProximo();
		}
		return tamanho;
	}

	public void adicionar(No novoNo) {
		novoNo.setProximo(primeiro);
		primeiro = novoNo;
	}

	public No BuscarConteudo(String conteudo) 
	{
		No noPrimeiro = primeiro;
		while (noPrimeiro != null) 
		{
			if (noPrimeiro.getConteudo().equals(conteudo)) 
			{
				return noPrimeiro;
			} 
			else 
			{
				noPrimeiro = noPrimeiro.getProximo();
			}
		}
		return null;
	}
	
	public int getIndice(String conteudo)
	{
		No no1 = primeiro;
		int indice = -1;
		while( no1 != null )
		{
			indice++;
			if(no1.getConteudo().equals(conteudo))
			{
				return indice;
			}
			no1 = no1.getProximo();
		}
		return -1;
	}
	
	public void Excluir(Object conteudo)
	{
		if(getTamanho() == 0)
		{
			System.out.println("Lista vazia");
			return;
		}
		
		if(primeiro.getConteudo().equals(conteudo))
		{
			primeiro = primeiro.getProximo();
			return;
		}
		
		No NoAnterior = primeiro;
		No NoBusca = primeiro.getProximo();
		while(NoBusca != null)
		{
			if (NoBusca.getConteudo().equals(conteudo))
			{
				NoAnterior.setProximo(NoBusca.getProximo());
				return;
			}
			NoAnterior = NoBusca;
			NoBusca = NoBusca.getProximo();
		}
	}

	public No getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(No primeiro) {
		this.primeiro = primeiro;
	}

}
