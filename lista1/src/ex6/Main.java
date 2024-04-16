package ex6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //criando scanner
        Scanner scanner = new Scanner(System.in);
        //lendo os graus Fahrenheit
        System.out.println("Qual é a temperatura em Fahrenheit?");
        float temp = scanner.nextFloat();
        //calculo do tempo
        float calculo1 = temp - 32;
        float calculo2 = calculo1 * 5;
        float calculo3 = calculo2 / 9;
        //mostrando o resultado
        System.out.println("A temperatura em celcius é " + String.format("%.1f", calculo3));
        //fechando o scanner
        scanner.close();
    }
}
