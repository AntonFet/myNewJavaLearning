import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leftTriangleClass {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите число:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        leftTriangle(x);
    }

    public static void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
