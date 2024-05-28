package aula11;
import java.util.Scanner;

public class ImparParMatriz {
    // Crie um programa que leia uma matriz 3x3 de números inteiros e exiba a
    // quantidade de números pares e ímpares presentesna matriz
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

        int par = 0;
        int impar = 0;

        for(int i = 0; i < n_m; i++){
            for(int j = 0; j < n_m; j++){
                if(matriz[i][j] % 2 == 0 ) {
                    par++;
                } else {
                    impar++;
                }
            }
        }
        System.out.println(par + ": números pares, " + impar + ": números impar");
        scanner.close();
    }
}
