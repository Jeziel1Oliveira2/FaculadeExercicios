package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //criando o scanner
    Scanner scanner = new Scanner(System.in);
    //Leitura do produto
    System.out.println("Digite um número inteiro: ");
    int num1 = scanner.nextInt();
    System.out.println("Digite um número inteiro: ");
    int num2 = scanner.nextInt();
    System.out.println("Digite um número inteiro: ");
    int num3 = scanner.nextInt();
    //calculo do produto
    int produto1 = num1 + num2 + num3;
    //mostrar o resultado do produto
    System.out.println("O resultado é " + produto1);
    //fechando o scanner
    scanner.close();
}
}
