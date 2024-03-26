package aula5;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        
        double numero, auxiliar = 0.0;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        numero = scanner.nextDouble();

        auxiliar = numero;

        System.out.println("Digite o segundo número:");
        numero = scanner.nextDouble();

        auxiliar = auxiliar + numero;

        System.out.println("Digite o terceiro número:");
        numero = scanner.nextDouble();

        auxiliar = auxiliar + numero;

        auxiliar = auxiliar / 3;

        System.out.println("A média dos 3 números é: " + auxiliar);

        scanner.close();

    }
}