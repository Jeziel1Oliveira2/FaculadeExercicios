package ex7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //criando o scanner
        Scanner scanner = new Scanner(System.in);
        //lendo as polegadas
        System.out.println("Quantas polegadas voce quer transformar em milimeitros?");
        float polegadas = scanner.nextFloat();
        //transformar polegadas em milimetros
        float mili = polegadas * 25.4f;
        //mostrando o resultado
        System.out.println("Tendo "+ polegadas + " voce tem " + String.format("%.1f", mili) + " milímitros");
        //fechando o scanner
        scanner.close();
    }
}
