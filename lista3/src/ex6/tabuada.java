package ex6;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gostaria de entrar nessa aplicação?");
        String aplicacao = scanner.nextLine();

        while (aplicacao.equals("sim") || aplicacao.equals("Sim") || aplicacao.equals("SIM")) {
            System.out.print("Digite um número (negativo para parar): ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("Número negativo fornecido estamos encerrando o programa.");
                break;
            }

            System.out.println("Tabuada do " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                if (i == 10){
                    System.out.println(numero + " x " + i + " = " + (numero * i) + "\n");
                }else {
                System.out.println(numero + " x " + i + " = " + (numero * i));
                }
            }
        }
    }
}
