package aula10;
import java.util.Scanner;

public class AprendendoWhile {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numeroSorte = 7;
        int palpite = 0;

        System.out.println("Jogo de aposta");

        while (palpite != numeroSorte) {
            System.out.println("Digite um número de 1 a 10");
            palpite = scanner.nextInt();

            if (palpite == numeroSorte) {
                System.out.println("Você acertou o número da sorte!");
            } else {
                System.out.println("Tente novamente.");
            }
        }

        scanner.close();

    }
}