import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class equalNumCLass {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите x:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        System.out.println("результат: " + equalNum(x));
    }

    public static boolean equalNum(int x) {
        int lastDigit = x % 10;
        x = x / 10;
        while (x != 0) {
            int currentDigit = x % 10;
            if (currentDigit != lastDigit) {
                return false;
            }
            x = x / 10;
        }
        return true;
    }
}