import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pass;

        do {
            System.out.print("Введите пароль:");
            pass = scanner.nextInt();
        } while (pass != 1234);

        System.out.print("Ваш пароль:"+pass);
    }
}