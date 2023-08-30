package Lessons2;

import java.util.Random;
import java.util.Scanner;

    // Этот класс отвечает за игровой процесс
public class GuessNumber {

        public GuessNumber() {
        }

        public void GuessNumber (){

            private Random random;
            int number = random.nextInt(100) + 1;
            System.out.println("Я загадал число от 1 до 100. Попробуйте его угадать!");
            Scanner scanner = new Scanner(System.in);
            boolean guessed = false;

            while(!guessed) {
                System.out.print("Введите свое предположение: ");
                int guess = scanner.nextInt();
                if (guess == number) {
                    System.out.println("Вы угадали! Число было " + number);
                    guessed = true;
                } else if (guess > number) {
                    System.out.println("Число меньше вашего предположения. Попробуйте еще раз.");
                } else {
                    System.out.println("Число больше вашего предположения. Попробуйте еще раз");
                }
        }

    }

}

