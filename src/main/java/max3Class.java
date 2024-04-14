import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class max3Class {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите x:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Введите y:");
        int y = Integer.parseInt(reader.readLine());
        System.out.println("Введите z:");
        int z = Integer.parseInt(reader.readLine());
        System.out.println("результат: " + max3(x,y,z));
    }
    public static int max3(int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }
}
