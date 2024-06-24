package ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class contNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList listaPar = new ArrayList();
        ArrayList listaImpar = new ArrayList();

        System.out.println("Digite um numero inteiro positivo ou -1 para sair: ");
        int num = scanner.nextInt();

while (num != -1){
            int TotalPar = 0;
            int TotalImpar = 0;
            int SomaPar = 0;
            int SomaImpar = 0;

            for (int i = 1; i <= num; i++){
                if (i % 2 == 0){
                    TotalPar++;
                    listaPar.add(i);
                    SomaPar += i;
                }
                else {
                    TotalImpar++;
                    listaImpar.add(i);
                    SomaImpar += i;
                }
            }
            System.out.println("Os números pares são: \n" + listaPar);
            System.out.println("Total de números par: " + TotalPar);
            System.out.println("Total de soma par: " + SomaPar);
            System.out.println("Os números impares são: \n" + listaImpar);
            System.out.println("Total de números impar: " + TotalImpar);
            System.out.println("Total de soma impar: " + SomaImpar);

    System.out.println("Digite um numero inteiro positivo ou -1 para sair: ");
    num = scanner.nextInt();
        }
        System.out.println("Tu saiu do meu programa.");
    }
}
