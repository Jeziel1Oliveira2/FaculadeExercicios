package ex8;

public class numPrimos {
    public static void main(String[] args) {
        int count = 0;
        int num = 101;

        while (count < 50) {
            if (primo(num)) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    public static boolean primo(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
