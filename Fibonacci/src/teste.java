import java.util.Scanner;


public class teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner usuario = new Scanner(System.in);
		fibonacci teste = new fibonacci();
		
		System.out.println("Digite o N termo da série de Fibonacci:");
		int serie = usuario.nextInt();
		
		int resultado = fibonacci.Fibo(serie);
		
		System.out.println("O resultado do termo é:" + resultado);
		
	}

}
