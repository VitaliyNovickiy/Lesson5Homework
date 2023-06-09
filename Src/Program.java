import java.util.Scanner;
import java.util.Random;

public class Program {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(11);
        int attempts = 0;
        int guess;

        System.out.println("Вітаю! Я загадав число від 0 до 10. Спробуйте відгадати.");

        while (true) {
            System.out.print("Введіть вашу догадку: ");
            guess = input.nextInt();
              attempts++;

            if (guess == secretNumber) {
                System.out.println("Вітаю! Ви відгадали число " + secretNumber + " з " + attempts + " спроби.");
                break;
            } else if (attempts >= 3) {
                System.out.println("Ви не вгадали. Правильне число було " + secretNumber + ".");
                break;
            } else {
                System.out.println("Неправильно! Спробуйте ще раз.");
            }
        }
    }
}
