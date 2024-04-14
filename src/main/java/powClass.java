import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class powClass {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите x:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Введите y:");
        int y = Integer.parseInt(reader.readLine());
        System.out.println("результат: " + pow(x, y));
    }
    public static int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
}
