import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class makeDecisionClass {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите x:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Введите y:");
        int y = Integer.parseInt(reader.readLine());
        System.out.println("результат: " + makeDecision(x, y));
    }
    public static String makeDecision(int x, int y) {
        if (x > y) {
            return x + " > " + y;
        } else if (x < y) {
            return x + " < " + y;
        } else {
            return x + " = " + y;
        }
    }
}
