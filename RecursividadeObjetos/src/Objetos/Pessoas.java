package Objetos;

public class Pessoas {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Rafael");
		pessoa1.setAltura(1.70);
		
		System.out.println("O nome � " + pessoa1.getNome());
		System.out.println("A altura � " + pessoa1.getAltura());
		
		
		Pessoa pessoa2 = new Pessoa("Raquel", 1.80);
		System.out.println();
		
		System.out.println("O nome � " + pessoa2.getNome());
		System.out.println("A altura � " + pessoa2.getAltura());
		
		
		Pessoa bart = new Pessoa("Bart Simpson", 1.2);
		Pessoa homer = new Pessoa("Homer Simpson", 1.6);
		Pessoa abe = new Pessoa("Abe Simpson", 1.5);
		
		bart.setPai(homer);
		homer.setPai(abe);
		
		System.out.println("O pai do homer � " + homer.getPai().getNome());
		System.out.println("O pai de bart � " + bart.getPai().getPai().getPai());
		
		
	}

}
