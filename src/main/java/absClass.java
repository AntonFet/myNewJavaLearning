import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class absClass {
    public static void main(String[] args) throws IOException {

        System.out.println("Введите x:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        System.out.println("результат: " + abs(x));

    }
    public static int abs(int x) {
        return x >= 0 ? x : x * -1;
    }
}
