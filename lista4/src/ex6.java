import java.util.Random;

public class ex6 {
    public static void main(String[] args) {
        //criando o Random
        Random rand = new Random();
        //criando o vetorA
        int [] vetorA = new int[30];

        //adicionando os elementos ao vetorA
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = rand.nextInt(101) - 50;
        }

        //mostando qual é a posição e o valor dos numeros positivos
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] > 0){
                System.out.println("Sua posição é " + i + " e o seu numero a é " + vetorA[i]);
            }
        }
    }
}
