package ex4;

import java.util.Scanner;

public class ValorMenor {
    public static void main(String[] args) {
        // criando scanner
        Scanner scanner = new Scanner(System.in);
        //Lendo o valor
        System.out.println("digite um número:");
        int valor1 = scanner.nextInt();
        System.out.println("digite outro número para ver qual é o menor:");
        int valor2 = scanner.nextInt();
        //verificando qual é o maior
        if (valor1 < valor2){
            System.out.println("O número " + valor1 + " é menor");
        } else {
            System.out.println("O número " + valor2 + " é menor");
        }
        //fechando scanner
        scanner.close();
    }
}
