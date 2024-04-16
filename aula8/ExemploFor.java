/*Escreva um algoritmo que utilize imprima os números pares que
existem entre 1 e 10 (duas soluções);*/

package aula8;

public class ExemploFor {
    public static void main(String[] args) {
        
        for(int cont = 0; cont <= 10; cont++) {
            if (cont % 2 == 0) {
                System.out.println(cont);
            }
        }

    }
}