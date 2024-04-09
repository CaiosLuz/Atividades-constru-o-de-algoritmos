package aula7;
import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção");
        String opcao = scanner.nextLine();

        switch (opcao) {
            case "Coca-cola": 
                System.out.println("Escolhido: Coca-cola");
                break;
            case "Agua": 
                System.out.println("Escolhido: Agua");
                break;
            default:
                System.out.println("Ivalido");
        }
    }
}
