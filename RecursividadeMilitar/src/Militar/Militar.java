package Militar;

public class Militar {
	
	String nome;
	int idade;
	
	private Militar superior;
	private Militar inferior;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Militar getSuperior() {
		return superior;
	}

	public void setSuperior(Militar superior) {
		this.superior = superior;
	}
	
	public Militar getInferior()
	{
		return inferior;
	}
	
	public void setInferior(Militar inferior)
	{
		this.inferior = inferior;
	}
	
	
	public boolean isGeneral()
	{
		if (this.superior == null)
		{
			return true;
		}
		else
		{
			return false;
		}
		//Operador tenário
		//return superior == null? true:false;
	}
	
	public boolean isAspira()
	{
		if (this.inferior == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int getTotalSubordinados()
	{
		int total = 0;
		Militar inferiorAtual = inferior;
		while(inferiorAtual != null)
		{
			total++;
			inferiorAtual = inferiorAtual.getInferior();
		}
		return total;
	}
	
	public int getTotalSubordinadosRec()
	{
		if(inferior == null)
		{
			return 0;
		}
		return 1 + inferior.getTotalSubordinadosRec();
		
	}
	

}
