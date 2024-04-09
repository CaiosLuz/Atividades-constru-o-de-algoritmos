package aula7;
import java.util.Scanner;

public class ParImparZero {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Digite um número para saber se é par, impar ou zero");
        int numero = scanner.nextInt();

        if (numero == 0) {
            System.out.println("Número zero");
        } else if (numero % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }
        
    }
    
}