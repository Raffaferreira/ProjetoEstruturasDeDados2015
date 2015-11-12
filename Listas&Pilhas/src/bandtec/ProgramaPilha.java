package bandtec;

public class ProgramaPilha {

	public static void main(String[] args) {

		Pilha pilhaX = new Pilha(6);
		
		System.out.println("Vazia? "+pilhaX.isVazia());
		
		pilhaX.Push("Selena Gomes");
		pilhaX.Push("Maracujá");
		pilhaX.Push("kkkk");
		pilhaX.Push("café");
		pilhaX.Push("Rafael");
		pilhaX.Push("Isaias");
		
		System.out.println("Vazia? "+ pilhaX.isVazia());
		
		System.out.println(pilhaX.pop());
		System.out.println(pilhaX.getTamanho());
		
		System.out.println(pilhaX.pop());
		System.out.println(pilhaX.getTamanho());
		
		System.out.println(pilhaX.pop());
		System.out.println(pilhaX.getTamanho());
		
		System.out.println("Vazia? "+ pilhaX.isVazia());
		
	}

}
