package Ordenacao;

public class BubbleSort {
	public static void bubbleSort() {		
		int[] vet = {5, 3, 2, 4, 7, 1, 0, 6}; //vetor inicial
		int aux = 0; //indice auxiliar para comparacao
		int i = 0; //indice que percorre o vetor

		System.out.println("####Vetor inicial: ####");
		for(i = 0; i<8; i++){ //iteracao no vetor antes da ordenacao
			System.out.println(" "+vet[i]);
		}
		System.out.println(" ");
		for(i = 0; i<8; i++){ //ordenacao do vetor
			for(int j = 0; j<7; j++){
				if(vet[j] > vet[j + 1]){
					aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}
			}
		}
		System.out.println("####Vetor ordenado:####");
		for(i = 0; i<8; i++){ //exibicao do vetor apos a ordenacao
			System.out.println(" "+vet[i]);
		}
	}

	public static void main(String[] args) {					
		//chamada da funcao de ordenacao;
		bubbleSort();
				
	}

}