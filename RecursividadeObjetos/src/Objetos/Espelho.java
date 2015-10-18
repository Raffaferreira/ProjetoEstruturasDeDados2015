package Objetos;

public class Espelho {
	//EXERCICIO 13
	
	private Espelho espelhoRetrovisor;
	private String corFundo;
	
	
	public Espelho()
	{
		System.out.println("Um espelho foi criado !");
	}
	
	public Espelho(Espelho espelhoRetrovisor, String corFundo) {
		super();
		System.out.println("Um espelho foi criado!!");
		setCorFundo(corFundo);
		setEspelhoRetrovisor(espelhoRetrovisor);
	}
	
	public Espelho getEspelhoRetrovisor() {
		return espelhoRetrovisor;
	}
	public void setEspelhoRetrovisor(Espelho espelhoRetrovisor) {
		this.espelhoRetrovisor = espelhoRetrovisor;
	}
	
	public String getCorFundo() {
		return corFundo;
	}
	public void setCorFundo(String corFundo) {
		this.corFundo = corFundo;
	}

	
	
}
