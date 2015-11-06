
public class ProgramaArvore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Arvore arvorex = new Arvore();
		System.out.println("É vazia ? " + arvorex.isVazia());
		arvorex.inserirNo(20);
		System.out.println("É vazia ? " + arvorex.isVazia());
		arvorex.inserirNo(25);
		arvorex.inserirNo(8);
		arvorex.inserirNo(10);
		arvorex.inserirNo(22);
		arvorex.inserirNo(6);
		arvorex.inserirNo(13);
		arvorex.inserirNo(30);
		
		

	}

}
