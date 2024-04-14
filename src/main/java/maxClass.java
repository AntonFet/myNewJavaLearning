import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class maxClass {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите x:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Введите y:");
        int y = Integer.parseInt(reader.readLine());
        System.out.println("результат: " + max(x, y));
    }
    public static int max(int x, int y) {
        int c;
        if (x > y)
            c = x;
        else
            c = y;
        return c;
    }
}
