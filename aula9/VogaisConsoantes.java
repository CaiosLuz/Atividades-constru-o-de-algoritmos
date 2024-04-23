package aula9;
import java.util.Scanner;

public class VogaisConsoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();
        int contConsoante = 0, contVogal = 0;

        for(int cont = 0; cont < frase.length(); cont++) {
            for(int contB = 'a'; contB <= 'z'; contB++) {
                if (frase.charAt(cont) == contB) {
                    if (contB == 'a' || contB == 'e' || contB == 'i' || contB == 'o' || contB == 'u') {
                        contVogal++;
                    } else {
                        contConsoante++;
                    }
                }
            }
        }
        System.out.println("Vogais: " + contVogal);
        System.out.println("Consoantes: " + contConsoante);
        
        scanner.close();

    }
}
