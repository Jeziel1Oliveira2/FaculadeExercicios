package ex4;

import java.util.Scanner;

public class berficacaoIgual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja entrar nessa aplicação?");
        String respota = scanner.nextLine();

        while(respota.equals("sim")){
            System.out.print("Digite o primeiro valor da dupla: ");
            int num1 = scanner.nextInt();
            System.out.print("Digite o segundo valor da dupla: ");
            int num2 = scanner.nextInt();

            if (num1 == num2) {
                System.out.println("Valores iguais fornecidos. Encerrando a repetição.");
                break;
            }
            if (num1 < num2) {
                System.out.println("Ordem crescente");
            } else {
                System.out.println("Ordem decrescente");
            }
        }
        System.out.println("Voce não entrou.");
        scanner.close();
    }
}
