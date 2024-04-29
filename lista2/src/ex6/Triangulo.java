package ex6;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        //criando scanner
        Scanner scanner = new Scanner(System.in);
        //lendo os valores A, B e C
        System.out.println("Digite um número para ser a reta A:");
        double A = scanner.nextDouble();
        System.out.println("Digite um número para ser a reta B:");
        double B = scanner.nextDouble();
        System.out.println("Digite um número para ser a reta C:");
        double C = scanner.nextDouble();
        //calculando se da pra fazer um triângulo
        if (A < B + C && B < A + C && C < A + B) {
            System.out.println("Os lados formam um triângulo.");
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }
        // Fechando o Scanner
        scanner.close();
    }
}
