import java.math.BigDecimal;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class ProgramaNumeros {

	public static void main(String[] args) {
		// números inteiros
		int nInteiro01 = 10;
		Integer nInteiro02 = 10;
		
		// int é o inteiro PRIMITIVO 
		// Integer é uma Classe (com métodos e atributos)
		
		// números reais
		double nReal01 = 8.5;
		Double nReal02 = 8.5;
		// o real PADRÃO em Java é double (ou Double).
		
		// existem outros inteiros e reais
		// Inteiro "longo"
		long nInteiroParrudo = 873465786;
		
		// real para aplicações de máxima precisão
		BigDecimal nRealFinanceiro = new BigDecimal("89234.7989");
		
		
		// operações básicas
		double op1 = 10 + 20;
		double op2 = nReal01 + 20;
		double op3 = nReal01 - nInteiro02;
		double op4 = nReal02 * nInteiro01;
		double op5 = nReal01 / nReal02;
		
		// entrada de dados
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Sua idade");
		int idade = leitor.nextInt();
		System.out.println("Sua altura");
		double altura = leitor.nextDouble();
		
		// entrada "visual"
		int numeroFilhos = 
		Integer.valueOf(JOptionPane.showInputDialog("Quantos filhos?"));
		
		double peso = 
		Double.valueOf(JOptionPane.showInputDialog("Qual seu peso"));
		
	}

}



