
public class Fila {
	
	private String[] animais;
	
	private int cont = 0;
	
	
	public Fila(int capacidade){
		animais = new String[capacidade];
	}
	
	public void Inserir(String animal){
		animais[cont] = animal;
		cont++;
	}
	
	public String peek(){
		return animais[0];
	}
	
	public String poll()
	{
		String primeiro = peek();
		for(int i = 0; i<cont-1; i++)
		{
			animais[i] = animais[i+1];
		}
		cont--;
		animais[cont] = null;
		return primeiro;
	}
	
	public void limpar(){
		for(int i = 0; i < cont; i++)
		{
			animais[i] = null;
		}
		cont = 0;
	}
	
	

}
