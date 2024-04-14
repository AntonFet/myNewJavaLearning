import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ciclesClass {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите десятичную дробь:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x = Double.parseDouble(reader.readLine());
        double s = Math.round (fraction(x) * 1000.0) / 1000.0;
        System.out.println("Дробная часть (3 знака после запятой): "+ s);
    }
    public static double fraction(double x) {
        return (x%1);
    }
}
