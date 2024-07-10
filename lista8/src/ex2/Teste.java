package ex2;

import ex2.contaUser.Conta;
import ex2.contaUser.ContaCorrente;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        //criando o Scanner
        Scanner scanner = new Scanner(System.in);

        //criando o usuario e sua conta
        ContaCorrente c1 = new ContaCorrente("001", "titularCC1", 1000, 500);

        System.out.println("deseja entrar no progrma? (digite entrar)");
        String entrar = scanner.nextLine();

        //verificando se a palavra esta correta
        while (entrar.equals("entrar")) {
            //lista de opções
            System.out.println("\nEscolha uma dessas operações:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Mostrar dados da conta");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            //verificando qual opção irá fazer
            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    c1.depositarDinheiro(valorDeposito);
                    System.out.println("Depósito de R$" + valorDeposito + " realizado.");
                    break;

                case 2:
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    c1.sacarDinheiro(valorSaque);
                    System.out.println("Tentativa de saque de R$" + valorSaque);
                    break;

                case 3:
                    System.out.println(c1);
                    break;

                case 4:
                    //nao era o que eu queria mas foi um resultado aceitavel
                    System.out.println("Voce saiu do programa.");
                    entrar = scanner.nextLine();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
