import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class charToNumClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите символ:");
        char x = scanner.next().charAt(0);
        System.out.println("Результат: "+ charToNum(x));

    }
    public static int charToNum(char x) {

        return Integer.parseInt(String.valueOf(x));

    }
}
