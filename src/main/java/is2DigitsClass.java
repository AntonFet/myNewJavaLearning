import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class is2DigitsClass {
    public static void main(String[] args) throws IOException {

        System.out.println("Введите число:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        if (x>0) {
            System.out.println("Результат: "+ is2Digits(x));
        }
        else
        {
            System.out.println("Число отрицательное ");
            System.exit(0);
        }
    }
    public static boolean is2Digits(int x) {

        return (x>9 & x<100);

    }
}
