import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class isInRangeClass {
    public static void main(String[] args) throws IOException {

        System.out.println("Введите минимум:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите максимум:");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Введите число:");
        int num = Integer.parseInt(reader.readLine());
        System.out.println("a=" + a + " " + "b=" + b + " "+ "num=" + num);
        System.out.println("результат: " + isInRange(a,b,num));
    }

    public static boolean isInRange(int a, int b, int num) {

        return num >= a && num <= b;

    }
}
