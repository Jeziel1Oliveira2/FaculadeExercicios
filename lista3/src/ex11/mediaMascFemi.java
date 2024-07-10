package ex11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mediaMascFemi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listaIdadeFemi = new ArrayList<>();
        List<Integer> listaIdadeMasc = new ArrayList<>();
        List<Integer> listaMediaGeral = new ArrayList<>();
        double media;

        System.out.println("Digite o sexo M para masculino e F para feminino.");
        String sexo = scanner.nextLine();
        while (sexo.equals("M") || sexo.equals("F")
                || sexo.equals("m") || sexo.equals("f")) {
            if (sexo.equals("M") || sexo.equals("m")){
                System.out.println("Digite a sua idade:");
                int idadeMasc = scanner.nextInt();
                listaIdadeMasc.add(idadeMasc);
                media = calcularMedia(listaIdadeMasc);
                System.out.println("media masculina " + media);
                listaMediaGeral.add(idadeMasc);

            } else if (sexo.equals("F") || sexo.equals("f")){
                System.out.println("Digite a sua idade:");
                int idadeFeminino = scanner.nextInt();
                listaIdadeFemi.add(idadeFeminino);
                media = calcularMedia(listaIdadeFemi);
                System.out.println("media feminina " + media);
                listaMediaGeral.add(idadeFeminino);
            }
            media = calcularMedia(listaMediaGeral);
            System.out.println("media geral " + media);
            System.out.println();
            System.out.println("Digite o sexo M para masculino e F para feminino.");
            sexo = scanner.nextLine();
        }
        scanner.close();
    }

    public static double calcularMedia (List<Integer> num){
        if (num.isEmpty()){
            return 0;
        }

        int soma = 0;

        for (int numero : num) {
            soma += numero;
        }

        double media = (double) soma / num.size();
        return media;
    }
}
