import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class isDivisorClass {
    public static void main(String[] args) throws IOException {

        System.out.println("Введите a:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите b:");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Введите c:");
        int c = Integer.parseInt(reader.readLine());

        System.out.println("a=" + a + " " + "b=" + b + " " + " " + "c=" + c);
        System.out.println("результат: " + isEqual(a,b,c));
    }

    public static boolean isEqual(int a, int b, int c) {

       return (a == b & b == c);

    }
}
