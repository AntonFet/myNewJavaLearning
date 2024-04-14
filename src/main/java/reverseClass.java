import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reverseClass {

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
        reverse(arr);
        System.out.println("Результат:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
