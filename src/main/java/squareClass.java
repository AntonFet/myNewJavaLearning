import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class squareClass {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите число:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        square(x);
    }

    public static void square(int x) {


        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
