package ex7;

import java.util.Scanner;

public class Eleitores {
    public static void main(String[] args) {
        //criando o scanner
        Scanner scanner = new Scanner(System.in);
        //criando as entidades
        int votoBranco;
        int votoNulo;
        int votoValido;
        int numeroEleitor;
        //lendo os valores dasa entidades
        System.out.println("Digite a quantidade de eleitores");
        numeroEleitor = scanner.nextInt();
        System.out.println("Digite a quantidade de votos validos:");
        votoValido = scanner.nextInt();
        int numeroEleitorValido = numeroEleitor - votoValido;
        if (numeroEleitorValido < 0){
            System.out.println("O número de votos válidos é maior que o número de eleitores.");
            return;
        }
        System.out.println("Digite a quantidade de votos Brancos:");
        votoBranco = scanner.nextInt();
        int numeroVotoBranco = numeroEleitorValido - votoBranco;
        if (numeroVotoBranco < 0) {
            System.out.println("O número de votos em branco é maior que o número de eleitores");
            return;
        }
        System.out.println("Digite a quantidade de votos Nulos:");
        votoNulo = scanner.nextInt();
        int numeroVotoNulo = numeroVotoBranco - votoNulo;
        if (numeroVotoNulo < 0) {
            System.out.println("O número de votos nulos é maior que o número de eleitores");
            return;
        }
        //calculando o precentual de cada entidade
        double pVotoBranco1 = votoBranco * 100;
        double pVotoBranco2 = pVotoBranco1 /numeroEleitor;
        double pVotoNulo1 = votoNulo * 100;
        double pVotoNulo2 = pVotoNulo1 /numeroEleitor;
        double pVotoValido1 = votoValido * 100;
        double pVotoValido2 = pVotoValido1 /numeroEleitor;
        //mostrar as porsentagens de votos
        System.out.println("Sendo que existem " + numeroEleitor + " eleitores.");
        System.out.printf("%.2f%% dos eleitores tiveram seus votos validos.\n", pVotoValido2);
        System.out.printf("%.2f%% dos eleitores tiveram seus votos em branco.\n", pVotoBranco2);
        System.out.printf("%.2f%% dos eleitores tiveram seus votos nulos.\n", pVotoNulo2);
    }
}
