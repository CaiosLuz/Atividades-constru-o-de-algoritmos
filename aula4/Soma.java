package aula4;
import java.util.Scanner;

public class Soma {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // Solicitar o primeiro número
        System.out.println("Digite o primerio número");
        int primeiroNumero = scanner.nextInt();

        // Solicitar segundo número
        System.out.println("Digite o segundo número");
        int segundoNumero = scanner.nextInt();

        // Calcular a soma

        int resultadoSoma = primeiroNumero + segundoNumero;

        System.out.println("O resultado da soma dos números " + primeiroNumero + " e " + segundoNumero + " é: " + resultadoSoma);

        // Fechar o scanner para não ter vazamento de dados2
        
        scanner.close();

    }

}
