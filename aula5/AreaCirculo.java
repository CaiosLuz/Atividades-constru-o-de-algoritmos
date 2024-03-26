package aula5;
import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {

        double raio, resultado = 0.0;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do circulo");
        raio = scanner.nextDouble();

        resultado = (raio * raio) * 3.14;

        System.out.println("A area do circulo é: " + resultado);

        scanner.close();

    }
    
}
