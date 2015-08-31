
public class ProgramaDecisoes2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int numFilhos = 2;
		
		switch (numFilhos) 
		{
		case 1:
			System.out.println("Você tem TV, internet e PS4");
			break;
		case 2:
			System.out.println("Você tem TV e internet");
			break;
		case 3:
			System.out.println("Você tem TV");
			break;
		default:
			System.out.println("Nem TV você tem");
			break;
		}
		

	}

}
