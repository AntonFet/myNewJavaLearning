import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lastNumSumClass {
    public static void main(String[] args) throws IOException {
        int result = lastNumSum(5, 11);
        System.out.println("5+11 это" + " " + result);
        result = lastNumSum(result, 123);
        System.out.println("6+123 это" + " " +result);
        result = lastNumSum(result, 14);
        System.out.println("9+14 это" + " " +result);
        result = lastNumSum(result, 1);
        System.out.println("13+1 это" + " " +result);
        System.out.println("Итого" + " " +result);
    }
    public static int lastNumSum(int a, int b) {
        return (a%10)+(b%10);
    }
}
