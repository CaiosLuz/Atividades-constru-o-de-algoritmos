package aula10;
import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args) {
        int numeroPositivo = 0;
        int soma = 0;

        Scanner scanner = new Scanner(System.in);
        
        while (numeroPositivo >= 0) {
            System.out.println("Digite um número postivo");
            numeroPositivo = scanner.nextInt();

            if (numeroPositivo > 0) {
                soma += numeroPositivo;
                System.out.println("Numero positivo! " + soma);
            } else {
                System.out.println("Numero negativo");
            }
        }
        scanner.close();
    }
}
