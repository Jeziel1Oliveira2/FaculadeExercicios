package ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //criando o scanner
        Scanner scanner = new Scanner(System.in);
        //criando a variavel de PI
        float pi = 3.141592f;
        //lendo o raio
        System.out.println("Informe o raio do círculo: ");
        float raio = scanner.nextFloat();
        //calculando a área do circulo
        float area = pi * raio * raio;
        //mostrando o resultado
        System.out.println("A área do circulo é:" + String.format("%.2f", area));
    }
}
