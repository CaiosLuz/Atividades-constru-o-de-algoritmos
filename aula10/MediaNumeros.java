package aula10;
import java.util.Scanner;

/*
calcular media e quando for digitado o numero 0 parar.
*/

public class MediaNumeros {
    public static void main(String[] args) {
        int soma = 0;
        int numero = 1;
        int media = 0;
        int quantidadeVezes = 0;

        Scanner scanner = new Scanner(System.in);

        while (numero != 0) {
            System.out.println("Digite um número para realizar a média");
            numero = scanner.nextInt();
            
            if (numero > 0) {
            quantidadeVezes += 1;

                soma += numero;
                media = soma / quantidadeVezes;
            } else {
                System.out.println("Acabou" + media);
            }


            System.out.println("Media: " + media);
            System.out.println("Quantidade de numeros: " + quantidadeVezes);

        }
        scanner.close();
    }
}
