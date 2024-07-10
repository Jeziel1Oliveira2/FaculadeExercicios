

public class ex4 {
    public static void main(String[] args) {
        // criando o vetor e usantos elemento ele vai ter
        int [] vetorA = {2, 3, 4, 5, 6, 7, 8, 9, 10, 25, 30, 40, 50, 85, 24, 33, 54, 33, 36, 39};
        //criar o For para ler e imprimir os 20 elementos do vetor
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }
        int par = 0;
        for (int i = 0; i < vetorA.length; i++) {
            //contando quantos pares tem nesse vetor
            if (vetorA[i] % 2 == 0) {
                par++;
            }
        }
        System.out.println("O numero de pares são: " + par);
    }
}
