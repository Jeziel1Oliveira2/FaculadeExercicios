import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        //criando Scanner
        Scanner scanner = new Scanner(System.in);
        //criando os vetores
        int [] vetorX = new int [10];
        int [] vetorY = new int [10];

        //colocando elemntos no vetorX
        System.out.println("digite 10 numeros para colocar no vetorX:");
        for (int i = 0; i < vetorX.length; i++){
            vetorX[i] = scanner.nextInt();
        }
        //fazer o calculo e adicionar no vetor Y
        for (int i = 0; i < vetorY.length; i++){
            if (i % 2 == 0){
                vetorY[i] = vetorX[i] * 2;
            } else {
                vetorY[i] = vetorX[i] * 3;
            }
            //mostrar o vetorY
            System.out.println(vetorY[i]);
        }
    }
}
