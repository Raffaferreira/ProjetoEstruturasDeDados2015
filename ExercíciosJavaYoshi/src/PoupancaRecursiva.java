import java.util.Scanner;

public class PoupancaRecursiva {

	static Scanner leitor = new Scanner(System.in);
	
	public static void main(String[] args) {
		// EXERCICIO 11 - C
		int saldo;
		float juros;
		
		System.out.println("Qual o saldo inicial ?");
		saldo = leitor.nextInt();
		System.out.println("Qual a taxa de Juros Mensal ?..");
		juros = leitor.nextFloat();
		
		System.out.println("SEU SALDO ATUAL AGORA É DE : " + Depositar(saldo, juros));
		
		leitor.close();
	}
	
	static int Depositar(int saldoAtual, float taxaJuros)
	{
		int saldoAnterior = 0;
		int vlrDeposito = 0;
		
		System.out.println("Digite o valor do deposito..!");
		vlrDeposito = leitor.nextInt();
		
		if(vlrDeposito != 0)
		{
			saldoAnterior = saldoAtual;
			saldoAtual = (int) ((saldoAnterior * taxaJuros) + vlrDeposito);
			Depositar(saldoAtual, taxaJuros);
		}		
		return saldoAtual;
	}
	

}
