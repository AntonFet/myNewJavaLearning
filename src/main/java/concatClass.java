import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class concatClass {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите размер массива 1: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arr_size1 = 0;
        try {
            arr_size1 = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Не валидное число. Ведите валидное.");
            return;
        }
        int[] arr1 = new int[arr_size1];
        System.out.println("Введите элементы массива 1: ");
        for (int i = 0; i < arr_size1; i++) {
            try {
                arr1[i] = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Не валидное число. Ведите валидное.");
                return;
            }
        }
        System.out.println("Введите размер массива 2: ");
        int arr_size2 = 0;
        try {
            arr_size2 = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Не валидное число. Ведите валидное.");
            return;
        }
        int[] arr2 = new int[arr_size2];
        System.out.println("Введите элементы массива 2: ");
        for (int i = 0; i < arr_size2; i++) {
            try {
                arr2[i] = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Не валидное число. Ведите валидное.");
                return;
            }
        }
        int[] mergedArray = concat(arr1, arr2);
        System.out.println("Результат: ");
        for (int value : mergedArray) {
            System.out.print(value + " ");
        }
    }
    public static int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        return result;
    }
}
