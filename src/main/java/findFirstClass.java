import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class findFirstClass {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите размер массива: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arr_size = 0;
        try {
            arr_size = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Не валидное число. Ведите валидное.");
            return;
        }
        int[] arr = new int[arr_size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < arr_size; i++) {
            try {
                arr[i] = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Не валидное число. Ведите валидное.");
                return;
            }
        }
        System.out.println("Введите x:");
        int x = Integer.parseInt(reader.readLine());

        System.out.println("результат: " + findFirst(arr,x));
    }

    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}