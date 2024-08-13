package controller;

public class VetorController {
	
	public VetorController() {
		super();
	}

	public int[] inverteVetor(int[] vet, int tamanho, int posicaoComeco) {
		int metade = tamanho / 2;
		if (metade < posicaoComeco) {
			return vet;
		} else {
			int posicaoFinal = tamanho - 1 - posicaoComeco;
			int temp = vet[posicaoComeco];
			vet[posicaoComeco] = vet[posicaoFinal];
			vet[posicaoFinal] = temp;
			return inverteVetor(vet, tamanho, posicaoComeco + 1);
		}
	}
}
