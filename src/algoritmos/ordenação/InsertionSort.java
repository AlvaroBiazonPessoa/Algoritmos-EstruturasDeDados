package algoritmos.ordenação;

import java.util.Arrays;

public class InsertionSort {
	
	public static void troca(int[] array, int primeiro, int segundo) {
		int primeiroValor = array[primeiro];
		int segundoValor = array[segundo];
		array[primeiro] = segundoValor;
		array[segundo] = primeiroValor;
	}
	
	public static void insertionSort(int[] array) {
		int termino = array.length;
		for(int atual = 0; atual < termino; atual++) {
			int analise = atual;
			while(analise > 0 && array[analise] < array[analise-1]) {
				troca(array, analise, analise-1);
				analise--;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] numeros = {5, 4, 2, 9};
		insertionSort(numeros);
		System.out.println(Arrays.toString(numeros));
	}
}
