package ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class calCrescimento {
    public static void main(String[] args) {

        int s = 0;
        ArrayList lista = new ArrayList();
        StringBuilder somaList = new StringBuilder();
        ArrayList list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        String entrada = "Gostaria de entra nessa aplicação?";
        System.out.println(entrada);
        String resposta = scanner.nextLine();

        while (resposta.equals("sim")){
            int soma = 0;
            list.clear();
            somaList.setLength(0);
            System.out.println("Digite um numero para podermos ver se ele é perfeito:");
            int num = scanner.nextInt();
            if (num < 1){
                System.out.println("O numero nao pode ser menor do que 1.");
            } else {
                for (int i = 1; i < num; i++){
                    if(num % i == 0){
                        list.add(i);
                        soma += i;
                        lista.add(soma);
                    }
                }
                //para colocar direitinho
                for (int i = 0; i < list.size(); i++){
                    somaList.append(list.get(i));
                    if (i < list.size() - 1) {
                        somaList.append(" + ");
                    }
                }
            }
            if (num != soma){
                System.out.println("O numero nao é perfe");
                System.out.println(soma);
            } else {
                System.out.println("O numero " + num + " é um número perfeito, pois a soma dos seus \n" +
                        "divisores é igual a ele.");
                somaList.append(" = ").append(soma);
                System.out.println(list);
                System.out.println(somaList.toString());
                System.out.println(soma);
            }

        }
     scanner.close();
    }
}
