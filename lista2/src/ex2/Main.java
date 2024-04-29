package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // criando scanner
        Scanner scanner = new Scanner(System.in);
        //Lendo o valor
        System.out.println("digite um número para saber se ele é par:");
        int valor = scanner.nextInt();
        //Vendo se o valor é par
        if (valor % 2 == 0) {
            System.out.println("O número " + valor + " é par.");
        } else {
            System.out.println("O número " + valor + " é impar.");
        }
        //fechando scanner
        scanner.close();
    }
}
