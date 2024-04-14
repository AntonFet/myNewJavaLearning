import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reverseListNumsClass {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите x:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        System.out.println("результат: " + reverseListNums(x));
    }
    public static String reverseListNums(int x) {
        StringBuilder reversedNums = new StringBuilder();

        for (int i = x; i >= 0; i--) {
            reversedNums.append(i).append(" ");
        }
        return reversedNums.toString().trim();
    }
}
