package ex10;

import java.util.ArrayList;
import java.util.Scanner;

public class Mercearia {
    public static void main(String[] args) {
        //criando scanner
        Scanner scanner = new Scanner(System.in);
        //criar o a lista de produtos
        ArrayList<String> listaProdutos = new ArrayList<>();
        listaProdutos.add("Banana");
        listaProdutos.add("Laranja");
        listaProdutos.add("Maca");
        listaProdutos.add("Kiwi");
        //criando a lista de precos
        //lista SEM desconto
        ArrayList<Double> listaPrecoSdesconto = new ArrayList<>();
        listaPrecoSdesconto.add(0.30);
        listaPrecoSdesconto.add(0.40);
        listaPrecoSdesconto.add(0.50);
        listaPrecoSdesconto.add(0.40);
        //lista COM desconto
        ArrayList<Double> listaPrecoCdesconto = new ArrayList<>();
        listaPrecoCdesconto.add(0.25);
        listaPrecoCdesconto.add(0.35);
        listaPrecoCdesconto.add(0.45);
        listaPrecoCdesconto.add(0.30);
        //mostrando a lista de produtos e preco
        System.out.println("--------- Lista de Produtos e Preços ---------\n");
        for (int i = 0; i < listaProdutos.size(); i++) {
            System.out.printf("%d. %s -> R$%.2f comprando menos que uma dúzia ou R$%.2f comprando uma dúzia ou mais\n",
                    i + 1, listaProdutos.get(i), listaPrecoSdesconto.get(i), listaPrecoCdesconto.get(i));
        }
        //pegando o produto do usuario
        System.out.println("Escolha o produto desejado:");
        int produto = scanner.nextInt();
        switch (produto){
            case 1:
            case 2:
            case 3:
            case 4:
                // pegando a quantidade que o usuario escolheu
                System.out.print("Digite a quantidade desejada: ");
                int quantidade = scanner.nextInt();
                // Calculando o valor da compra
                if(quantidade < 12){
                    double preco = listaPrecoSdesconto.get(produto - 1) * quantidade;
                    System.out.printf("%d unidade(s) de %s a %.2f a unidade = R$%.2f\n",
                            quantidade, listaProdutos.get(produto - 1), listaPrecoSdesconto.get(produto - 1), preco);
                } else {
                    double preco = listaPrecoCdesconto.get(produto - 1) * quantidade;
                    System.out.printf("%d unidade(s) de %s a %.2f a unidade = R$%.2f\n",
                            quantidade, listaProdutos.get(produto - 1), listaPrecoCdesconto.get(produto - 1), preco);
                }
                break;
            case -1:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}

