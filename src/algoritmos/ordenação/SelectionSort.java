package algoritmos.ordenação;

import java.util.Arrays;

public class SelectionSort {
	
	public static int buscaMenor(int[] array, int inicio) {
		int menor = inicio;
		int termino = array.length;
		for(int atual = inicio; atual < termino; atual++) {
			if(array[atual] < array[menor]) {
				menor = atual;
			}
		}
		return menor;
	}

	public static void troca(int[] array, int primeiro, int segundo) {
		int primeiroValor = array[primeiro];
		int segundoValor = array[segundo];
		array[primeiro] = segundoValor;
		array[segundo] = primeiroValor;
	}
	
	public static void selectionSort(int[] array) {
		int termino = array.length;
		for(int atual =0; atual < termino; atual++) {
			int menor = buscaMenor(array, atual);
			troca(array, atual, menor);
		}
	}
	
	public static void main(String[] args) {
		int[] numeros = {10, 5, 49, 31, 1, 8989, 0, -3};
		selectionSort(numeros);
		System.out.println(Arrays.toString(numeros));
	}
}
