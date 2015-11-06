
public class ProgramasFilas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Fila filax = new Fila(5);
		filax.Inserir("Macaco");
		filax.Inserir("Arara");
		filax.Inserir("Boi");
		filax.Inserir("Gato");
		filax.Inserir("Cachorro");
		System.out.println("Primeiro : " + filax.peek());
		System.out.println("Primeiro : " + filax.peek());
		System.out.println("Primeiro : " + filax.peek());
		
		System.out.println(filax.poll());
		System.out.println(filax.poll());
		System.out.println(filax.peek());
		filax.limpar();
		
	}

}
