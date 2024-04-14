import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class numLenCLass {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите x:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        System.out.println("результат: " + numLen(x));
    }
    public static int numLen(long x) {
        if(x == 0) {
            return 1;
        } else {
            return (int) Math.log10(Math.abs(x)) + 1;
        }
    }
}
