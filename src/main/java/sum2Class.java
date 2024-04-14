import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sum2Class {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите x:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Введите y:");
        int y = Integer.parseInt(reader.readLine());
        System.out.println("результат: " + sum2(x,y));
    }
    public static int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        } else {
            return sum;
        }
    }
}
