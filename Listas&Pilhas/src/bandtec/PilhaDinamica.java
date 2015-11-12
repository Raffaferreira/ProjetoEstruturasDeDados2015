package bandtec;

public class PilhaDinamica {
	// EXERCICIO 14

	public Lista vetor = new Lista();

	public void Push(String elemento) {
		this.vetor.adicionar(new No(elemento));
	}

	public String Pop(){
		if(vetor.getTamanho() == 0)
		{
			return null;
		}
		else
		{
			
		}
		return "";
	}
	

}
