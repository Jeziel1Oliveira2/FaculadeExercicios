package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // criando scanner
        Scanner scanner = new Scanner(System.in);
        //Lendo o valor
        System.out.println("digite um valor:");
        int valor = scanner.nextInt();
        //Vendo se o valor é menor/maior que 100
        if (valor > 100) {
            System.out.println("O valor digitado é maior do que 100.");
        } else {
            System.out.println("O valor digitado é menor ou igual a 100.");
        }
        //fechando o scanner
        scanner.close();
    }
}
