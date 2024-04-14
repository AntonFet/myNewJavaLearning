import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class isPositiveClass {
    public static void main(String[] args) throws IOException {

        System.out.println("Введите число:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        System.out.println(" Результат: "+ isPositive(x));

    }
    public static boolean isPositive(int x) {

        return (x>0);

    }
}
