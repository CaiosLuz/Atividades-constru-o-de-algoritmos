package aula11;
import java.util.Scanner;

public class MediaArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[5];
        double media = 0.0;
        int soma = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Digite numero " + (i+1) + "/5");
            valores[i] = scanner.nextInt();
            soma += valores[i];
        }

        // for (int i = 0; i < valores.length; i++) {
        //     soma += valores[i];
        // }

        media = soma / valores.length;

        System.out.println(media);

        scanner.close();

    }
}
