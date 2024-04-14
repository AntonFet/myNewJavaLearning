import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class safeDivClass {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите x:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Введите y:");
        int y = Integer.parseInt(reader.readLine());
        System.out.println("результат: " + safeDiv(x, y));
    }
    public static int safeDiv(int x, int y) {
        if (y == 0) {
            return 0;
        }
        else
        {
            return x/y;
        }
    }
}
