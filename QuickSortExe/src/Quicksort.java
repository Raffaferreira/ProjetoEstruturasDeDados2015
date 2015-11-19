
public class Quicksort {
	private static int partition(String vetor[], int esquerda, int direita){
		int i = esquerda, j=direita; //
		String tmp;
		String pivo = vetor[(esquerda+direita)/2];
		while (i <= j){
			while(vetor[i].length() < pivo.length()){
				i++;
			}
			while(vetor[j].length() > pivo.length()){
				j--;
			}
			if (i <= j){
				tmp =  vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = tmp;
				i++;
				j--;
			}
		}
		return i;
	}
	
	static void quickSort(String vetor[], int esquerda, int direita){
		int indice = partition(vetor,esquerda,direita);
		if(esquerda < indice -1){
			quickSort(vetor, esquerda, indice - 1);
		}
		if(indice < direita){
			quickSort(vetor, indice, direita);
		}
	}
}
