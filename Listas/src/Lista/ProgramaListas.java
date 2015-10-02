package Lista;

public class ProgramaListas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		No no1 = new No("Rafael");
		No no2 = new No("Isaias");
		No no3 = new No("Raquel");
		
		no1.setProximo(no2);
		no2.setProximo(no3);
		
		Lista listaNomes = new Lista();
		listaNomes.setPrimeiro(no1);
		System.out.println("O tamanho da lista é : " + listaNomes.getTamanho());

	}

}
