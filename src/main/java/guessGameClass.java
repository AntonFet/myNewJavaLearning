import java.io.IOException;

public class guessGameClass {
    public static void main(String[] args) throws IOException {
        int randomNum = 3;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int attempts = 0;
        boolean guessed = false;
        while (!guessed) {
            System.out.println("What number am I thinking (0 to 9)? :");
            int x = sc.nextInt();
            attempts++;
            if (x != randomNum) {
                System.out.println("No, try again");
            } else {
                System.out.println("Yes, it`s " + randomNum);
                System.out.println("Number of attempts: " + attempts);
                guessed = true;
            }
        }
    }
}
