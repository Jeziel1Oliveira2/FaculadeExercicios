package ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ex3.funcionario.*;

public class Teste {
    public static void main(String[] args) {
        //criando o Scanner
        Scanner scanner = new Scanner(System.in);

        //criando os empregados
        EmpregadoCLT emp1 = new EmpregadoCLT("João Silva", "123.456.789-00", 3000.00);
        EmpregadoComissionado emp2 = new EmpregadoComissionado("Maria Oliveira", "987.654.321-00", 20000.00, 0.10);
        EmpregadoHorista emp3 = new EmpregadoHorista("Carlos Souza", "456.789.123-00", 50.00, 40);

        //criando e adcionando na lista de empregados
        List<Empregado> empregados = new ArrayList<>();
        empregados.add(emp1);
        empregados.add(emp2);
        empregados.add(emp3);

        //isso quem fez foi o chatGPT, estava sem tempo, mas fez melhor que eu, me humilhou...
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma operação: ");
            System.out.println("1. Mostrar informações dos empregados");
            System.out.println("2. Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    for (int i = 0; i < empregados.size(); i++) {
                        Empregado empregado = empregados.get(i);
                        System.out.println("Empregado " + (i + 1) + ":");
                        System.out.println("Nome: " + empregado.getNome());
                        System.out.println("CPF: " + empregado.getCpf());
                        System.out.println("Rendimentos: R$" + empregado.rendimentos());
                        System.out.println("-------------------------");
                    }
                    break;
                case 2:
                    continuar = false;
                    //ha o chatGPT nao fez isso, sou muito bom ksksks
                    System.out.println("Voce saiu!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
