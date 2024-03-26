package aula5;
import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        
        double altura, base, resultado = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da base do triângulo");
        base = scanner.nextDouble();

        System.out.println("Digite o valor da altura do triângulo");
        altura = scanner.nextDouble();

        resultado = (base * altura) / 2;

        System.out.println("A área do triângulo com base: " + base + " e altura: " + altura + " é:" + resultado);

        scanner.close();

    }
}
