public class Arvore 
{

	private No raiz;

	public No getRaiz() {
		return raiz;
	}

	public void setRaiz(No raiz) {
		this.raiz = raiz;
	}

	public boolean isVazia() {
		return raiz == null;
	}

	public void inserirNo(Cliente conteudo) 
	{
		if (isVazia()) 
		{
			raiz = new No(conteudo);
		} 
		else 
		{
			raiz.inserirNO(conteudo);
		}

	}

}
