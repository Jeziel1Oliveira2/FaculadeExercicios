public class ex3 {
    public static void main(String[] args) {
        //criando o vetor com 10 elementos
        int [] vetorB = new int [10];
        // colocando os elementos e verificando se são par ou impar
        for (int i = 0; i <= vetorB.length; i++) {
            if (i % 2 == 0) {
                vetorB[i] = 20;
                System.out.println(vetorB[i]);
            } else {
                vetorB[i] = 10;
                System.out.println(vetorB[i]);
            }
        }
    }
}
