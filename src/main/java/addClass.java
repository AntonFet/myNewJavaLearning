import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class addClass {
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
        System.out.println("Введите число x:");
        int x = Integer.parseInt(reader.readLine());
        System.out.println("Введите число pos:");
        int pos = Integer.parseInt(reader.readLine());
        System.out.println("Результат: ");
        int[] indexes = add(arr,x,pos);
        System.out.print("Результат: " + Arrays.toString(indexes) + " ");
    }
    public static int[] add(int[] arr, int x, int pos) {
        if (pos < 0 || pos > arr.length) {
            throw new IllegalArgumentException("Position is out of bounds");
        }
        int[] result = new int[arr.length + 1];
        for (int i = 0, j = 0; i < result.length; i++) {
            if (i == pos) {
                result[i] = x;
            } else {
                result[i] = arr[j];
                j++;
            }
        }
        return result;
    }
}
