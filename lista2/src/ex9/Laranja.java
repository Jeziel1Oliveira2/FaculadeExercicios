package ex9;

import java.util.Scanner;

public class Laranja {
    public static void main(String[] args) {
        //criando scanner
        Scanner scanner = new Scanner(System.in);
        //criando a entidade
        double meiaDuzia = 0.25;
        double menosMeiaDuzia = 0.30;
        int laranja;
        //pegando a quantidade de laranjas
        System.out.println("Digite quantas larajas você irá comprar:");
        laranja = scanner.nextInt();
        System.out.println("---------- Valor da compra ----------");
        if (laranja < 12){
            double preco1 = laranja * menosMeiaDuzia;
            System.out.println(laranja + " unidade(s) de laranja a R$" + menosMeiaDuzia + " a unidade = R$" + preco1);
        } else {
            double preco2 = laranja * meiaDuzia;
            System.out.println(laranja + " unidade(s) de laranja a R$" + meiaDuzia + " a unidade = R$" + preco2);
        }
        //fechando scanner
        scanner.close();
    }
}
