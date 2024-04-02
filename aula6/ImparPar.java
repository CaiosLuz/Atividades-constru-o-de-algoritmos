package aula6;
import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        
        int numero = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número");
        numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }

        scanner.close();

    }
    
}
