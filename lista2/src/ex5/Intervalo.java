package ex5;

import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        // criando scanner
        Scanner scanner = new Scanner(System.in);
        //Lendo o valor
        System.out.println("digite um número para saber se ele está entre 100 e 200:");
        int valor = scanner.nextInt();
        //verificando qual é o maior
        if (valor > 100 && valor < 200) {
            System.out.println("O número " + valor + " está no intervalo entre 100 e 200");
        } else {
            System.out.println("O número " + valor + " não está no intervalo entre 100 e 200");
        }
        //fechando scanner
        scanner.close();
    }
}
