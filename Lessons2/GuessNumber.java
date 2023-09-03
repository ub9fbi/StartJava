package Lessons2;

import java.util.Random;
import java.util.Scanner;

    // Этот класс отвечает за игровой процесс
public class GuessNumber {
        private Player player1;
        private Player player2;

        public GuessNumber(Player player1, Player player2) {
            this.player1 = player1;
            this.player2 = player2;
        }
        public void start() {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            int number = random.nextInt(100);

            while (true) {
                System.out.print(player1.getName() + ", " + "Введите число: ");
                int num = scanner.nextInt();
                    if (num == number) {
                        System.out.println(player1.getName() + " Вы угадали число было: " + number);
                        break;
                    } else if (number < num) {
                        System.out.println("Число меньше вашего предположения. Попробуйте еще раз.");
                    } else {
                        System.out.println("Число больше вашего предположения. Попробуйте еще раз");
                    }

                System.out.print(player2.getName() + ", " + " Введите число: ");
                num = scanner.nextInt();
                    if (num == number) {
                        System.out.println(player2.getName() + "Вы угадали число было: " + number);
                        break;
                    } else if (num > number) {
                        System.out.println("Число меньше вашего предположения. Попробуйте еще раз.");
                    } else {
                        System.out.println("Число больше вашего предположения. Попробуйте еще раз");
                    }
            }
        }
    }

