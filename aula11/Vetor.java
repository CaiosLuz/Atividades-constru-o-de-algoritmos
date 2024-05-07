package aula11;

public class Vetor {
    public static void main(String[] args) {
        // Declarando um array []
        // Declaração de um vetor de números
        int[] vetorDeNumeros = new int[5];

        // Aplicando valores no vetor

        vetorDeNumeros[0] = 10;
        vetorDeNumeros[1] = 20;
        vetorDeNumeros[2] = 30;
        vetorDeNumeros[3] = 40;
        vetorDeNumeros[4] = 50;

        // Visualizando o que tem nas posições
        int figurinha = vetorDeNumeros[1];
        System.out.println("A figurinha na segunda posição é: " + figurinha);

    }
}