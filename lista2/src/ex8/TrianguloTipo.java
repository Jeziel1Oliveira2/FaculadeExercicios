package ex8;

import java.util.Scanner;

public class TrianguloTipo {
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
            //calculando que tipo de triangulo
            if (A == B && B == C) {
                System.out.println("Chamado de triângulo equilátero.");
            } else if (A == B || A == C || B == C) {
                System.out.println("Chamado de triângulo isósceles.");
            } else {
                System.out.println("Chamado de triângulo escaleno.");
            }
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }
        // Fechando o Scanner
        scanner.close();
    }
}
