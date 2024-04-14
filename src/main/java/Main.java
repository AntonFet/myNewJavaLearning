import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int fileCount = 0;

        while (true) {
            System.out.println("Введите путь к файлу: ");
            String path = new Scanner(System.in).nextLine();

            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if (!fileExists || isDirectory) {
                System.out.println("Файл не существует или указанный путь ведет к папке, а не к файлу");
                continue;
            } else {
                fileCount++;
                System.out.println("Путь указан верно");
                System.out.println("Это файл номер " + fileCount);
            }
        }
    }
}
