import java.util.Scanner;

import javax.swing.JOptionPane;



public class ProgramaTextos {

	public static void main(String[] args) {
		// saída padrão em Java
		System.out.println("Boa noite, queridos!");
		
		// tipo alfanumérico (texto)
		String frase1 = "I S2 Lady Gaga";
		// Tipo: String. Sempre com aspas DUPLAS.
		
		// concatenação de textos
		String frase2 = frase1 + " e ai de quem não gostar!";
		String frase3 = "Olá "+" tudo bem";
		// basta usar o operador "+"
		String frase4 = "oi "+frase1+" bla "+frase2;
		
		// saída com componente "visual"
		JOptionPane.showMessageDialog(null, "Sou uma janela!");
		
		// Entrada de dados
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu email");
		String email = leitor.nextLine();
		System.out.println("Seu email é "+email);
		
		// entrada de dados "visual"
		String endereco = JOptionPane.showInputDialog("Onde você mora?");
		System.out.println("Você mora em "+endereco);
		
		// alguns exemplos de métodos em strings
		System.out.println("caixa alta: "+frase1.toUpperCase());
		System.out.println("caixa baixa: "+frase1.toLowerCase());
		
		System.out.println("substring "+frase1.substring(3));
		System.out.println("substring "+frase1.substring(3,4));
		
		System.out.println("troca troca "+frase1.replace("a", "@"));
	}

}




