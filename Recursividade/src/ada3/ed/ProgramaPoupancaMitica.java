package ada3.ed;

import java.util.Scanner;

public class ProgramaPoupancaMitica {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner leitor = new Scanner(System.in);
		
		double taxa = 0;
		double saldo = 0;
		double deposito = 1;
		
		while(deposito != 0 )
		{
			System.out.println("Digite o valor do Deposito");
			deposito = leitor.nextDouble();
			
			System.out.println("Digite o valor da taxa de juros");
			taxa = leitor.nextDouble();
			
			System.out.println("Digite o valor do saldo atual");
			saldo = leitor.nextDouble();
			
			Depositar(saldo, deposito, taxa);
		}
				
		leitor.close();
	}
	
	static double Depositar(double saldoAtual, double vlrDeposito, double taxaJuros) {
		if (saldoAtual < 0) 
		{
			System.out.println("Seu saldo no valor de " + saldoAtual + " está negativo");
		} 
		else 
		{
			saldoAtual = ((saldoAtual + vlrDeposito) - taxaJuros);
		}
		return calcularIr(saldoAtual);
	}
	
	static double calcularIr(double saldoAtual2)
	{
		double result = 0;
		
		if(saldoAtual2 >= 5000)
		{
		    result = saldoAtual2 * 0.97; 
		}
		else
		{
			result = saldoAtual2;
			System.out.println("Não á taxa de juros a ser descontado do seu saldo..!");
			System.out.println("Saldo no valor de " + result);
		}
		return result;
	}

}
