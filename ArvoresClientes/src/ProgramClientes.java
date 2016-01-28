
public class ProgramClientes {

	public static void main(String[] args) {
		
		
		Cliente cli1 = new Cliente(8, "Rafael", "raffa.ferreiira");
		Cliente cli2 = new Cliente(10, "Isaias", "isaias@com.br");
		Cliente cli3 = new Cliente(15, "Paula", "paula@com.br");
		Cliente cli4 = new Cliente(17, "Raquel", "raquel@com.br");
		Cliente cli5 = new Cliente(12, "Luzia", "luzia@com.br");
		Cliente cli6 = new Cliente(5, "Alex", "alex@com.br");
		Cliente cli7 = new Cliente(27, "Ana", "ana@com.br");
		Cliente cli8 = new Cliente(23, "José", "jose@com.br");
		Cliente cli9 = new Cliente(21, "João", "joao@com.br");
		Cliente cli10 = new Cliente(22, "Larissa","larissa@com.br");
		Cliente cli11 = new Cliente(26, "Sthepanie", "ste@com.br");
		Cliente cli12 = new Cliente(30, "André", "andre@com.br");
		
		Arvore obj1 = new Arvore();
		System.out.println("A arvore está vazia ? : " + obj1.isVazia());
		obj1.inserirNo(cli1);
		obj1.inserirNo(cli2);
		obj1.inserirNo(cli3);
		obj1.inserirNo(cli4);
		obj1.inserirNo(cli5);
		obj1.inserirNo(cli6);
		obj1.inserirNo(cli7);
		obj1.inserirNo(cli8);
		obj1.inserirNo(cli9);
		obj1.inserirNo(cli10);
		obj1.inserirNo(cli11);
		System.out.println("A arvore está vazia : " + obj1.isVazia());
		System.out.println("Grau da Arvore : " + obj1.getRaiz().getGrau());
		System.out.println("Existe dentro da arvore ? : " + obj1.getRaiz().existeNO(cli9));
		System.out.println("Existe dentro da arvore ? : " + obj1.getRaiz().existeNO(cli12));
		
		
	}
}
