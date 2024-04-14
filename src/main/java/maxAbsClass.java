import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class maxAbsClass {
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
        System.out.println("результат: " + maxAbs(arr));
    }
    public static int maxAbs(int[] arr) {
        int maxAbsValue = Math.abs(arr[0]); // Инициализируем максимальное значение как модуль первого элемента массива
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > maxAbsValue) {
                maxAbsValue = Math.abs(arr[i]);
            }
        }
        return maxAbsValue;
    }
}
