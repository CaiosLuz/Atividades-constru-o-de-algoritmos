package aula11;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n_m = 3;
        // Criando matriz;
        int [][] matriz = new int[n_m][n_m];

        for(int i = 0; i < n_m; i++){
            for(int j = 0; j < n_m; j++){
                System.out.println("Digite o valor para a posição: " + i + " x " +  j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        int menor = matriz[0][0];
        int tmp = 0;

        for(int i = 0; i < n_m; i++){
            for(int j = 0; j < n_m; j++){
                tmp = matriz[i][j];
                if (menor > tmp) {
                    menor = matriz[i][j];
                }
            }
        }
        System.out.println(menor);
        scanner.close();

    }
}
