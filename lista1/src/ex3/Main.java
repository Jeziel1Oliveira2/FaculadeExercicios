package ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //criando o Scanner
        Scanner scanner = new Scanner(System.in);
        //Produto
        /*
        System.out.println("Digite um número inteiro: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite um número inteiro: ");
        int num2 = scanner.nextInt();
        System.out.println("Digite um número inteiro: ");
        int num3 = scanner.nextInt();
        System.out.println("Digite um número inteiro: ");
        int num4 = scanner.nextInt();
        */
        System.out.println("Digite um número: ");
        float num1 = scanner.nextFloat();
        System.out.println("Digite um número: ");
        float num2 = scanner.nextFloat();
        System.out.println("Digite um número: ");
        float num3 = scanner.nextFloat();
        System.out.println("Digite um número: ");
        float num4 = scanner.nextFloat();
        //calculando a média aritimédica
        float media = (num1 + num2 + num3 + num4) / 4.0f;
        //mostrando a média aritimédica
        System.out.println("A média aritimédica entre esses números é: " + String.format("%.2f", media));
        //fechando o scanner
        scanner.close();
    }
}
