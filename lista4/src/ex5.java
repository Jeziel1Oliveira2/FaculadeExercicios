import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        //criando o scanner
        Scanner scanner = new Scanner(System.in);
        //criar os vetores A, B e C
        int [] vetorA = new int[10];
        int [] vetorB = new int[10];
        int [] vetorC = new int[10];

        //adicionando os numeros nos vetores A e B
        System.out.println("Digite 10 numeros para adicionar no vetorA");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("A[" + i + "]: ");
            vetorA[i] = scanner.nextInt();
        }
        System.out.println("Digite 10 numeros para adicionar no vetorB");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("B[" + i + "]: ");
            vetorB[i] = scanner.nextInt();
        }

        //calcular os numeros do mesmo indice do vetorA e do vetorB e armazenar no vetorC
        for (int i = 1; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] * vetorB[i];
        }

        //mostrar o resultadao do vetorC
        for (int i = 0; i < vetorC.length; i++) {
            System.out.println("vetorC[" + i + "]: " + vetorC[i]);
        }
    }
}
