package ex9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //consumo médio de cada um
        int consumoMedioHomem = 650;
        int consumoMedioMulher = 420;
        int consumoMedioCrianca = 290;
        //Criando scanner
        Scanner scanner = new Scanner(System.in);
        //lendo as variaveis
        System.out.println("Digite o número de homens:");
        int homens = scanner.nextInt();
        System.out.println("Digite o número de mulheres:");
        int mulheres = scanner.nextInt();
        System.out.println("Digite o número de crianças:");
        int criancas = scanner.nextInt();
        //calculo das gramas médias consumidas]
        int consumoHomem = homens * consumoMedioHomem;
        int consumoMulher = mulheres * consumoMedioMulher;
        int consumocrianca = criancas * consumoMedioCrianca;
        int consumoTotalPessoas = consumoHomem + consumoMulher + consumocrianca;
        float consumoTotal = consumoTotalPessoas / 1000.0f;
        //mostrando o total consumido pelas pessoas
        System.out.println("Será necessário um total de: " + String.format("%.2f", consumoTotal) + "Kg de carne para o churrasco.");
    }
}
