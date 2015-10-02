package Militar;

public class ProgramMilitar {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		Militar militar1 = new Militar();
		Militar militar2 = new Militar();
		Militar militar3 = new Militar();
		
		militar1.setNome("O general");
		militar1.setIdade(60);
		
		militar2.setNome("O mediano");
		militar2.setIdade(55);
		
		militar3.setNome("O aspirante");
		militar3.setIdade(22);
		
		militar3.setSuperior(militar2);
		militar2.setInferior(militar3);
		militar2.setSuperior(militar1);
		militar1.setInferior(militar2);
		
		System.out.println("1º Militar:  " + militar1.getNome() + " " + militar1.getIdade() + " Anos" );
		System.out.println("É o general ? : " + militar1.isGeneral());
		System.out.println("É aspira ? : " + militar1.isAspira());
		System.out.println("Inferior a o militar 1º " + militar1.getInferior().getInferior().getNome());
		System.out.print("Quantos subordinados este Militar têm ? : " + militar1.getTotalSubordinados());
		System.out.println("Subordinados : " + militar1.getTotalSubordinadosRec());
		
		System.out.println("###############################");
		
		System.out.println("2º Militar : " + militar2.getNome() + " " + militar2.getIdade() + " anos");
		System.out.println("É o general ?" + militar2.isGeneral());
		System.out.println("É o aspira ? " + militar2.isAspira());
		System.out.println("Inferior a ele : " + militar2.getInferior());
		System.out.println("Superior a ele : " + militar2.getSuperior());
		System.out.println("Quantos subordinados este Militar têm ? : " + militar2.getTotalSubordinados());
		System.out.println("Subordinados recursividade : " + militar2.getTotalSubordinadosRec());
		 
	}

}
