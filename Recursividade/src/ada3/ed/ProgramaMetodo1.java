package ada3.ed;

public class ProgramaMetodo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		exibirInss(5000);
		String res = calcularResultado(10, 7);
		System.out.println(res);

	}
	
	static void exibirInss(double salario)
	{
		double inss = salario * 0.11;
		System.out.println("O inss é " + inss);
	}

	// Quando não é void, deve ser usado uma classe ou tipo primitivo
	// que é o tipo de retorno do método
	static String calcularResultado(double n1, double n2)
	{
		double media = (n1 + n2)/2;
		return media>=5?"Aprovado":"Reprovado";
	}
	
	
}
