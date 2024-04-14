import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sumLastNumsClass {
    public static void main(String[] args) throws IOException {

        System.out.println("Введите число:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Результат сложения (2 последних знака): "+ sumLastNums(b));

    }
    public static int sumLastNums(int x) {

        return (((x / 10) % 10)) + (x % 10);

    }
}
