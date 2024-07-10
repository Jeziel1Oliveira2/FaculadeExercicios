import java.util.Arrays;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        //criando scanner
        Scanner scanner = new Scanner(System.in);
        //criando o vetor
        int [] vetorX = new int [10];

        //colocando os numeros no vetor
        System.out.println("Digite 10 numeros para colocar no vetor");
        for (int i = 0; i < vetorX.length; i++) {
            vetorX[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(vetorX));

        // Trocar elementos
        for (int i = 0; i < 5; i++){
            int x = vetorX[i];
            vetorX[i] = vetorX[i + 5];
            vetorX[i + 5] = x;
        }

        System.out.println("Vetor modificado \n" + Arrays.toString(vetorX));
    }
}
