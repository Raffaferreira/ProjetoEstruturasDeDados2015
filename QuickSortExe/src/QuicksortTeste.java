import java.util.Scanner;


public class QuicksortTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner nome = new Scanner(System.in);
		
		System.out.println("Digite o numero de Nomes: ");
		int total = nome.nextInt();
		String[] vetor = new String[total];
		int n = 0;
		
		while(total > n){
			System.out.println("Digite o nome: ");
			String sobrenome = nome.next();
			vetor[n] = sobrenome;
			n++;
		}

		Quicksort.quickSort(vetor, 0, total-1);
		
		System.exit(0);
		
	}

}
