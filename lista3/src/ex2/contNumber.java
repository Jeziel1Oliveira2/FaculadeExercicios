package ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class contNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listDivisor5 = new ArrayList<Integer>();
        ArrayList listNaoDivide5 = new ArrayList();
        System.out.println("Caso queira entrar no programa digite o numero 1,\n" +
                " caso não queira digite qualquer outro numero.");
        int num = scanner.nextInt();

        while (num == 1) {
            System.out.println("Digite o seu primeiro número inteiro positivo: ");
            int numA = scanner.nextInt();
            if (numA < 0) {
                System.out.println("O número " + numA + " deve ser positivo.");
            } else {
                System.out.println("Digite o seu segundo número  inteiro positivo: ");
                int numB = scanner.nextInt();
                if (numB < 0) {
                    System.out.println("O número " + numB + " deve ser positivo.");
                } else {
                    int divisor5 = 0;
                    int soma = 0;
                    if (numB > numA) {
                        for (int i = numA; i <= numB; i++) {
                            if (i % 5 == 0) {
                                divisor5++;
                                listDivisor5.add(i);
                            } else {
                                listNaoDivide5.add(i);
                            }
                        }
                        for (Integer numero : listDivisor5) {
                            soma += numero;
                        }
                        System.out.println("Números divisiveis por 5: " + listDivisor5
                                + "\n e a sua soma é: " + soma);

                        System.out.println("Caso queira entrar no programa digite o numero 1,\n" +
                                "se não quer digite qualquer outro numero.");
                        num = scanner.nextInt();
                    }
                }
            }
        }
        System.out.println("Tu saiu do meu programa. Do programa que eu demorei muito tempo para conseguir \n" +
                "finalizar. Muito obrigado por não ajudar um pobre coitado programador.");
    }
}
