package ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //criando o scanner
        Scanner scanner = new Scanner(System.in);
        //criar a variavel e a guardar
        System.out.println("Digite um número inteiro: ");
        int num = scanner.nextInt();
        //calculo do quadrado
        int quadrado =  num * num;
        //calculo do resto da divisão por 3
        int restoDivisao = num % 3;
        //calculo da metade
        int metade = num / 2;
        //calculo resultado do produto de X pela metade de X
        int resultado = num * metade;
        //mostrando a variavel
        System.out.println("Seu número é: " + num);
        //mostrando o resultado do quadrado
        System.out.println("O resultado do seu número ao quadrado é: " + quadrado);
        //mostrando o resultado do resto
        System.out.println("O resto da divisão do seu número por 3 é: " + restoDivisao);
        //mostrando o resultado da metade
        System.out.println("A metade de seu número é: " + metade);
        //mostrando o resultado do produto de X pela mentade de X
        System.out.println("O resultado do seu número sendo multiplicado pela metade é:" + resultado);
        //fechando o scanner
        scanner.close();
    }
}
