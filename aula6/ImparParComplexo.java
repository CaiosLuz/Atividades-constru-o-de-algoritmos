package aula6;
import java.util.Scanner;

public class ImparParComplexo {
    public static void main(String[] args) {
        
        int numero = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("o número é par");
            if (numero > 9 && numero < 51) {
                System.out.println("O numero esta entre 10 e 50");
            } else {
                System.out.println("O número esta fora do range");
            }
        } else if  (numero % 2 >= 1 ){
            System.out.println("O número é impar");
            if (numero > 10 && numero < 52) {
                System.out.println("O número está entre 11 e 51");
            } else {
                System.out.println("O número esta fora do range");
            }
        }
        scanner.close();
    }
    
}
