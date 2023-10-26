import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число");
        int value = new Scanner(System.in).nextInt();

        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                int e = 0;
                e = value / i;
                System.out.println(i + "*" + e);
            }
        }
    }
}