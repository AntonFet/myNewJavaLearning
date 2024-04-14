import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class countPositiveClass {
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
        System.out.println("результат: " + countPositive(arr));
    }
    public static int countPositive(int[] arr) {
        int count = 0;

        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }
}
