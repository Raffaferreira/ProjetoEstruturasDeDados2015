package bandtec;

public class Pilha {
	
	public String[] vetor;
	
	public int elementos = 0;
	
	
	public Pilha(int tamanho)
	{
		vetor = new String[tamanho];
	}
	
	public boolean isVazia()
	{
		return elementos==0;
	}
	
	public int getTamanho(){
		if(vetor.length == 0){
			return 0;
		}
		return this.elementos++;
	}
	
	public void Push(String elemento){
		if (elementos == vetor.length){
			return;
		}
		else
		{
			vetor[elementos] = elemento;
			elementos++;
		}
	}
	
	public String pop() {
		if(elementos == 0 )
		{
			return null;
		}
		else
		{
			String ultimoElemento = vetor[--elementos];
			vetor[elementos] = null;
			return ultimoElemento;
		}
	}
	
	
}
