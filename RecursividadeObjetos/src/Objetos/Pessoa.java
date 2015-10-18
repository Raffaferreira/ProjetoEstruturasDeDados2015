package Objetos;

public class Pessoa {

	String nome;
	double altura;
	
	private Pessoa pai;
	
	public Pessoa()
	{
		System.out.println("Uma pessoa nasceu !");
	}

	public Pessoa(String nome, double altura){
		super();
		System.out.println("Uma pessoa foi criada com nome e altura");
		setNome(nome);
		setAltura(altura);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public Pessoa getPai()
	{
		return pai;
	}
	
	public void setPai(Pessoa pai){
		this.pai = pai;
	}
	
	
}

