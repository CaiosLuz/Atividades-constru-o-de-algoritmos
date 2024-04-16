package aula8;
import java.util.Scanner;

public class NumeroDivisivel7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inicio, fim = 0;
        int resultado = 0;
        
        System.out.println("Digite o inicio:");
        inicio = scanner.nextInt();

        System.out.println("Digite o fim:");
        fim = scanner.nextInt();

        for(int cont = inicio; cont <= fim; cont++){
            if (cont % 7 == 0) {
            resultado += 1;
                // cont = fim;
                // break;
            }
        }
        System.out.println(resultado + " números são divisiveis por 7");
        scanner.close();
    }
}
