import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class magic6Class {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите x:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Введите x:");
        int y = Integer.parseInt(reader.readLine());
        System.out.println("результат: " + magic6(x,y));
    }
    public static boolean magic6(int x, int y) {
        return x == 6 || y == 6 || x + y == 6 || Math.abs(x - y) == 6;
    }
}