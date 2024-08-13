package view;

import controller.VetorController;

public class Main {
	
	public static void main(String[] args) {
		
		VetorController vetController = new VetorController();
		
		int[] vet10Posicoes = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int tamanho = vet10Posicoes.length;
		int[] vetInvertido = vetController.inverteVetor(vet10Posicoes, tamanho, 0);
		
		for (int n : vetInvertido) {
			System.out.print(n + " ");
		}
		System.out.println("\n");
		
		int[] vet11Posicoes = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		tamanho = vet11Posicoes.length;
		vetInvertido = vetController.inverteVetor(vet11Posicoes, tamanho, 0);
		
		for (int n : vetInvertido) {
			System.out.print(n + " ");
		}
	}

}
