import java.util.Scanner;

public class isUpperCaseClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите символ:");
        char x = scanner.next().charAt(0);
        System.out.println("Результат: "+ isUpperCase(x));

    }
    public static boolean isUpperCase(char x) {

        if (!(x >= 'A' && x <= 'Z')) {
            return false;
        }
        return true;
    }

}
