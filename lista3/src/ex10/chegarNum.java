package ex10;

import java.util.Scanner;

public class chegarNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número, não podendo ser 0:");
        int num = scanner.nextInt();
        while (num > 0 || num < 0){
            for (int i = 1; i <= Math.abs(num); i++){
                if (i == Math.abs(num)){
                    System.out.println(num + " x " + i + " = " + (num * i) + "\n");
                }else {
                    System.out.println(num + " x " + i + " = " + (num * i));
                }
            }
            System.out.println("Entre com um número, não podendo ser 0:");
            num = scanner.nextInt();
        }
        System.out.println("voce saiu");
        scanner.close();
    }
}
