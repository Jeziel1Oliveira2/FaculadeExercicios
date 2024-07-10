public class ex2 {
    public static void main(String[] args) {
        //criando o vetor com 10 elementos
        int [] vetorA = new int[10];
        //colocando os elemntos de 10 a 100 no vetor e imprimindo
        for (int i = 0; i < vetorA.length; i++) {
            if (i == 0) {
                vetorA[i] = 10;
                System.out.println(vetorA[i]);
            }
            else {
                vetorA[i] = i * 10 + 10;
                System.out.println(vetorA[i]);
            }
        }
    }
}
