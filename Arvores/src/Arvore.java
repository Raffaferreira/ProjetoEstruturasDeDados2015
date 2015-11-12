public class Arvore {

	private No raiz;

	public boolean isVazia() {
		return raiz == null;
	}

	public void inserirNo(Integer conteudo) {
		if (isVazia()) {
			raiz = new No(conteudo);
		} 
		else {
			raiz.inserirNO(conteudo);
		}

	}
	

}
