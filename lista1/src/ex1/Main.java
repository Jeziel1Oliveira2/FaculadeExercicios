package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //criando o scanner
        Scanner scanner = new Scanner(System.in);
        //Leitura do produto
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();
        // Cálculo do produto
        int produto1 = num1 + num2;
        int produto2 = num1 - num2;
        int produto3 = num1 * num2;
        int produto4 = num1 / num2;
        // Mostra o resultado do produto
        System.out.println("A soma dos produtos é: " + produto1);
        System.out.println("A diminuição dos produtos é: " + produto2);
        System.out.println("A multiplicação dos produtos é: " + produto3);
        System.out.println("A divisão dos produtos é: " + produto4);
        //fechando o scanner
        scanner.close();
    }
}
