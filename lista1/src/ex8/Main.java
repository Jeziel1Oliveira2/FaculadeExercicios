package ex8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Criando um scanner
        Scanner scanner = new Scanner(System.in);
        //colocando as horas, minutos e segundos
        System.out.println("Digite as horas:");
        int horas = scanner.nextInt();
        System.out.println("Digite os minutos:");
        int minutos = scanner.nextInt();
        System.out.println("Digite os segundos:");
        int segundos = scanner.nextInt();
        //calculo das horas para segundos
        int totalSegundos1 = horas * 60 * 60;
        int totalSegundos2 = minutos * 60;
        int totalSegundos3 = totalSegundos1 + totalSegundos2 + segundos;
        //Mandando o resultado
        System.out.println("O total de segundos ocorrido foi:" + totalSegundos3);
        //fechando o scanner
        scanner.close();
    }
}
