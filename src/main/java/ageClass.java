import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ageClass {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите x:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        System.out.println("результат: " + age(x));
    }
    public static String age(int x) {
        if ((x % 10 == 1) && (x % 100 != 11)) {
            return x + " год";
        } else if ((x % 10 == 2 || x % 10 == 3 || x % 10 == 4) && (x % 100 != 12 && x % 100 != 13 && x % 100 != 14)) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }
}
