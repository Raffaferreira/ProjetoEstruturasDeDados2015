
public class ProgramaDecisoes {

	public static void main(String[] args) {
		// se SEM senão (if SEM else)
		if (1<10) {
			System.out.println("1 é menor que 10");
		}
		
		// se for só 1 linhas, as chaves são opcionais
		if (1>0)
			System.out.println("1 é maior que 0");
		
		// se/senão (if/else)
		if (10==20) {
			System.out.println("10 é igual a 20");
		} else {
			System.out.println("10 é diferente de 20");
		}
		
		// tipo lógico: boolean (primitivo) ou Boolean (classe)
		boolean teste1 = true;
		Boolean teste2 = false;
		
		boolean testeNumeros = (90 == 100);
		System.out.println(testeNumeros);
		
		// comparar textos: usar-se o .equals()
		boolean testeTextos = "amor".equals("Amor");
		System.out.println(testeTextos);
		
		// o equalsIgnoreCase() ignora "maiúsculos/minúsculos"
		boolean testeTextos2 = "love".equalsIgnoreCase("lOvE");
		System.out.println(testeTextos2);
		
		// testes múltiplos
		
		// conector "E": && - TODOS devem ser verdadeiros
		if ( (1<0) && (10==10) ) {
			System.out.println("1<0 E 10=10 !");
		}
		
		// conector "OU": || - basta que UMA seja verdadeira
		if ( (1==0) || (10==20) || (0==0) ) {
		System.out.println("um dos testes deu bom!");
		}
		
		double media = 7.5;
		String resultado = (media>7)?"Aprovado":"Reprovado";
		System.out.println(resultado);
		// (teste lógico) ? Valor se true : Valor se false
		
		String r2 = (media>7)?(media>9?"Gênio":"Aprovado"):"Reprovado";
		System.out.println(r2);
		
	}

}





