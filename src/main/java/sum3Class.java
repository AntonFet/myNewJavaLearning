import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sum3Class {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите x:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Введите y:");
        int y = Integer.parseInt(reader.readLine());
        System.out.println("Введите z:");
        int z = Integer.parseInt(reader.readLine());
        System.out.println("результат: " + sum3(x,y,z));
    }
    public static boolean sum3(int x, int y, int z) {
        return (x == y + z) || (y == x + z) || (z == x + y);
    }
}
